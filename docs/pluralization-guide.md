# Pluralization Support in Xenoglot

The `xenoglot-pluralization` module provides tools for handling plural forms of strings. This document
offers a comprehensive overview of how to utilize these features effectively.

## Creating Plural Forms

Use the `createPluralForms` function to define templates for various plural categories:

```kotlin
val pluralForms = createPluralForms(
    zeroTemplate = "No items",
    oneTemplate = "One item",
    twoTemplate = "Two items",
    fewTemplate = "%d items",
    manyTemplate = "%d items",
    otherTemplate = "%d items",
)
```

## Methods for Retrieving Quantity Strings

### `getQuantityString(quantity: Int)`

Returns the formatted string for the specified quantity. Uses the "other" template if the quantity
does not match any rule.

```kotlin
val result = pluralForms.getQuantityString(5)  // Example: "5 items"
```

### `getQuantityStringOrNull(quantity: Int)`

Returns the formatted string or `null` if the quantity is not handled.

```kotlin
val result = pluralForms.getQuantityStringOrNull(-1)  // Example: null
```

### `getQuantityStringOrElse(quantity: Int, fallback: String)`

Returns the formatted string or a fallback string if the quantity is not handled.

```kotlin
val result = pluralForms.getQuantityStringOrElse(-1, "Unknown")  // Example: "Unknown"
```

### `getQuantityStringOrThrow(quantity: Int)`

Returns the formatted string or throws an exception if the quantity is not handled.

```kotlin
val result = pluralForms.getQuantityStringOrThrow(1)  // Example: "One item"
```

## Example Usage

Here’s how you can use these methods in practice:

```kotlin
val pluralForms = createPluralForms(
    zeroTemplate = "No items",
    oneTemplate = "One item",
    twoTemplate = "Two items",
    fewTemplate = "%d items",
    manyTemplate = "%d items",
    otherTemplate = "%d items",
)

println(pluralForms.getQuantityString(0))  // Output: "No items"
println(pluralForms.getQuantityString(1))  // Output: "One item"
println(pluralForms.getQuantityString(2))  // Output: "Two items"
println(pluralForms.getQuantityString(5))  // Output: "5 items"
println(pluralForms.getQuantityString(11)) // Output: "11 items"

println(pluralForms.getQuantityStringOrNull(-1)) // Output: null
println(pluralForms.getQuantityStringOrElse(-1, "Unknown")) // Output: "Unknown"
```

This module helps in managing pluralized strings effectively, ensuring accurate representation
across different quantities.
