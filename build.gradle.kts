import dev.teogor.winds.api.SonatypeHost
import dev.teogor.winds.api.ArtifactIdFormat
import dev.teogor.winds.api.License
import dev.teogor.winds.api.NameFormat
import dev.teogor.winds.api.Person
import dev.teogor.winds.api.Scm
import dev.teogor.winds.api.TicketSystem
import dev.teogor.winds.ktx.createVersion
import dev.teogor.winds.ktx.person
import dev.teogor.winds.ktx.scm
import dev.teogor.winds.ktx.ticketSystem
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaPlugin

buildscript {
  repositories {
    google()
    mavenCentral()
  }
}

plugins {
  // Kotlin Suite
  alias(libs.plugins.jetbrains.kotlin.jvm) apply false
  alias(libs.plugins.jetbrains.kotlin.multiplatform) apply false
  alias(libs.plugins.jetbrains.kotlin.android) apply false
  alias(libs.plugins.jetbrains.kotlin.serialization) apply false

  // Android Tools
  alias(libs.plugins.android.library) apply false

  alias(libs.plugins.teogor.winds) apply true

  alias(libs.plugins.vanniktech.maven) apply true
  alias(libs.plugins.jetbrains.dokka) apply true
  alias(libs.plugins.diffplug.spotless) apply true
  alias(libs.plugins.jetbrains.kotlinx.binary.compatibility) apply true

  alias(libs.plugins.ben.manes.versions) apply true
  alias(libs.plugins.littlerobots.version.catalog.update) apply true
}

winds {
  features {
    mavenPublishing = true
    docsGenerator = true
  }

  moduleMetadata {
    name = "Xenoglot"
    description = """
    |\uD83C\uDF0D Xenoglot seamlessly masters languages and locales, empowering developers to integrate multilingual capabilities into their applications with ease.
    """.trimMargin()
    yearCreated = 2023
    websiteUrl = "https://source.teogor.dev/xenoglot"
    apiDocsUrl = "$websiteUrl/html/"

    artifactDescriptor {
      group = "dev.teogor.xenoglot"
      name = "Xenoglot"
      artifactIdFormat = ArtifactIdFormat.MODULE_NAME_ONLY
      nameFormat = NameFormat.FULL
      version = createVersion(1, 0, 0) {
        alphaRelease(2)
      }
    }

    // Providing SCM (Source Control Management)
    scm<Scm.GitLab> {
      owner = "teogor"
      repository = "xenoglot"
    }

    // Providing Ticket System
    ticketSystem<TicketSystem.GitHub> {
      owner = "teogor"
      repository = "xenoglot"
    }

    // Providing Licenses
    licensedUnder(License.Apache2())

    // Providing Persons
    person<Person.DeveloperContributor> {
      id = "teogor"
      name = "Teodor Grigor"
      email = "open-source@teogor.dev"
      url = "https://teogor.dev"
      roles = listOf("Code Owner", "Developer", "Designer", "Maintainer")
      timezone = "UTC+2"
      organization = "Teogor"
      organizationUrl = "https://github.com/teogor"
    }
  }

  publishing {
    enabled = false
    cascade = true
    enablePublicationSigning = true
    optInForVanniktechPlugin = true
    sonatypeHost = SonatypeHost.S01
  }

  documentationBuilder {
    htmlPath = "html/"
    markdownNewlineSeparator = "  "
  }
}

val ktlintVersion = "0.50.0"

val excludedProjects = listOf(
  project.name,
)

subprojects {
  if (!excludedProjects.contains(this.name)) {
    apply<com.diffplug.gradle.spotless.SpotlessPlugin>()
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
      kotlin {
        target("**/*.kt")
        targetExclude("**/build/**/*.kt")
        ktlint(ktlintVersion)
          .editorConfigOverride(
            mapOf(
              "ij_kotlin_allow_trailing_comma" to "true",
              // These rules were introduced in ktlint 0.46.0 and should not be
              // enabled without further discussion. They are disabled for now.
              // See: https://github.com/pinterest/ktlint/releases/tag/0.46.0
              "disabled_rules" to
                "filename," +
                "annotation,annotation-spacing," +
                "argument-list-wrapping," +
                "double-colon-spacing," +
                "enum-entry-name-case," +
                "multiline-if-else," +
                "no-empty-first-line-in-method-block," +
                "package-name," +
                "trailing-comma," +
                "spacing-around-angle-brackets," +
                "spacing-between-declarations-with-annotations," +
                "spacing-between-declarations-with-comments," +
                "unary-op-spacing," +
                "no-trailing-spaces," +
                "no-wildcard-imports," +
                "max-line-length",
            ),
          )
        licenseHeaderFile(rootProject.file("spotless/copyright.kt"))
        trimTrailingWhitespace()
        endWithNewline()
      }
      format("kts") {
        target("**/*.kts")
        targetExclude("**/build/**/*.kts")
        // Look for the first line that doesn't have a block comment (assumed to be the license)
        licenseHeaderFile(rootProject.file("spotless/copyright.kts"), "(^(?![\\/ ]\\*).*$)")
      }
      format("xml") {
        target("**/*.xml")
        targetExclude("**/build/**/*.xml")
        // Look for the first XML tag that isn't a comment (<!--) or the xml declaration (<?xml)
        licenseHeaderFile(rootProject.file("spotless/copyright.xml"), "(<[^!?])")
      }
    }
  }
}

apiValidation {
  /**
   * Subprojects that are excluded from API validation
   */
  ignoredProjects.addAll(excludedProjects)
}

subprojects {
  if (!excludedProjects.contains(project.name)) {
    apply<DokkaPlugin>()
    tasks.withType<DokkaMultiModuleTask>().configureEach {
      moduleName.set(project.name)
      moduleVersion.set(project.version.toString())
      outputDirectory.set(rootProject.projectDir.resolve("docs/dokka"))
      failOnWarning.set(false)
      suppressObviousFunctions.set(true)
      suppressInheritedMembers.set(false)
      offlineMode.set(false)
    }
  }
}

versionCatalogUpdate {
  keep {
    // keep versions without any library or plugin reference
    keepUnusedVersions = true
    // keep all libraries that aren't used in the project
    keepUnusedLibraries = true
    // keep all plugins that aren't used in the project
    keepUnusedPlugins = true
  }
}
