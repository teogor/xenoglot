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

import kotlinx.serialization.Serializable

/**
 * Represents the translation of a country name into a specific language.
 *
 * @property code The ISO 3166-1 alpha-2 code of the country.
 * @property language The ISO 639-1 code of the language.
 * @property country The name of the country in the specified language.
 */
@Serializable
data class CountryLocalization(
  val code: String,
  val language: String,
  val country: String,
)
