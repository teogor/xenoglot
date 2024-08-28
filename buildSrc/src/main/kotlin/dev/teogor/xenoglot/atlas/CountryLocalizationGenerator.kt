package dev.teogor.xenoglot.atlas

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import kotlinx.serialization.Serializable
import java.io.File
import java.util.Locale

class CountryLocalizationGenerator {
  fun generateCode() {
    val outputDir = File("build/generated/xenoglot/gen2")
    prepareOutputDirectory(outputDir)

    val countryMappings = fetchCountryLanguageMappings()

    // For each language-country mapping, generate a separate JSON file and Kotlin source file
    countryMappings.forEach { (languageCode, languageCountries) ->
      // Generate Kotlin file for each language
      val codeBlock = createCountryMappingsCodeBlock(languageCountries)
      writeMappingsToFile(outputDir, languageCode, codeBlock)
    }

    // Generate the function to dynamically access the mappings based on language code
    generateLanguageCodeAccessor(outputDir)
  }

  private fun prepareOutputDirectory(directory: File) {
    if (directory.exists()) {
      directory.deleteRecursively()
    }
    directory.mkdirs()
  }

  private fun fetchCountryLanguageMappings(): List<Pair<String, List<CountryLocalization>>> {
    return getAllCountries().map { locale ->
      val languageCode = locale.language
      val languageCountries = getAllCountries().map { countryLocale ->
        CountryLocalization(
          code = countryLocale.country,
          language = countryLocale.getDisplayLanguage(locale),
          country = countryLocale.getDisplayCountry(locale),
        )
      }.filter { it.code.length == 2 }
      languageCode to languageCountries
    }.distinctBy { it.first }
      .sortedBy { it.first }
  }

  private fun createCountryMappingsCodeBlock(
    languageLocalizations: List<CountryLocalization>,
  ): CodeBlock {
    return CodeBlock.builder()
      .addStatement("listOf(")
      .apply {
        indent()
        languageLocalizations.forEach { countryInfo ->
          addStatement(
            "CountryLocalization(%S, %S, %S),",
            countryInfo.code.lowercase(),
            countryInfo.language,
            countryInfo.country,
          )
        }
        unindent()
      }
      .addStatement(")")
      .build()
  }

  private fun writeMappingsToFile(outputDir: File, languageCode: String, codeBlock: CodeBlock) {
    val fileSpec = FileSpec.builder(
      packageName = CodeGenerationConstants.EXTENDED_PACKAGE,
      fileName = "${CodeGenerationConstants.COUNTRY_LOCALIZATION_FILE_NAME_PREFIX}$languageCode",
    )
      .addProperty(
        PropertySpec.builder(
          "_countryLanguageMappings_$languageCode",
          List::class.parameterizedBy(CountryLocalization::class),
        )
          .addKdoc(
            """
                        |Holds the internal list of country-language mappings used for lookups within the package for language code $languageCode.
                        |
                        |This property contains a hardcoded list of [CountryLocalization] objects, each representing
                        |a country and its associated official languages. This list is used by [CountryLanguageRegistry]
                        |to provide access to country-language data and should not be modified directly.
                        |
                        |@see CountryLocalization
                        |@see CountryLanguageRegistry
                        """.trimMargin(),
          )
          .addModifiers(KModifier.INTERNAL)
          .initializer(codeBlock)
          .build(),
      )
      .build()

    fileSpec.writeTo(outputDir)
  }

  private fun getAllCountries(): List<Locale> {
    return Locale.getAvailableLocales()
      .asSequence()
      .filter { it.country.isNotBlank() && it.displayCountry.isNotBlank() }
      .distinctBy { it.country }
      .sortedBy { it.displayCountry }
      .toList()
  }

  // Generate a function that returns the appropriate _countryLanguageMappings_ based on the languageCode
  private fun generateLanguageCodeAccessor(outputDir: File) {
    val codeBlock = CodeBlock.builder()
      .beginControlFlow("val mappings = when (languageCode.lowercase())")
      .apply {
        // Dynamically generate cases for each language code
        getAllCountries()
          .sortedBy { it.language.lowercase() }
          .map { it.language.lowercase() }
          .distinct()
          .forEach { languageCode ->
            addStatement("\"$languageCode\" -> _countryLanguageMappings_$languageCode")
          }
      }
      .addStatement("else -> null")
      .endControlFlow()
      .addStatement("return mappings ?: throw LanguageCodeNotFoundException(languageCode.lowercase())")
      .build()

    val fileSpec = FileSpec.builder(
      packageName = CodeGenerationConstants.EXTENDED_PACKAGE,
      fileName = CodeGenerationConstants.LANGUAGE_CODE_ACCESSORS_FILE_NAME,
    )
      .addFunction(
        FunSpec.builder(
          "getCountryLocalizationsForLanguageCode",
        )
          .addCode(codeBlock)
          .addParameter("languageCode", String::class)
          .returns(
            List::class.parameterizedBy(CountryLocalization::class),
          )
          .addModifiers(KModifier.INTERNAL)
          .build(),
      )
      .build()

    fileSpec.writeTo(outputDir)
  }
}
