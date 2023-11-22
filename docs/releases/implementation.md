[//]: # (This file was automatically generated - do not edit)

## Implementation

### Latest Version

The latest release is [`1.0.0-alpha01`](../releases.md)

### BoM Releases

The BoM (Bill of Materials) is the central repository for managing library versions within the
Xenoglot project. It streamlines the process of tracking the latest versions of key components and
dependencies, ensuring that your project remains up-to-date and compatible with the latest
advancements.

Here's a summary of the latest BoM versions:

|    Version    |               Release Notes                | Release Date |
|:-------------:|:------------------------------------------:|:------------:|
| 1.0.0-alpha01 | [changelog 🔗](changelog/1.0.0-alpha01.md) | 18 Nov 2023 |

### Using Version Catalog

#### Declare Components

This catalog provides the implementation details of Xenoglot libraries, including Build of
Materials (BoM) and individual libraries, in TOML format.

=== "Default"

    ```toml title="gradle/libs.versions.toml"
    [versions]
    xenoglot-android = "1.0.0-alpha01"
    xenoglot-core = "1.0.0-alpha01"

    [libraries]
    xenoglot-android = { group = "dev.teogor.xenoglot", name = "android", version.ref = "xenoglot-android" }
    xenoglot-core = { group = "dev.teogor.xenoglot", name = "core", version.ref = "xenoglot-core" }
    ```

=== "Using BoM"

    ```toml title="gradle/libs.versions.toml"
    [versions]
    xenoglot-bom = "1.0.0-alpha01"

    [libraries]
    xenoglot-bom = { group = "dev.teogor.xenoglot", name = "bom", version.ref = "xenoglot-bom" }
    xenoglot-android = { group = "dev.teogor.xenoglot", name = "android" }
    xenoglot-core = { group = "dev.teogor.xenoglot", name = "core" }
    ```

#### Dependencies Implementation

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
      // When Using Xenoglot BoM
      implementation(platform(libs.xenoglot.bom))

      // Xenoglot Libraries
      implementation(libs.xenoglot.android)
      implementation(libs.xenoglot.core)
    }
    ```

=== "Groovy"

    ```groovy title="build.gradle"
    dependencies {
      // When Using Xenoglot BoM
      implementation platform(libs.xenoglot.bom)

      // Xenoglot Libraries
      implementation(libs.xenoglot.android)
      implementation(libs.xenoglot.core)
    }
    ```
