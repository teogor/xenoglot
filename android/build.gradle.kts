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

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  id("dev.teogor.winds")
}

kotlin {
  jvmToolchain(17)
}

android {
  namespace = "dev.teogor.querent.common"

  compileSdk = 34

  defaultConfig {
    minSdk = 21
  }
}

dependencies {
  api(libs.androidx.appcompat)
}

winds {
  mavenPublish {
    displayName = "Android"
    name = "android"
  }
}
