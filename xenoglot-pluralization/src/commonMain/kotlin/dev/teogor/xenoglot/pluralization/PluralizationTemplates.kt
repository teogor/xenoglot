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

/**
 * Defines a set of pluralization templates for different quantities.
 *
 * Implementations of this interface should provide specific template strings for various pluralization rules.
 * Each template can contain a placeholder ("%d") for the quantity, which will be replaced with the actual
 * value when generating the pluralized string.
 */
interface PluralizationTemplates {
  /**
   * Template string to use when the quantity is zero.
   *
   * Example: "No items in stock."
   */
  val zeroTemplate: String

  /**
   * Template string to use when the quantity is exactly one.
   *
   * Example: "One item in stock."
   */
  val oneTemplate: String

  /**
   * Template string to use when the quantity is exactly two.
   *
   * Example: "Two items in stock."
   */
  val twoTemplate: String

  /**
   * Template string to use when the quantity is between 3 and 10 (inclusive).
   *
   * Example: "A few items in stock."
   */
  val fewTemplate: String

  /**
   * Template string to use when the quantity is greater than 10.
   *
   * Example: "Many items in stock."
   */
  val manyTemplate: String

  /**
   * Template string to use for any quantity not covered by other rules.
   *
   * Example: "%d items in stock."
   */
  val otherTemplate: String
}

/**
 * Converts a [PluralizationTemplates] instance into a list of [PluralizationRule] instances.
 *
 * This extension function generates specific [PluralizationRule] implementations for each of the templates
 * provided by the [PluralizationTemplates] instance. Each rule will match its corresponding quantity and
 * apply the associated template.
 *
 * @return A list of [PluralizationRule] instances created from the current [PluralizationTemplates] instance.
 */
internal fun PluralizationTemplates.toRules(): List<PluralizationRule> {
  return listOf(
    ZeroRule(zeroTemplate),
    OneRule(oneTemplate),
    TwoRule(twoTemplate),
    FewRule(fewTemplate),
    ManyRule(manyTemplate),
    OtherRule(otherTemplate),
  )
}
