# Xenoglot

Learn more: **[User Guide](../user-guide.md)** and **[Code Samples](../code-samples.md)**

\uD83C\uDF0D Xenoglot seamlessly masters languages and locales, empowering developers to integrate multilingual capabilities into their applications with ease.

[//]: # (REGION-API-REFERENCE)

API Reference  
[`dev.teogor.xenoglot:xenoglot-*`](../html/)  
[`dev.teogor.xenoglot:xenoglot-atlas`](../html/xenoglot-atlas)  
[`dev.teogor.xenoglot:xenoglot-atlas-extended`](../html/xenoglot-atlas-extended)  
[`dev.teogor.xenoglot:xenoglot-core`](../html/xenoglot-core)  
[`dev.teogor.xenoglot:xenoglot-locale`](../html/xenoglot-locale)  
[`dev.teogor.xenoglot:xenoglot-pluralization`](../html/xenoglot-pluralization)

[//]: # (REGION-API-REFERENCE)

[//]: # (REGION-RELEASE-TABLE)

| Latest Update     |  Stable Release  |  Release Candidate  |  Beta Release  |  Alpha Release  |
|:------------------|:----------------:|:-------------------:|:--------------:|:---------------:|
| August 28, 2024   |        -         |          -          |       -        |  1.0.0-alpha02  |

[//]: # (REGION-RELEASE-TABLE)

[//]: # (REGION-DEPENDENCIES)

## Declaring dependencies

To use Xenoglot in your app, add the following dependencies to your app's `build.gradle` file:

=== "Groovy"

    ```groovy title="build.gradle"
    dependencies {
        def teogorXenoglot = "1.0.0-alpha02"
        
        implementation "dev.teogor.xenoglot:xenoglot-atlas:$teogorXenoglot"
        implementation "dev.teogor.xenoglot:xenoglot-atlas-extended:$teogorXenoglot"
        implementation "dev.teogor.xenoglot:xenoglot-core:$teogorXenoglot"
        implementation "dev.teogor.xenoglot:xenoglot-locale:$teogorXenoglot"
        implementation "dev.teogor.xenoglot:xenoglot-pluralization:$teogorXenoglot"
    }
    ```

=== "Kotlin"

    ```kotlin title="build.gradle.kts"
    dependencies {
        val teogorXenoglot = "1.0.0-alpha02"
        
        implementation("dev.teogor.xenoglot:xenoglot-atlas:$teogorXenoglot")
        implementation("dev.teogor.xenoglot:xenoglot-atlas-extended:$teogorXenoglot")
        implementation("dev.teogor.xenoglot:xenoglot-core:$teogorXenoglot")
        implementation("dev.teogor.xenoglot:xenoglot-locale:$teogorXenoglot")
        implementation("dev.teogor.xenoglot:xenoglot-pluralization:$teogorXenoglot")
    }
    ```

For comprehensive instructions on adding these dependencies, refer to the [Xenoglot documentation](../index.md#getting-started-with-xenoglot).

[//]: # (REGION-DEPENDENCIES)

[//]: # (REGION-FEEDBACK)

## Feedback

Your feedback helps make Xenoglot better. Let us know if you discover new issues or have
ideas for improving this library. Please take a look at the [existing issues on GitHub](https://github.com/teogor/xenoglot/issues)
for this library before you create a new one.

[Create a new issue](https://github.com/teogor/xenoglot/issues/new){ .md-button }

[//]: # (REGION-FEEDBACK)

[//]: # (REGION-VERSION-CHANGELOG)

### Version 1.0.0

#### Version 1.0.0-alpha02

August 28, 2024

[`dev.teogor.xenoglot:xenoglot-*:1.0.0-alpha02`](https://gitlab.com/teogor/xenoglot/releases/1.0.0-alpha02) is released. [Version 1.0.0-alpha02 contains these commits](https://gitlab.com/teogor/xenoglot/compare/1.0.0-alpha01...1.0.0-alpha02)

**Enhancement**

* Enhance Pluralization Support: Add PluralForms and Rule Implementations ([#7](https://github.com/teogor/xenoglot/issues/7)) by [@teogor](https://github.com/teogor)
* Migrate to Kotlin Multiplatform: Add support for JVM, JS, iOS, macOS, Linux, tvOS, and watchOS ([#6](https://github.com/teogor/xenoglot/issues/6)) by [@teogor](https://github.com/teogor)

**Documentation**

* Enhance Pluralization Support: Add PluralForms and Rule Implementations ([#7](https://github.com/teogor/xenoglot/issues/7)) by [@teogor](https://github.com/teogor)
* Migrate to Kotlin Multiplatform: Add support for JVM, JS, iOS, macOS, Linux, tvOS, and watchOS ([#6](https://github.com/teogor/xenoglot/issues/6)) by [@teogor](https://github.com/teogor)
* Introduce MkDocs for documentation generation ([#5](https://github.com/teogor/xenoglot/issues/5)) by [@teogor](https://github.com/teogor)

**Others**

* Enable Type-Safe Project Accessors for Project References ([#8](https://github.com/teogor/xenoglot/issues/8)) by [@teogor](https://github.com/teogor)

#### Version 1.0.0-alpha01

November 20, 2023

[`dev.teogor.xenoglot:xenoglot-*:1.0.0-alpha01`](https://gitlab.com/teogor/xenoglot/releases/1.0.0-alpha01) is released. [Version 1.0.0-alpha01 contains these commits](https://gitlab.com/teogor/xenoglot/commits/1.0.0-alpha01)

🎊 \*\*Initial Release\*\* 🎊

[//]: # (REGION-VERSION-CHANGELOG)

