# BoM

[//]: # (REGION-DEPENDENCIES)

## Getting Started with BoM

**Adding Dependencies:**

* **Manual Setup:**  This section guides you through adding BoM dependencies directly to your project's `build.gradle` files. ([Link to Manual Dependency Setup Section](#adding-bom-dependencies-manually))
* **Version Catalog (Recommended):** For a more streamlined approach, consider integrating a version catalog. This allows for centralized version management and easier updates. ([Link to Version Catalog Section](#managing-bom-versions-with-version-catalog-recommended))

**Note:** If you prefer manual dependency setup, follow the instructions in the "Manual Setup" section. Otherwise, jump to the "Version Catalog" section for centralized management.

For information on using the KAPT plugin, see the [KAPT documentation](https://kotlinlang.org/docs/kapt.html).  
For information on using the KSP plugin, see the [KSP quick-start documentation](https://kotlinlang.org/docs/ksp-quickstart.html).  
For more information about dependencies, see [Add Build Dependencies](https://developer.android.com/studio/build/dependencies).  

### Adding BoM Dependencies Manually

To use BoM in your app, add the following dependencies to your app's `build.gradle` file:

=== "Groovy"

    ```groovy title="build.gradle"
    dependencies {
        def teogorXenoglotBom = "1.0.0-alpha01"
        
        implementation "dev.teogor.xenoglot:android:$teogorXenoglotBom"
        implementation "dev.teogor.xenoglot:bom:$teogorXenoglotBom"
        implementation "dev.teogor.xenoglot:core:$teogorXenoglotBom"
    }
    ```

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
        val teogorXenoglotBom = "1.0.0-alpha01"
        
        implementation("dev.teogor.xenoglot:android:$teogorXenoglotBom")
        implementation("dev.teogor.xenoglot:bom:$teogorXenoglotBom")
        implementation("dev.teogor.xenoglot:core:$teogorXenoglotBom")
    }
    ```

### Managing BoM Versions with Version Catalog (Recommended)

This section guides you through utilizing a version catalog for centralized management of BoM dependencies in your project. This approach simplifies updates and ensures consistency.

First, define the dependencies in the `libs.versions.toml` file:

- **Group-Name Based:** This approach is used for declaring libraries referenced by group and artifact name.
- **Module Based:** This approach is used for declaring libraries referenced by their module.

=== "Group-Name Based"

    ```toml title="gradle/libs.versions.toml"
    [versions]
    teogor-xenoglot-bom = "1.0.0-alpha01"
    
    [libraries]
    teogor-xenoglot-bom = { group = "dev.teogor.xenoglot", name = "bom", version.ref = "teogor-xenoglot-bom" }
    teogor-xenoglot-android = { group = "dev.teogor.xenoglot", name = "android" }
    teogor-xenoglot-core = { group = "dev.teogor.xenoglot", name = "core" }
    ```

=== "Module Based"

    ```toml title="gradle/libs.versions.toml"
    [versions]
    teogor-xenoglot-bom = "1.0.0-alpha01"
    
    [libraries]
    teogor-xenoglot-bom = { module = "dev.teogor.xenoglot:bom", version.ref = "teogor-xenoglot-bom" }
    teogor-xenoglot-android = { module = "dev.teogor.xenoglot:android" }
    teogor-xenoglot-core = { module = "dev.teogor.xenoglot:core" }
    ```

Then, add these dependencies in your app's `build.gradle` file:

=== "Groovy"

    ```groovy title="build.gradle"
    dependencies {
        implementation platform(libs.teogor.xenoglot.bom)
        implementation libs.teogor.xenoglot.android
        implementation libs.teogor.xenoglot.core
    }
    ```

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
        implementation(platform(libs.teogor.xenoglot.bom))
        implementation(libs.teogor.xenoglot.android)
        implementation(libs.teogor.xenoglot.core)
    }
    ```

[//]: # (REGION-DEPENDENCIES)

