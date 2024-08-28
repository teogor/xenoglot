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

import dev.teogor.xenoglot.Language

/**
 * Retrieves the localized display name of this language in another specified language.
 *
 * This function returns the display name of the language represented by this [Language] object,
 * localized in the specified [targetLanguage]. If the [targetLanguage] matches the current language,
 * the native name is returned.
 *
 * @param targetLanguage The [Language] in which the display name should be returned.
 * @return The localized display name of this language in the specified [targetLanguage].
 */
fun Language.getDisplayName(targetLanguage: Language): String = if (targetLanguage == this) {
  nativeName
} else {
  XenoglotLocale(this).getDisplayLanguage(XenoglotLocale(targetLanguage))
}

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
 * Retrieves the [XenoglotLocale] representation of the language.
 *
 * This property provides a [XenoglotLocale] object initialized with the current language.
 * It allows conversion of the `Language` to a locale representation, which can be used
 * for locale-specific operations and formatting.
 *
 * @return The [XenoglotLocale] object corresponding to the language.
 *
 * @see XenoglotLocale
 * @see Language
 */
val Language.locale: XenoglotLocale
  get() = XenoglotLocale(this)
