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

package dev.teogor.xenoglot.pluralization

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PluralizationTemplatesTest {

  private val zeroTemplate = "No items"
  private val oneTemplate = "One item"
  private val twoTemplate = "Two items"
  private val fewTemplate = "%d items"
  private val manyTemplate = "%d items"
  private val otherTemplate = "%d items"

  private val templates = object : PluralizationTemplates {
    override val zeroTemplate: String = this@PluralizationTemplatesTest.zeroTemplate
    override val oneTemplate: String = this@PluralizationTemplatesTest.oneTemplate
    override val twoTemplate: String = this@PluralizationTemplatesTest.twoTemplate
    override val fewTemplate: String = this@PluralizationTemplatesTest.fewTemplate
    override val manyTemplate: String = this@PluralizationTemplatesTest.manyTemplate
    override val otherTemplate: String = this@PluralizationTemplatesTest.otherTemplate
  }

  @Test
  fun toRules_shouldGenerateCorrectRules() {
    val rules = templates.toRules()

    // Verify each rule's template
    val zeroRule = rules.find { it is ZeroRule } as ZeroRule
    val oneRule = rules.find { it is OneRule } as OneRule
    val twoRule = rules.find { it is TwoRule } as TwoRule
    val fewRule = rules.find { it is FewRule } as FewRule
    val manyRule = rules.find { it is ManyRule } as ManyRule
    val otherRule = rules.find { it is OtherRule } as OtherRule

    assertEquals(zeroTemplate, zeroRule.template, "ZeroRule template should match zeroTemplate.")
    assertEquals(oneTemplate, oneRule.template, "OneRule template should match oneTemplate.")
    assertEquals(twoTemplate, twoRule.template, "TwoRule template should match twoTemplate.")
    assertEquals(fewTemplate, fewRule.template, "FewRule template should match fewTemplate.")
    assertEquals(manyTemplate, manyRule.template, "ManyRule template should match manyTemplate.")
    assertEquals(
      otherTemplate,
      otherRule.template,
      "OtherRule template should match otherTemplate.",
    )
  }

  @Test
  fun toRules_shouldMatchCorrectlyBasedOnQuantity() {
    val rules = templates.toRules()

    // Test ZeroRule
    val zeroRule = rules.find { it is ZeroRule } as ZeroRule
    assertTrue(zeroRule.matches(0), "ZeroRule should match quantity 0.")
    assertFalse(zeroRule.matches(1), "ZeroRule should not match quantity 1.")
    assertFalse(zeroRule.matches(5), "ZeroRule should not match quantity 5.")
    assertFalse(zeroRule.matches(11), "ZeroRule should not match quantity 11.")

    // Test OneRule
    val oneRule = rules.find { it is OneRule } as OneRule
    assertTrue(oneRule.matches(1), "OneRule should match quantity 1.")
    assertFalse(oneRule.matches(0), "OneRule should not match quantity 0.")
    assertFalse(oneRule.matches(2), "OneRule should not match quantity 2.")
    assertFalse(oneRule.matches(5), "OneRule should not match quantity 5.")
    assertFalse(oneRule.matches(11), "OneRule should not match quantity 11.")

    // Test TwoRule
    val twoRule = rules.find { it is TwoRule } as TwoRule
    assertTrue(twoRule.matches(2), "TwoRule should match quantity 2.")
    assertFalse(twoRule.matches(0), "TwoRule should not match quantity 0.")
    assertFalse(twoRule.matches(1), "TwoRule should not match quantity 1.")
    assertFalse(twoRule.matches(5), "TwoRule should not match quantity 5.")
    assertFalse(twoRule.matches(11), "TwoRule should not match quantity 11.")

    // Test FewRule
    val fewRule = rules.find { it is FewRule } as FewRule
    for (i in 3..10) {
      assertTrue(fewRule.matches(i), "FewRule should match quantity $i.")
    }
    assertFalse(fewRule.matches(2), "FewRule should not match quantity 2.")
    assertFalse(fewRule.matches(11), "FewRule should not match quantity 11.")

    // Test ManyRule
    val manyRule = rules.find { it is ManyRule } as ManyRule
    assertTrue(manyRule.matches(11), "ManyRule should match quantity 11.")
    assertTrue(manyRule.matches(100), "ManyRule should match quantity 100.")
    assertFalse(manyRule.matches(10), "ManyRule should not match quantity 10.")
    assertFalse(manyRule.matches(5), "ManyRule should not match quantity 5.")

    // Test OtherRule
    val otherRule = rules.find { it is OtherRule } as OtherRule
    assertTrue(otherRule.matches(0), "OtherRule should match quantity 0.")
    assertTrue(otherRule.matches(1), "OtherRule should match quantity 1.")
    assertTrue(otherRule.matches(2), "OtherRule should match quantity 2.")
    assertTrue(otherRule.matches(5), "OtherRule should match quantity 5.")
    assertTrue(otherRule.matches(11), "OtherRule should match quantity 11.")
  }
}
