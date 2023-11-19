## Libraries Implementation Version Catalog

This catalog provides the implementation details of Xenoglot libraries, including Build of Materials (BoM) and individual libraries, in TOML format.

```toml
[versions]
xenoglot-bom = "1.0.0-alpha01"

[libraries]
# Xenoglot BoM
xenoglot-bom = { group = "dev.teogor.xenoglot", name = "bom", version.ref = "xenoglot-bom" }
# Xenoglot Libraries
xenoglot-android = { group = "dev.teogor.xenoglot", name = "android" }
xenoglot-core = { group = "dev.teogor.xenoglot", name = "core" }
```

## Libraries Implementation build.gradle.kts File

This section presents the implementation dependencies for Xenoglot libraries in a Kotlin build.gradle.kts file format.

```kotlin
dependencies {
  // Xenoglot BoM
  implementation(platform(libs.xenoglot.bom))
  // Xenoglot Libraries
  implementation(libs.xenoglot.android)
  implementation(libs.xenoglot.core)
}
```

