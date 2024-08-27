# Xenoglot

### Overview

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Maven Central](https://img.shields.io/maven-central/v/dev.teogor.xenoglot/bom.svg?label=Maven%20Central)](https://central.sonatype.com/search?q=g%3Adev.teogor.xenoglot+a%3Abom&smo=true)
[![Profile](https://source.teogor.dev/badges/teogor-github.svg)](https://github.com/teogor)
[![Open-Source Directory](https://source.teogor.dev/badges/teogor-dev.svg)](https://source.teogor.dev)

**Xenoglot: A Comprehensive Language Data Management Toolkit**

Xenoglot is a comprehensive library for representing, managing, and interacting with language data.
It provides a rich set of classes and interfaces for representing languages, dialects, scripts,
language families, and regions. The library also includes methods for obtaining language tags,
checking language usage patterns, and territorializing languages. Xenoglot is essential for any
project that requires accurate and consistent handling of language data.

**Key Features**

* **Comprehensive Language Representation:** Xenoglot provides a structured representation of
  languages, dialects, scripts, language families, and regions, enabling accurate and consistent
  handling of language data.

* **Language Tag Generation:** Xenoglot provides methods for generating language tags, facilitating
  interoperability with language-related protocols and standards.

* **Language Usage Analysis:** Xenoglot includes methods for checking language usage patterns,
  enabling informed decisions about language selection and content localization.

* **Language Territorialization:** Xenoglot provides functionality for territorializing languages,
  adapting them to specific geographical or political contexts.

**Kotlin Multiplatform Support**

Xenoglot is designed to work across various platforms through Kotlin Multiplatform, allowing you to use it in JVM, Android, JavaScript, iOS, macOS, Linux, tvOS, and watchOS environments. Here are some of the supported targets:

- **JVM**: Supports Java Virtual Machine with Kotlin configured for JDK 11.
- **Android**: Configured to publish all library variants.
- **JavaScript**: Supports WebAssembly (WASM) and JavaScript IR, including browser and Node.js environments, and generates TypeScript definitions.
- **iOS**: Supports iOS devices and simulators, including `iosX64`, `iosArm64`, and `iosSimulatorArm64`.
- **macOS**: Supports macOS with `macosX64` and `macosArm64`.
- **Linux**: Supports Linux with `linuxX64` and `linuxArm64`.
- **tvOS**: Supports tvOS devices and simulators, including `tvosX64`, `tvosArm64`, and `tvosSimulatorArm64`.
- **watchOS**: Supports watchOS devices and simulators, including `watchosX64`, `watchosArm32`, `watchosArm64`, `watchosDeviceArm64`, and `watchosSimulatorArm64`.

[//]: # (REGION-DEPENDENCIES)

## Getting Started with Xenoglot

**Adding Dependencies:**

* **Manual Setup:**  This section guides you through adding Xenoglot dependencies directly to your project's `build.gradle` files. ([Link to Manual Dependency Setup Section](#adding-xenoglot-dependencies-manually))
* **Version Catalog (Recommended):** For a more streamlined approach, consider integrating a version catalog. This allows for centralized version management and easier updates. ([Link to Version Catalog Section](#managing-xenoglot-versions-with-version-catalog-recommended))

**Note:** If you prefer manual dependency setup, follow the instructions in the "Manual Setup" section. Otherwise, jump to the "Version Catalog" section for centralized management.

For information on using the KAPT plugin, see the [KAPT documentation](https://kotlinlang.org/docs/kapt.html).
For information on using the KSP plugin, see the [KSP quick-start documentation](https://kotlinlang.org/docs/ksp-quickstart.html).
For more information about dependencies, see [Add Build Dependencies](https://developer.android.com/studio/build/dependencies).

### Adding Xenoglot Dependencies Manually

To use Xenoglot in your app, add the following dependencies to your app's `build.gradle` file:

=== "Groovy"

    ```groovy title="build.gradle"
    dependencies {
        def teogorXenoglot = "1.0.0-alpha01"

        implementation "dev.teogor.xenoglot:android:$teogorXenoglot"
        implementation "dev.teogor.xenoglot:bom:$teogorXenoglot"
        implementation "dev.teogor.xenoglot:core:$teogorXenoglot"
    }
    ```

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
        val teogorXenoglot = "1.0.0-alpha01"

        implementation("dev.teogor.xenoglot:android:$teogorXenoglot")
        implementation("dev.teogor.xenoglot:bom:$teogorXenoglot")
        implementation("dev.teogor.xenoglot:core:$teogorXenoglot")
    }
    ```

### Managing Xenoglot Versions with Version Catalog (Recommended)

This section guides you through utilizing a version catalog for centralized management of Xenoglot dependencies in your project. This approach simplifies updates and ensures consistency.

First, define the dependencies in the `libs.versions.toml` file:

- **Group-Name Based:** This approach is used for declaring libraries referenced by group and artifact name.
- **Module Based:** This approach is used for declaring libraries referenced by their module.

=== "Group-Name Based"

    ```toml title="gradle/libs.versions.toml"
    [versions]
    teogor-xenoglot = "1.0.0-alpha01"

    [libraries]
    teogor-xenoglot-android = { group = "dev.teogor.xenoglot", name = "android", version.ref = "teogor-xenoglot" }
    teogor-xenoglot-bom = { group = "dev.teogor.xenoglot", name = "bom", version.ref = "teogor-xenoglot" }
    teogor-xenoglot-core = { group = "dev.teogor.xenoglot", name = "core", version.ref = "teogor-xenoglot" }
    ```

=== "Module Based"

    ```toml title="gradle/libs.versions.toml"
    [versions]
    teogor-xenoglot = "1.0.0-alpha01"

    [libraries]
    teogor-xenoglot-android = { module = "dev.teogor.xenoglot:android", version.ref = "teogor-xenoglot" }
    teogor-xenoglot-bom = { module = "dev.teogor.xenoglot:bom", version.ref = "teogor-xenoglot" }
    teogor-xenoglot-core = { module = "dev.teogor.xenoglot:core", version.ref = "teogor-xenoglot" }
    ```

Then, add these dependencies in your app's `build.gradle` file:

=== "Groovy"

    ```groovy title="build.gradle"
    dependencies {
        implementation libs.teogor.xenoglot.android
        implementation libs.teogor.xenoglot.bom
        implementation libs.teogor.xenoglot.core
    }
    ```

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
        implementation(libs.teogor.xenoglot.android)
        implementation(libs.teogor.xenoglot.bom)
        implementation(libs.teogor.xenoglot.core)
    }
    ```

[//]: # (REGION-DEPENDENCIES)

## Usage

The following examples demonstrate how to use Xenoglot to represent and interact with language data:

### Retrieving Language Information

```kotlin
val language = Language.English
val languageTag = language.languageTag
val languageFamily = language.languageFamily
val isSpokenInRomania = language.isSpokenIn(Country.Romania)
```

### Checking Language Usage Patterns

```kotlin
val isDialect = Dialect("en-US", Language.English).isDialect
val isScriptUsedInLanguage = Script.Cyrillic.isWrittenIn(Language.Russian)
```

### Territorializing Languages

```kotlin
val dialect = Language.English.territorialize(Country.Australia)
val dialectLanguageTag = dialect.languageTag
val dialectCountryCode = dialect.country.code
```

## Benefits of Using Xenoglot

* **Improved Language Handling:** Xenoglot provides a consistent and structured approach to managing
  language data, reducing errors and inconsistencies.

* **Enhanced Interoperability:** Xenoglot facilitates interoperability with language-related
  protocols and standards, enabling seamless integration with external systems.

* **Simplified Language-Related Tasks:** Xenoglot streamlines language-related tasks, such as
  localization, translation, and language detection.

* **Promote Language-Aware Development:** Xenoglot encourages language-aware development practices,
  ensuring that language data is handled accurately and appropriately.

## Find this repository useful? 🩷

* Support it by joining __[stargazers](https://github.com/teogor/xenoglot/stargazers)__ for this
  repository. 📁
* Get notified about my new projects by __[following me](https://github.com/teogor)__ on GitHub. 💻
* Interested in sponsoring me? [Support me](sponsor.md) on GitHub! 🤝
