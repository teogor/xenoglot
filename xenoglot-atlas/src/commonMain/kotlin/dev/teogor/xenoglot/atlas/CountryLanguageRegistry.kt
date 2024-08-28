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

package dev.teogor.xenoglot.atlas

/**
 * Provides access to country-language mappings and related utility functions.
 *
 * This object contains a list of [CountryLanguageMapping] and provides methods to query and retrieve country-language information.
 */
public object CountryLanguageRegistry {

  /**
   * An immutable list of country-language mappings.
   *
   * This property holds the mappings between country codes and their official languages.
   */
  public val countryLanguageMappings: List<CountryLanguageMapping> = _countryLanguageMappings

  /**
   * Retrieves the list of official languages for a given country.
   *
   * @param countryCode The ISO 3166-1 alpha-2 code of the country.
   * @return A list of ISO 639-1 language codes if the country exists in the registry; otherwise, `null`.
   */
  public fun getLanguagesForCountry(countryCode: String): List<String>? {
    return countryLanguageMappings.find { it.countryCode == countryCode }?.languageCodes
  }

  /**
   * Retrieves a list of all country codes available in the registry.
   *
   * @return A list of ISO 3166-1 alpha-2 country codes.
   */
  public fun getAllCountryCodes(): List<String> {
    return countryLanguageMappings.map { it.countryCode }
  }

  /**
   * Checks if a given country code exists in the registry.
   *
   * @param countryCode The ISO 3166-1 alpha-2 code of the country.
   * @return `true` if the country code exists in the registry; otherwise, `false`.
   */
  public fun countryExists(countryCode: String): Boolean {
    return countryLanguageMappings.any { it.countryCode == countryCode }
  }

  /**
   * Retrieves the [CountryLanguageMapping] for a given country code.
   *
   * @param countryCode The ISO 3166-1 alpha-2 code of the country.
   * @return The [CountryLanguageMapping] for the country if it exists in the registry; otherwise, `null`.
   */
  public fun getCountryLanguageMapping(countryCode: String): CountryLanguageMapping? {
    return countryLanguageMappings.find { it.countryCode == countryCode }
  }
}
