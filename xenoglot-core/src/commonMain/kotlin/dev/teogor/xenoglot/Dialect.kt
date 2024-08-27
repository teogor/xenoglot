/*
 * Copyright 2023 teogor (Teodor Grigor)
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

package dev.teogor.xenoglot

/**
 * Represents a dialect, a specific variation of a language spoken
 * in a particular country.
 *
 * @param country The country where the dialect is spoken.
 * @param language The language to which the dialect belongs.
 *
 * @see LanguageFamily
 */
data class Dialect(
  val country: Country,
  val language: Language,
) : LanguageFamily {

  /**
   * Retrieves the language tag representation of the dialect.
   *
   * @throws UnsupportedOperationException if the dialect's language and country
   * combination is not supported.
   *
   * @return The language tag of the dialect.
   */
  override val languageTag: String
    get() = asLanguageTag().tag

  /**
   * Converts the dialect to a `LanguageTag` object.
   *
   * @throws UnsupportedOperationException if the dialect's language and country
   * combination is not supported.
   *
   * @return The `LanguageTag` representation of the dialect.
   */
  override fun asLanguageTag(): LanguageTag {
    val languageCode = language.code
    val countryCode = country.code

    if (LanguageTerritory.isSpokenIn(languageCode, countryCode)) {
      return LanguageTag("$languageCode-$countryCode", this)
    }

    throw UnsupportedOperationException(
      "Dialect with language \"$languageCode\" and country \"$countryCode\" is not supported",
    )
  }
}
