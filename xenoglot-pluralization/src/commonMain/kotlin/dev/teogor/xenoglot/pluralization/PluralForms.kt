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
 * Represents a collection of pluralization rules for different quantities.
 *
 * This class uses a list of [PluralizationRule] instances to determine the appropriate string template
 * based on a given quantity. It allows for dynamic replacement of placeholders within the templates.
 *
 * @property rules A list of [PluralizationRule] instances defining the rules for various quantities.
 */
data class PluralForms(
  private val rules: List<PluralizationRule>,
) {
  /**
   * Retrieves the formatted string for a given quantity by applying the matching pluralization rule.
   *
   * This method searches through the list of rules to find the one that matches the specified quantity.
   * It then replaces the placeholder ("%d") in the matched rule's template with the actual quantity.
   * If no matching rule is found, this method throws a [NoSuchElementException].
   *
   * @param quantity The quantity used to select the appropriate pluralization rule. This value determines
   *                 which rule's template is applied. Common quantities include 0, 1, 2, and ranges such as 3-10.
   * @return The formatted string for the given quantity, with the placeholder replaced by the actual quantity.
   * @throws [NoSuchElementException] If no rule matches the specified quantity.
   */
  fun getQuantityString(quantity: Int): String {
    val rule = rules.first { it.matches(quantity) }
    return rule.template.replace("%d", quantity.toString())
  }

  /**
   * Retrieves the formatted string for a given quantity by applying the matching pluralization rule.
   *
   * This method searches through the list of rules to find the one that matches the specified quantity.
   * It then replaces the placeholder ("%d") in the matched rule's template with the actual quantity.
   * Returns `null` if no matching rule is found.
   *
   * @param quantity The quantity used to select the appropriate pluralization rule. This value determines
   *                 which rule's template is applied. Common quantities include 0, 1, 2, and ranges such as 3-10.
   * @return The formatted string for the given quantity, with the placeholder replaced by the actual quantity,
   *         or `null` if no rule matches the quantity.
   */
  fun getQuantityStringOrNull(quantity: Int): String? {
    val rule = rules.firstOrNull { it.matches(quantity) }
    return rule?.template?.replace("%d", quantity.toString())
  }

  /**
   * Retrieves the formatted string for a given quantity by applying the matching pluralization rule.
   *
   * This method searches through the list of rules to find the one that matches the specified quantity.
   * It then replaces the placeholder ("%d") in the matched rule's template with the actual quantity.
   * If no matching rule is found, a fallback value is returned.
   *
   * @param quantity The quantity used to select the appropriate pluralization rule. This value determines
   *                 which rule's template is applied. Common quantities include 0, 1, 2, and ranges such as 3-10.
   * @param fallback The fallback string to return if no rule matches the provided quantity. Defaults to "Unknown".
   * @return The formatted string for the given quantity, with the placeholder replaced by the actual quantity,
   *         or the fallback string if no rule matches the quantity.
   */
  fun getQuantityStringOrElse(quantity: Int, fallback: String = "Unknown"): String {
    val rule = rules.firstOrNull { it.matches(quantity) }
    return rule?.template?.replace("%d", quantity.toString()) ?: fallback
  }

  /**
   * Retrieves the formatted string for a given quantity by applying the matching pluralization rule.
   *
   * This method searches through the list of rules to find the one that matches the specified quantity.
   * It then replaces the placeholder ("%d") in the matched rule's template with the actual quantity.
   * Throws an exception if no matching rule is found.
   *
   * @param quantity The quantity used to select the appropriate pluralization rule. This value determines
   *                 which rule's template is applied. Common quantities include 0, 1, 2, and ranges such as 3-10.
   * @return The formatted string for the given quantity, with the placeholder replaced by the actual quantity.
   * @throws NoSuchElementException If no rule matches the specified quantity.
   */
  fun getQuantityStringOrThrow(quantity: Int): String {
    val rule = rules.firstOrNull { it.matches(quantity) } ?: throw NoSuchElementException(
      "No pluralization rule found for quantity: $quantity",
    )
    return rule.template.replace("%d", quantity.toString())
  }
}

/**
 * Creates an instance of [PluralForms] using the provided pluralization templates.
 *
 * This function utilizes [createPluralizationRules] to generate a list of [PluralizationRule] instances from the provided
 * template strings, and then constructs an instance of [PluralForms] with these rules.
 *
 * @param zeroTemplate The template string for the zero quantity rule.
 * @param oneTemplate The template string for the one quantity rule.
 * @param twoTemplate The template string for the two quantity rule.
 * @param fewTemplate The template string for the few quantity rule (3 to 10 inclusive).
 * @param manyTemplate The template string for the many quantity rule (greater than 10).
 * @param otherTemplate The template string for the other quantity rule (all other quantities).
 * @return An instance of [PluralForms] initialized with the generated pluralization rules.
 */
fun createPluralForms(
  zeroTemplate: String,
  oneTemplate: String,
  twoTemplate: String,
  fewTemplate: String,
  manyTemplate: String,
  otherTemplate: String,
): PluralForms {
  // Generate the list of PluralizationRule instances
  val rules = createPluralizationRules(
    zeroTemplate = zeroTemplate,
    oneTemplate = oneTemplate,
    twoTemplate = twoTemplate,
    fewTemplate = fewTemplate,
    manyTemplate = manyTemplate,
    otherTemplate = otherTemplate,
  )

  // Create and return an instance of PluralForms with the generated rules
  return PluralForms(rules)
}
