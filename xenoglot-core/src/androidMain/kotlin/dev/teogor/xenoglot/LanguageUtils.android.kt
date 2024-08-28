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

package dev.teogor.xenoglot

import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat

/**
 * Object that handles language settings and provides methods to change
 * the application language.
 */
object LanguageUtils {

  /**
   * Changes the application language based on the specified [Language] object.
   *
   * This function sets the application's language to the one represented by the provided
   * [Language] object. The `Language` object must have a valid `languageTag` which is used
   * internally to update the application's locale settings.
   *
   * @param language The [Language] object representing the desired language for the application.
   *                 The `languageTag` of this [Language] will be used to set the new language.
   */
  fun setAppLanguage(language: Language) {
    setAppLanguage(language.languageTag)
  }

  /**
   * Changes the application language based on the specified language tag.
   *
   * This function updates the application's language settings to the one specified by the
   * provided `languageTag`. The `languageTag` should follow the BCP 47 format (e.g., "en", "fr", "es-ES"),
   * which is used to set the locale for the application. The `AppCompatDelegate.setApplicationLocales`
   * method is used to apply the new language settings.
   *
   * @param languageTag The language tag representing the desired language for the application.
   *                    The tag should be in BCP 47 format (e.g., "en", "fr", "es-ES").
   */
  fun setAppLanguage(languageTag: String) {
    AppCompatDelegate.setApplicationLocales(
      LocaleListCompat.forLanguageTags(languageTag),
    )
  }
}
