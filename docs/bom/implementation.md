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
        def teogorXenoglotBom = "1.0.0-alpha02"
        
        implementation "dev.teogor.xenoglot:xenoglot-atlas:$teogorXenoglotBom"
        implementation "dev.teogor.xenoglot:xenoglot-atlas-extended:$teogorXenoglotBom"
        implementation "dev.teogor.xenoglot:xenoglot-bom:$teogorXenoglotBom"
        implementation "dev.teogor.xenoglot:xenoglot-core:$teogorXenoglotBom"
        implementation "dev.teogor.xenoglot:xenoglot-locale:$teogorXenoglotBom"
        implementation "dev.teogor.xenoglot:xenoglot-pluralization:$teogorXenoglotBom"
    }
    ```

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
        val teogorXenoglotBom = "1.0.0-alpha02"
        
        implementation("dev.teogor.xenoglot:xenoglot-atlas:$teogorXenoglotBom")
        implementation("dev.teogor.xenoglot:xenoglot-atlas-extended:$teogorXenoglotBom")
        implementation("dev.teogor.xenoglot:xenoglot-bom:$teogorXenoglotBom")
        implementation("dev.teogor.xenoglot:xenoglot-core:$teogorXenoglotBom")
        implementation("dev.teogor.xenoglot:xenoglot-locale:$teogorXenoglotBom")
        implementation("dev.teogor.xenoglot:xenoglot-pluralization:$teogorXenoglotBom")
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
    teogor-xenoglot-bom = "1.0.0-alpha02"
    
    [libraries]
    teogor-xenoglot-bom = { group = "dev.teogor.xenoglot", name = "xenoglot-bom", version.ref = "teogor-xenoglot-bom" }
    teogor-xenoglot-atlas = { group = "dev.teogor.xenoglot", name = "xenoglot-atlas" }
    teogor-xenoglot-atlas-extended = { group = "dev.teogor.xenoglot", name = "xenoglot-atlas-extended" }
    teogor-xenoglot-core = { group = "dev.teogor.xenoglot", name = "xenoglot-core" }
    teogor-xenoglot-locale = { group = "dev.teogor.xenoglot", name = "xenoglot-locale" }
    teogor-xenoglot-pluralization = { group = "dev.teogor.xenoglot", name = "xenoglot-pluralization" }
    ```

=== "Module Based"

    ```toml title="gradle/libs.versions.toml"
    [versions]
    teogor-xenoglot-bom = "1.0.0-alpha02"
    
    [libraries]
    teogor-xenoglot-bom = { module = "dev.teogor.xenoglot:xenoglot-bom", version.ref = "teogor-xenoglot-bom" }
    teogor-xenoglot-atlas = { module = "dev.teogor.xenoglot:xenoglot-atlas" }
    teogor-xenoglot-atlas-extended = { module = "dev.teogor.xenoglot:xenoglot-atlas-extended" }
    teogor-xenoglot-core = { module = "dev.teogor.xenoglot:xenoglot-core" }
    teogor-xenoglot-locale = { module = "dev.teogor.xenoglot:xenoglot-locale" }
    teogor-xenoglot-pluralization = { module = "dev.teogor.xenoglot:xenoglot-pluralization" }
    ```

Then, add these dependencies in your app's `build.gradle` file:

=== "Groovy"

    ```groovy title="build.gradle"
    dependencies {
        implementation platform(libs.teogor.xenoglot.bom)
        implementation libs.teogor.xenoglot.atlas
        implementation libs.teogor.xenoglot.atlas.extended
        implementation libs.teogor.xenoglot.core
        implementation libs.teogor.xenoglot.locale
        implementation libs.teogor.xenoglot.pluralization
    }
    ```

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
        implementation(platform(libs.teogor.xenoglot.bom))
        implementation(libs.teogor.xenoglot.atlas)
        implementation(libs.teogor.xenoglot.atlas.extended)
        implementation(libs.teogor.xenoglot.core)
        implementation(libs.teogor.xenoglot.locale)
        implementation(libs.teogor.xenoglot.pluralization)
    }
    ```

[//]: # (REGION-DEPENDENCIES)

