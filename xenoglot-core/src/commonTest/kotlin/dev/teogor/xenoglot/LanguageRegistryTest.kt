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
import kotlin.test.assertNull
import kotlin.test.assertTrue

class LanguageRegistryTest {

  @Test
  fun getByCodeReturnsCorrectLanguage() {
    val af = LanguageRegistry.getByCode("af")
    assertEquals(Language.Afrikaans, af)

    val am = LanguageRegistry.getByCode("am")
    assertEquals(Language.Amharic, am)

    val xo = LanguageRegistry.getByCode("xo")
    assertNull(xo)
  }

  @Test
  fun getAllLanguagesIsNotEmpty() {
    val allLanguages = LanguageRegistry.getAllLanguages()
    assertTrue(allLanguages.isNotEmpty(), "The list of all languages should not be empty")
  }
}
