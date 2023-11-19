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

import java.util.Locale

/**
 * Type alias for the Java Locale class.
 */
typealias JavaLocale = Locale

/**
 * Extension function to get the display name of a language in another
 * language.
 *
 * @param language The language in which to display the name.
 *
 * @return The display name of the language in the specified language.
 */
infix fun Language.displayName(language: Language): String = getDisplayName(language)

/**
 * Extension function to check if a language is spoken in a particular
 * country.
 *
 * @param country The country to check.
 *
 * @return `true` if the language is spoken in the specified country,
 * `false` otherwise.
 */
infix fun Language.isSpokenIn(country: Country): Boolean = isSpokenIn(country)

/**
 * Extension function to check if a language is written in a particular
 * script.
 *
 * @param script The script to check.
 *
 * @return `true` if the language is written in the specified script,
 * `false` otherwise.
 */
infix fun Language.isWrittenIn(script: Script): Boolean = isWrittenIn(script)

/**
 * TODO: Implement logic to check if this language is translated into
 *  the provided language.
 * This function should verify if there exists a translation from this
 * language to the given language.
 */
infix fun Language.isTranslatedIn(language: Language): Boolean = false

/**
 * Extension function to create a `Dialect` object representing the
 * territorialized form of a language in a specific country.
 *
 * @param country The country where the dialect is spoken.
 *
 * @return The `Dialect` object representing the territorialized language.
 */
infix fun <L : Language, C : Country> L.territorialize(country: C): Dialect = Dialect(
  country = country,
  language = this,
)
