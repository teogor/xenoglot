/*
 * Copyright 2024 teogor (Teodor Grigor)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.teogor.xenoglot.locale

import dev.teogor.xenoglot.Country
import dev.teogor.xenoglot.Language
import dev.teogor.xenoglot.atlas.extended.ExtendedCountryLanguageRegistry

/**
 * Represents a locale with a specific language and optional country.
 *
 * This class provides methods to retrieve locale-specific information such as display names
 * and language tags. It also allows setting and getting default locales for different categories.
 *
 * @param language The [Language] associated with this locale.
 * @param country The optional [Country] associated with this locale.
 *
 * @see Language
 * @see Country
 */
class XenoglotLocale(
  val language: Language,
  val country: Country?,
) {
  /**
   * Constructs a [XenoglotLocale] with a language and no country.
   *
   * @param language The [Language] associated with this locale.
   */
  constructor(language: Language) : this(language, null)

  /**
   * Retrieves the display name of the language in the default display locale.
   *
   * @return The display name of the language.
   */
  fun getDisplayLanguage(): String {
    return getDisplayLanguage(getDefault(LocaleCategory.DISPLAY))
  }

  /**
   * Retrieves the display name of the language in the specified locale.
   *
   * @param inLocale The [XenoglotLocale] to use for localization.
   * @return The display name of the language in the specified locale.
   */
  fun getDisplayLanguage(inLocale: XenoglotLocale): String {
    val localizations = ExtendedCountryLanguageRegistry.getLocalizations(inLocale.language.code)
    return localizations.first { it.code == language.code }.language
  }

  /**
   * Retrieves the display name of the country in the default display locale.
   *
   * @return The display name of the country, or `null` if no country is specified.
   */
  fun getDisplayCountry(): String? {
    return getDisplayCountry(getDefault(LocaleCategory.DISPLAY))
  }

  /**
   * Retrieves the display name of the country in the specified locale.
   *
   * @param inLocale The [XenoglotLocale] to use for localization.
   * @return The display name of the country in the specified locale, or `null` if no country is specified.
   */
  fun getDisplayCountry(inLocale: XenoglotLocale): String? {
    if (country == null) return null

    val localizations = ExtendedCountryLanguageRegistry.getLocalizations(inLocale.language.code)
    return localizations.first { it.code == language.code }.country
  }

  /**
   * Retrieves the display name of the locale in the default display locale.
   *
   * @return The display name of the locale.
   */
  fun getDisplayName(): String {
    return getDisplayName(getDefault(LocaleCategory.DISPLAY))
  }

  /**
   * Retrieves the display name of the locale in the specified locale.
   *
   * @param inLocale The [XenoglotLocale] to use for localization.
   * @return The display name of the locale in the specified locale.
   */
  fun getDisplayName(inLocale: XenoglotLocale): String {
    val languageName = getDisplayLanguage(inLocale)
    val countryName = getDisplayCountry(inLocale)

    return buildString {
      append(languageName)
      if (countryName != null) {
        append(" ($countryName)")
      }
    }
  }

  /**
   * Returns a well-formed IETF BCP 47 language tag representing the locale.
   *
   * @return The language tag for the locale.
   */
  fun toLanguageTag(): String {
    return buildString {
      append(language.languageTag)
      if (country != null) {
        append("_${country.code.uppercase()}")
      }
    }
  }

  /**
   * Compares this locale to another object for equality.
   *
   * @param other The other object to compare with.
   * @return `true` if the locales are equal, `false` otherwise.
   */
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is XenoglotLocale) return false
    return this.language == other.language && this.country == other.country
  }

  /**
   * Returns a hash code for the locale.
   *
   * @return The hash code of the locale.
   */
  override fun hashCode(): Int {
    var result = language.hashCode()
    result = 31 * result + (country?.hashCode() ?: 0)
    return result
  }

  /**
   * Returns a string representation of the locale.
   *
   * @return A string describing the locale.
   */
  override fun toString(): String {
    return buildString {
      append(language.code)
      if (country != null) {
        append("_${country.code.uppercase()}")
      }
    }
  }

  companion object {
    private var defaultLocale: XenoglotLocale = XenoglotLocale(
      Language.English,
      Country.UnitedStates,
    )

    private val categoryDefaults: MutableMap<LocaleCategory, XenoglotLocale> = mutableMapOf(
      LocaleCategory.DISPLAY to defaultLocale,
      LocaleCategory.FORMAT to defaultLocale,
    )

    /**
     * Returns the default locale for the general case.
     *
     * @return The default locale.
     */
    fun getDefault(): XenoglotLocale {
      return defaultLocale
    }

    /**
     * Sets the default locale for the general case.
     *
     * @param newLocale The new default locale.
     */
    fun setDefault(newLocale: XenoglotLocale) {
      defaultLocale = newLocale
      categoryDefaults[LocaleCategory.DISPLAY] = newLocale
      categoryDefaults[LocaleCategory.FORMAT] = newLocale
    }

    /**
     * Gets the default locale for the specified category.
     *
     * @param category The [LocaleCategory] to get the default locale for.
     * @return The default locale for the specified category.
     */
    fun getDefault(category: LocaleCategory): XenoglotLocale {
      return categoryDefaults[category] ?: defaultLocale
    }

    /**
     * Sets the default locale for the specified category.
     *
     * @param category The [LocaleCategory] to set the default locale for.
     * @param newLocale The new default locale for the specified category.
     */
    fun setDefault(category: LocaleCategory, newLocale: XenoglotLocale) {
      categoryDefaults[category] = newLocale
    }
  }
}
