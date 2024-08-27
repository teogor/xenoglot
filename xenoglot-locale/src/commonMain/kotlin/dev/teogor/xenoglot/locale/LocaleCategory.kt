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

/**
 * Represents different categories of locales that can be used in locale-sensitive operations.
 *
 * This enum class defines categories for locale-based operations, which can be useful for specifying
 * the context in which a locale is used. Different categories may have different default locales
 * and formatting rules.
 *
 * The categories are:
 *
 * - [DISPLAY]: Used for operations related to displaying locale-specific information such as names
 *   of languages or countries.
 * - [FORMAT]: Used for operations related to formatting locale-specific data such as dates, numbers,
 *   or currencies.
 *
 * Examples of usage:
 *
 * - To get or set the default locale for display purposes, use the [DISPLAY] category.
 * - To get or set the default locale for formatting purposes, use the [FORMAT] category.
 *
 * @property DISPLAY Represents the locale category used for displaying locale-specific information.
 * @property FORMAT Represents the locale category used for formatting locale-specific data.
 */
enum class LocaleCategory {
  /**
   * Locale category used for displaying locale-specific information, such as names of languages,
   * countries, or other entities.
   */
  DISPLAY,

  /**
   * Locale category used for formatting locale-specific data, such as dates, numbers, or currencies.
   */
  FORMAT,
}
