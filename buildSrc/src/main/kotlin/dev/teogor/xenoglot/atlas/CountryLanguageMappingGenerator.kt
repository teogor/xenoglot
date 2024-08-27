package dev.teogor.xenoglot.atlas

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import java.io.File
import java.util.Locale

class CountryLanguageMappingGenerator {
  fun generateCountryLanguageMappings() {
    val outputDir = File("build/generated/xenoglot/beta")
    prepareOutputDirectory(outputDir)

    val countryMappings = fetchCountryLanguageMappings()

    val codeBlock = generateCountryMappingsCodeBlock(countryMappings)

    writeToFile(outputDir, codeBlock)
  }

  private fun prepareOutputDirectory(directory: File) {
    if (directory.exists()) {
      directory.deleteRecursively()
    }
    directory.mkdirs()
  }

  private fun fetchCountryLanguageMappings(): List<CountryLanguageMapping> {
    return getAllCountries().map { locale ->
      val countryCode = locale.country
      val officialLanguages = getOfficialLanguagesForCountry(countryCode)
      CountryLanguageMapping(
        countryCode = countryCode,
        languageCodes = officialLanguages,
      )
    }
  }

  private fun generateCountryMappingsCodeBlock(countryMappings: List<CountryLanguageMapping>): CodeBlock {
    return CodeBlock.builder()
      .addStatement("listOf(")
      .apply {
        indent()
        countryMappings.forEach { mapping ->
          val languages = mapping.languageCodes.joinToString { "%S" }
          addStatement(
            "CountryLanguageMapping(%S, listOf($languages)),",
            mapping.countryCode,
            *mapping.languageCodes.toTypedArray(),
          )
        }
        unindent()
      }
      .addStatement(")")
      .build()
  }

  private fun writeToFile(outputDir: File, codeBlock: CodeBlock) {
    val fileSpec = FileSpec.builder(
      packageName = "dev.teogor.xenoglot.atlas",
      fileName = "CountryLanguageMappings",
    )
      .addProperty(
        PropertySpec.builder(
          "_countryLanguageMappings",
          List::class.parameterizedBy(CountryLanguageMapping::class),
        )
          .addKdoc(
            """
            |Holds the internal list of country-language mappings used for lookups within the package.
            |
            |This property contains a hardcoded list of [CountryLanguageMapping] objects, each representing
            |a country and its associated official languages. This list is used by [CountryLanguageRegistry]
            |to provide access to country-language data and should not be modified directly.
            |
            |@see CountryLanguageMapping
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

  private fun getOfficialLanguagesForCountry(countryCode: String): List<String> {
    return Locale.getAvailableLocales()
      .asSequence()
      .filter { it.country == countryCode }
      .map { it.language }
      .distinct()
      .sorted()
      .toList()
  }
}
