/*
 * Copyright 2023 teogor (Teodor Grigor)
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

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
  alias(libs.plugins.jetbrains.kotlin.multiplatform)
  alias(libs.plugins.jetbrains.kotlin.serialization)
  alias(libs.plugins.android.library)
  alias(libs.plugins.teogor.winds)
}

winds {
  moduleMetadata {
    artifactDescriptor {
      name = "Pluralization"
    }
  }
}

kotlin {
  jvm {
    kotlin {
      jvmToolchain(11)
    }
  }

  androidTarget {
    publishAllLibraryVariants()
  }

  // Configure JavaScript (WASM and IR)
  @OptIn(ExperimentalWasmDsl::class)
  wasmJs {
    browser()
    nodejs()
    generateTypeScriptDefinitions()
  }

  js(IR) {
    browser()
    binaries.executable()
  }

  // Configure iOS targets
  iosX64()
  iosArm64()
  iosSimulatorArm64()

  // Configure macOS targets
  macosX64()
  macosArm64()

  // Configure Linux targets
  linuxX64()
  linuxArm64()

  // Configure tvOS targets
  tvosX64()
  tvosArm64()
  tvosSimulatorArm64()

  // Configure watchOS targets
  watchosX64()
  watchosArm32()
  watchosArm64()
  watchosDeviceArm64()
  watchosSimulatorArm64()

  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(libs.jetbrains.kotlinx.serialization.core)
        implementation(libs.jetbrains.kotlinx.serialization.json)
      }
    }
    val commonTest by getting {
      dependencies {
        implementation(libs.jetbrains.kotlin.test)
      }
    }
  }

  @OptIn(ExperimentalKotlinGradlePluginApi::class)
  compilerOptions {
    freeCompilerArgs.add("-Xexpect-actual-classes")
  }
}

android {
  namespace = "dev.teogor.xenoglot.pluralization"
  compileSdk = libs.versions.android.compileSdk.get().toInt()

  defaultConfig {
    minSdk = libs.versions.android.minSdk.get().toInt()
  }
}
