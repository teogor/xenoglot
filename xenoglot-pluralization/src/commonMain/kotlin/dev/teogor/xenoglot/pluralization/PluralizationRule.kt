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
 * Defines a pluralization rule based on a quantity and provides a template string for that rule.
 *
 * Implementations of this interface should define how a quantity matches the rule and provide the corresponding
 * template string, which may contain placeholders for dynamic values.
 */
interface PluralizationRule {
  /**
   * Determines whether the rule matches a given quantity.
   *
   * Implementations should define the logic for matching a quantity to the rule. This could be based on specific
   * value ranges or other criteria.
   *
   * @param quantity The quantity to be evaluated against the rule.
   * @return True if the rule matches the given quantity; otherwise, false.
   */
  fun matches(quantity: Int): Boolean

  /**
   * The template string associated with this pluralization rule.
   *
   * The template may include a placeholder ("%d") for dynamic replacement with the actual quantity.
   *
   * Example: "There %d item in stock." for the singular form.
   */
  val template: String
}

/**
 * Creates a list of pluralization rules based on the provided templates.
 *
 * This function constructs an anonymous implementation of the [PluralizationTemplates] interface with the
 * provided template values, and then converts this implementation into a list of [PluralizationRule] instances.
 *
 * The generated rules will be used to determine the appropriate template string based on the quantity.
 *
 * @param zeroTemplate The template string for the zero quantity rule.
 * @param oneTemplate The template string for the one quantity rule.
 * @param twoTemplate The template string for the two quantity rule.
 * @param fewTemplate The template string for the few quantity rule (3 to 10 inclusive).
 * @param manyTemplate The template string for the many quantity rule (greater than 10).
 * @param otherTemplate The template string for the other quantity rule (all other quantities).
 * @return A list of [PluralizationRule] instances that use the provided templates for pluralization.
 */
fun createPluralizationRules(
  zeroTemplate: String,
  oneTemplate: String,
  twoTemplate: String,
  fewTemplate: String,
  manyTemplate: String,
  otherTemplate: String,
): List<PluralizationRule> {
  return object : PluralizationTemplates {
    override val zeroTemplate: String = zeroTemplate
    override val oneTemplate: String = oneTemplate
    override val twoTemplate: String = twoTemplate
    override val fewTemplate: String = fewTemplate
    override val manyTemplate: String = manyTemplate
    override val otherTemplate: String = otherTemplate
  }.toRules()
}

/**
 * A rule for pluralization that applies when the quantity is zero.
 *
 * @param template The template string to use for this rule. This string should contain a placeholder
 *                 ("%d") for the quantity.
 */
class ZeroRule(override val template: String) : PluralizationRule {
  /**
   * Determines if this rule matches the given quantity.
   *
   * @param quantity The quantity to check against this rule.
   * @return `true` if the quantity is zero; `false` otherwise.
   */
  override fun matches(quantity: Int) = quantity == 0
}

/**
 * A rule for pluralization that applies when the quantity is exactly one.
 *
 * @param template The template string to use for this rule. This string should contain a placeholder
 *                 ("%d") for the quantity.
 */
class OneRule(override val template: String) : PluralizationRule {
  /**
   * Determines if this rule matches the given quantity.
   *
   * @param quantity The quantity to check against this rule.
   * @return `true` if the quantity is one; `false` otherwise.
   */
  override fun matches(quantity: Int) = quantity == 1
}

/**
 * A rule for pluralization that applies when the quantity is exactly two.
 *
 * @param template The template string to use for this rule. This string should contain a placeholder
 *                 ("%d") for the quantity.
 */
class TwoRule(override val template: String) : PluralizationRule {
  /**
   * Determines if this rule matches the given quantity.
   *
   * @param quantity The quantity to check against this rule.
   * @return `true` if the quantity is two; `false` otherwise.
   */
  override fun matches(quantity: Int) = quantity == 2
}

/**
 * A rule for pluralization that applies when the quantity is between 3 and 10 (inclusive).
 *
 * @param template The template string to use for this rule. This string should contain a placeholder
 *                 ("%d") for the quantity.
 */
class FewRule(override val template: String) : PluralizationRule {
  /**
   * Determines if this rule matches the given quantity.
   *
   * @param quantity The quantity to check against this rule.
   * @return `true` if the quantity is between 3 and 10 (inclusive); `false` otherwise.
   */
  override fun matches(quantity: Int) = quantity in 3..10
}

/**
 * A rule for pluralization that applies when the quantity is greater than 10.
 *
 * @param template The template string to use for this rule. This string should contain a placeholder
 *                 ("%d") for the quantity.
 */
class ManyRule(override val template: String) : PluralizationRule {
  /**
   * Determines if this rule matches the given quantity.
   *
   * @param quantity The quantity to check against this rule.
   * @return `true` if the quantity is greater than 10; `false` otherwise.
   */
  override fun matches(quantity: Int) = quantity > 10
}

/**
 * A rule for pluralization that applies to any quantity not covered by other rules.
 *
 * @param template The template string to use for this rule. This string should contain a placeholder
 *                 ("%d") for the quantity.
 */
class OtherRule(override val template: String) : PluralizationRule {
  /**
   * Determines if this rule matches the given quantity.
   *
   * @param quantity The quantity to check against this rule.
   * @return `true` for any quantity; this rule matches all quantities not covered by other rules.
   */
  override fun matches(quantity: Int) = true
}
