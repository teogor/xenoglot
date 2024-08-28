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

class PluralFormsTest {

  private val zeroTemplate = "No items"
  private val oneTemplate = "One item"
  private val twoTemplate = "Two items"
  private val fewTemplate = "%d items"
  private val manyTemplate = "%d items"
  private val otherTemplate = "%d items"

  private val pluralForms = createPluralForms(
    zeroTemplate = zeroTemplate,
    oneTemplate = oneTemplate,
    twoTemplate = twoTemplate,
    fewTemplate = fewTemplate,
    manyTemplate = manyTemplate,
    otherTemplate = otherTemplate,
  )

  @Test
  fun getQuantityString_shouldReturnCorrectFormattedString() {
    assertEquals(
      "No items",
      pluralForms.getQuantityString(0),
      "The formatted string for quantity 0 should be 'No items'.",
    )
    assertEquals(
      "One item",
      pluralForms.getQuantityString(1),
      "The formatted string for quantity 1 should be 'One item'.",
    )
    assertEquals(
      "Two items",
      pluralForms.getQuantityString(2),
      "The formatted string for quantity 2 should be 'Two items'.",
    )
    assertEquals(
      "5 items",
      pluralForms.getQuantityString(5),
      "The formatted string for quantity 5 should be '5 items'.",
    )
    assertEquals(
      "11 items",
      pluralForms.getQuantityString(11),
      "The formatted string for quantity 11 should be '11 items'.",
    )
  }

  @Test
  fun getQuantityStringOrNull_shouldReturnCorrectFormattedStringOrNull() {
    assertEquals(
      "No items",
      pluralForms.getQuantityStringOrNull(0),
      "The formatted string for quantity 0 should be 'No items'.",
    )
    assertEquals(
      "One item",
      pluralForms.getQuantityStringOrNull(1),
      "The formatted string for quantity 1 should be 'One item'.",
    )
    assertEquals(
      "Two items",
      pluralForms.getQuantityStringOrNull(2),
      "The formatted string for quantity 2 should be 'Two items'.",
    )
    assertEquals(
      "5 items",
      pluralForms.getQuantityStringOrNull(5),
      "The formatted string for quantity 5 should be '5 items'.",
    )
    assertEquals(
      "11 items",
      pluralForms.getQuantityStringOrNull(11),
      "The formatted string for quantity 11 should be '11 items'.",
    )
    assertEquals(
      "-1 items",
      pluralForms.getQuantityStringOrNull(-1),
      "The formatted string for quantity -1 should be '-1 items'.",
    )
  }

  @Test
  fun getQuantityStringOrElse_shouldReturnCorrectFormattedStringOrFallback() {
    assertEquals(
      "No items",
      pluralForms.getQuantityStringOrElse(0),
      "The formatted string for quantity 0 should be 'No items'.",
    )
    assertEquals(
      "One item",
      pluralForms.getQuantityStringOrElse(1),
      "The formatted string for quantity 1 should be 'One item'.",
    )
    assertEquals(
      "Two items",
      pluralForms.getQuantityStringOrElse(2),
      "The formatted string for quantity 2 should be 'Two items'.",
    )
    assertEquals(
      "5 items",
      pluralForms.getQuantityStringOrElse(5),
      "The formatted string for quantity 5 should be '5 items'.",
    )
    assertEquals(
      "11 items",
      pluralForms.getQuantityStringOrElse(11),
      "The formatted string for quantity 11 should be '11 items'.",
    )
    assertEquals(
      "-1 items",
      pluralForms.getQuantityStringOrElse(-1),
      "The formatted string for quantity -1 should be '-1 items'.",
    )
  }

  @Test
  fun getQuantityStringOrThrow_shouldThrowExceptionForNoMatchingRule() {
    assertEquals(
      "No items",
      pluralForms.getQuantityStringOrThrow(0),
      "The formatted string for quantity 0 should be 'No items'.",
    )
    assertEquals(
      "One item",
      pluralForms.getQuantityStringOrThrow(1),
      "The formatted string for quantity 1 should be 'One item'.",
    )
    assertEquals(
      "Two items",
      pluralForms.getQuantityStringOrThrow(2),
      "The formatted string for quantity 2 should be 'Two items'.",
    )
    assertEquals(
      "5 items",
      pluralForms.getQuantityStringOrThrow(5),
      "The formatted string for quantity 5 should be '5 items'.",
    )
    assertEquals(
      "11 items",
      pluralForms.getQuantityStringOrThrow(11),
      "The formatted string for quantity 11 should be '11 items'.",
    )
    assertEquals(
      "-1 items",
      pluralForms.getQuantityStringOrThrow(-1),
      "The formatted string for quantity -1 should be '-1 items'.",
    )
  }

  @Test
  fun createPluralForms_shouldConstructPluralFormsCorrectly() {
    val pf = createPluralForms(
      zeroTemplate = "No items",
      oneTemplate = "One item",
      twoTemplate = "Two items",
      fewTemplate = "%d items",
      manyTemplate = "%d items",
      otherTemplate = "%d items",
    )

    assertEquals(
      "No items",
      pf.getQuantityString(0),
      "The formatted string for quantity 0 should be 'No items'.",
    )
    assertEquals(
      "One item",
      pf.getQuantityString(1),
      "The formatted string for quantity 1 should be 'One item'.",
    )
    assertEquals(
      "Two items",
      pf.getQuantityString(2),
      "The formatted string for quantity 2 should be 'Two items'.",
    )
    assertEquals(
      "5 items",
      pf.getQuantityString(5),
      "The formatted string for quantity 5 should be '5 items'.",
    )
    assertEquals(
      "11 items",
      pf.getQuantityString(11),
      "The formatted string for quantity 11 should be '11 items'.",
    )
  }
}
