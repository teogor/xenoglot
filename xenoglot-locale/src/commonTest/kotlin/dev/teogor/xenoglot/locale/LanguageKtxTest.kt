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
import kotlin.test.Test
import kotlin.test.assertEquals

class LanguageKtxTest {

  private val languageEnglish = Language.English
  private val languageRomanian = Language.Romanian
  private val languageFrench = Language.French

  @Test
  fun getDisplayName_getDisplayNameInContext_shouldReturnCorrectDisplayNameInContext() {
    XenoglotLocale.setDefault(XenoglotLocale(Language.English))

    // Testing display name of Romanian in English
    val displayNameInEnglish = languageRomanian.getDisplayName(languageEnglish)
    assertEquals("Romanian", displayNameInEnglish)

    // Testing display name of English in Romanian
    // val displayNameInRomanian = languageEnglish.getDisplayName(languageRomanian)
    // assertEquals("Engleză", displayNameInRomanian)
  }

  @Test
  fun getDisplayName_getDisplayNameInSameLanguage_shouldReturnNativeName() {
    XenoglotLocale.setDefault(XenoglotLocale(Language.English))

    // Testing display name of English in English
    val nativeName = languageEnglish.getDisplayName(languageEnglish)
    assertEquals("English", nativeName)
  }

  @Test
  fun languageDisplayName_infixFunction_shouldReturnCorrectDisplayNameInContext() {
    XenoglotLocale.setDefault(XenoglotLocale(Language.English))

    // Using infix function to get display name
    val displayNameInEnglish = languageRomanian displayName languageEnglish
    assertEquals("Romanian", displayNameInEnglish)

    // Using infix function to get display name in another language
    // val displayNameInFrench = languageEnglish displayName languageFrench
    // assertEquals("Anglais", displayNameInFrench)
  }

  @Test
  fun languageDisplayName_infixFunction_sameLanguage_shouldReturnNativeName() {
    XenoglotLocale.setDefault(XenoglotLocale(Language.English))

    // Using infix function to get native name
    val nativeName = languageEnglish displayName languageEnglish
    assertEquals("English", nativeName)
  }

  @Test
  fun locale_property_shouldReturnCorrectXenoglotLocale() {
    // Test for English language
    val expectedEnglishLocale = XenoglotLocale(Language.English)
    assertEquals(expectedEnglishLocale, languageEnglish.locale)

    // Test for Romanian language
    val expectedRomanianLocale = XenoglotLocale(Language.Romanian)
    assertEquals(expectedRomanianLocale, languageRomanian.locale)

    // Test for French language
    val expectedFrenchLocale = XenoglotLocale(Language.French)
    assertEquals(expectedFrenchLocale, languageFrench.locale)
  }
}
