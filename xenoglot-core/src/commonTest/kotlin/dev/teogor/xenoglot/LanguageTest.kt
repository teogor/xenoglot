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

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LanguageTest {

  @Test
  fun languagePropertiesAreCorrect() {
    val af = Language.Afrikaans
    assertEquals("af", af.code)
    assertEquals("Afrikaans", af.name)
    assertEquals("Afrikaans", af.nativeName)

    val am = Language.Amharic
    assertEquals("am", am.code)
    assertEquals("Amharic", am.name)
    assertEquals("አማርኛ", am.nativeName)
  }

  @Test
  fun isSpokenInCountryReturnsTrueForKnownLanguages() {
    val af = Language.Afrikaans
    assertTrue { af.isSpokenIn(Country.SouthAfrica) }
    assertFalse { af.isSpokenIn(Country.UnitedStates) }

    val am = Language.Amharic
    assertTrue { am.isSpokenIn(Country.Ethiopia) }
    assertFalse { am.isSpokenIn(Country.UnitedStates) }
  }
}
