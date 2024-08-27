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

import dev.teogor.xenoglot.Country
import dev.teogor.xenoglot.Language
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class XenoglotLocaleTest {
  private val localeKorean = XenoglotLocale(Language.Korean)
  private val localeRomanianRomania = XenoglotLocale(Language.Romanian, Country.Romania)
  private val localeEnglishUS = XenoglotLocale(Language.English, Country.UnitedStates)

  @Test
  fun defaultLocale_getDefault_shouldReturnInitialDefault() {
    // Set default to ensure it's in the expected initial state
    XenoglotLocale.setDefault(localeEnglishUS)

    val defaultLocale = XenoglotLocale.getDefault()
    assertEquals(Language.English, defaultLocale.language)
    assertEquals(Country.UnitedStates, defaultLocale.country)
  }

  @Test
  fun defaultLocale_setDefault_shouldUpdateDefaultLocale() {
    XenoglotLocale.setDefault(localeKorean)

    val defaultLocale = XenoglotLocale.getDefault()
    assertEquals(localeKorean, defaultLocale)
  }

  @Test
  fun displayLanguage_getDisplayLanguage_shouldReturnCorrectLanguageName() {
    XenoglotLocale.setDefault(localeRomanianRomania)

    val locale = XenoglotLocale(Language.Romanian)
    assertEquals("română", locale.getDisplayLanguage())
  }

  @Test
  fun displayLanguage_getDisplayLanguageInContext_shouldReturnLanguageNameInContext() {
    val localeRo = XenoglotLocale(Language.Romanian)
    val localeEn = XenoglotLocale(Language.English)
    assertEquals("Romanian", localeRo.getDisplayLanguage(localeEn))
  }

  @Test
  fun displayCountry_getDisplayCountry_shouldReturnCorrectCountryName() {
    XenoglotLocale.setDefault(localeRomanianRomania)

    val localeRo = XenoglotLocale(Language.Romanian, Country.Romania)
    assertEquals("România", localeRo.getDisplayCountry())
  }

  @Test
  fun displayCountry_getDisplayCountryInContext_shouldReturnCountryNameInContext() {
    val localeRo = XenoglotLocale(Language.Romanian, Country.Romania)
    val localeEn = XenoglotLocale(Language.English)
    assertEquals("Romania", localeRo.getDisplayCountry(localeEn))
  }

  @Test
  fun displayName_getDisplayName_shouldReturnFormattedDisplayName() {
    XenoglotLocale.setDefault(localeRomanianRomania)

    val localeRo = XenoglotLocale(Language.Romanian, Country.Romania)
    assertEquals("română (România)", localeRo.getDisplayName())
  }

  @Test
  fun displayName_getDisplayNameInContext_shouldReturnDisplayNameInContext() {
    val localeRo = XenoglotLocale(Language.Romanian, Country.Romania)
    val localeEn = XenoglotLocale(Language.English)
    assertEquals("Romanian (Romania)", localeRo.getDisplayName(localeEn))
  }

  @Test
  fun languageTag_toLanguageTag_shouldReturnFormattedLanguageTag() {
    val localeRo = XenoglotLocale(Language.Romanian, Country.Romania)
    assertEquals("ro_RO", localeRo.toLanguageTag())
  }

  @Test
  fun equality_equalsAndHashCode_shouldBeConsistent() {
    val localeRo1 = XenoglotLocale(Language.Romanian, Country.Romania)
    val localeRo2 = XenoglotLocale(Language.Romanian, Country.Romania)
    val localeEnUK = XenoglotLocale(Language.English, Country.UnitedKingdom)

    assertEquals(localeRo1, localeRo2)
    assertNotEquals(localeRo1, localeEnUK)
    assertEquals(localeRo1.hashCode(), localeRo2.hashCode())
    assertNotEquals(localeRo1.hashCode(), localeEnUK.hashCode())
  }

  @Test
  fun stringRepresentation_toString_shouldReturnFormattedString() {
    val localeRo = XenoglotLocale(Language.Romanian, Country.Romania)
    assertEquals("ro_RO", localeRo.toString())
  }
}
