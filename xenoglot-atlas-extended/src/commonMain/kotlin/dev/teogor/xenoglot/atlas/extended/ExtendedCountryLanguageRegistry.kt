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

package dev.teogor.xenoglot.atlas.extended

import dev.teogor.xenoglot.atlas.CountryLanguageMapping
import dev.teogor.xenoglot.atlas.CountryLocalization

/**
 * Provides access to an extended set of country-language mappings, including additional languages.
 *
 * This object contains a list of [CountryLanguageMapping] from the extended module, allowing queries and retrieval of country-language information for more languages.
 */
public object ExtendedCountryLanguageRegistry {
  fun getLocalization(code: String): CountryLocalization {
    // Retrieve the country localizations for the language code
    val localizations = getCountryLocalizationsForLanguageCode(code)

    // Return the first CountryLocalization if available
    return localizations.firstOrNull {
      it.code == code
    } ?: throw Exception("Localization not found for code: $code")
  }

  fun getLocalizations(code: String): List<CountryLocalization> {
    // Retrieve the country localizations for the language code
    val localizations = getCountryLocalizationsForLanguageCode(code)

    // Return the first CountryLocalization if available
    return localizations
  }
}
