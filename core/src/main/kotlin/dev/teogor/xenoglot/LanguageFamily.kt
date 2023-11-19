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
 * Represents a language family, a group of related languages sharing
 * a common ancestor.
 *
 * @see Language
 * @see Dialect
 */
interface LanguageFamily {

  /**
   * Retrieves the language tag representation of the language family.
   *
   * @return The language tag representing the language family.
   */
  val languageTag: String

  /**
   * Converts the language family to a `LanguageTag` object.
   *
   * @return The `LanguageTag` representation of the language family.
   */
  fun asLanguageTag(): LanguageTag
}
