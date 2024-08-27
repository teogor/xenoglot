/*
 * Copyright 2024 teogor (Teodor Grigor)
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

package dev.teogor.xenoglot.atlas.extended

import dev.teogor.xenoglot.atlas.CountryLocalization
import kotlin.String
import kotlin.collections.List

internal fun getCountryLocalizationsForLanguageCode(languageCode: String):
  List<CountryLocalization> {
  val mappings = when (languageCode.lowercase()) {
    "am" -> _countryLanguageMappings_am
    "ar" -> _countryLanguageMappings_ar
    "az" -> _countryLanguageMappings_az
    "bas" -> _countryLanguageMappings_bas
    "be" -> _countryLanguageMappings_be
    "bg" -> _countryLanguageMappings_bg
    "bn" -> _countryLanguageMappings_bn
    "bo" -> _countryLanguageMappings_bo
    "bs" -> _countryLanguageMappings_bs
    "ca" -> _countryLanguageMappings_ca
    "cs" -> _countryLanguageMappings_cs
    "de" -> _countryLanguageMappings_de
    "dsb" -> _countryLanguageMappings_dsb
    "dz" -> _countryLanguageMappings_dz
    "el" -> _countryLanguageMappings_el
    "en" -> _countryLanguageMappings_en
    "es" -> _countryLanguageMappings_es
    "et" -> _countryLanguageMappings_et
    "fa" -> _countryLanguageMappings_fa
    "fil" -> _countryLanguageMappings_fil
    "fo" -> _countryLanguageMappings_fo
    "fr" -> _countryLanguageMappings_fr
    "gsw" -> _countryLanguageMappings_gsw
    "gv" -> _countryLanguageMappings_gv
    "ha" -> _countryLanguageMappings_ha
    "hr" -> _countryLanguageMappings_hr
    "hu" -> _countryLanguageMappings_hu
    "hy" -> _countryLanguageMappings_hy
    "in" -> _countryLanguageMappings_in
    "is" -> _countryLanguageMappings_is
    "it" -> _countryLanguageMappings_it
    "ja" -> _countryLanguageMappings_ja
    "ji" -> _countryLanguageMappings_ji
    "kde" -> _countryLanguageMappings_kde
    "kea" -> _countryLanguageMappings_kea
    "kk" -> _countryLanguageMappings_kk
    "kl" -> _countryLanguageMappings_kl
    "km" -> _countryLanguageMappings_km
    "ko" -> _countryLanguageMappings_ko
    "lb" -> _countryLanguageMappings_lb
    "lkt" -> _countryLanguageMappings_lkt
    "ln" -> _countryLanguageMappings_ln
    "lo" -> _countryLanguageMappings_lo
    "lrc" -> _countryLanguageMappings_lrc
    "lt" -> _countryLanguageMappings_lt
    "lv" -> _countryLanguageMappings_lv
    "mfe" -> _countryLanguageMappings_mfe
    "mgh" -> _countryLanguageMappings_mgh
    "mn" -> _countryLanguageMappings_mn
    "ms" -> _countryLanguageMappings_ms
    "my" -> _countryLanguageMappings_my
    "nb" -> _countryLanguageMappings_nb
    "nd" -> _countryLanguageMappings_nd
    "ne" -> _countryLanguageMappings_ne
    "nl" -> _countryLanguageMappings_nl
    "nus" -> _countryLanguageMappings_nus
    "os" -> _countryLanguageMappings_os
    "pl" -> _countryLanguageMappings_pl
    "pt" -> _countryLanguageMappings_pt
    "qu" -> _countryLanguageMappings_qu
    "ro" -> _countryLanguageMappings_ro
    "ru" -> _countryLanguageMappings_ru
    "se" -> _countryLanguageMappings_se
    "sk" -> _countryLanguageMappings_sk
    "sl" -> _countryLanguageMappings_sl
    "so" -> _countryLanguageMappings_so
    "sq" -> _countryLanguageMappings_sq
    "sr" -> _countryLanguageMappings_sr
    "sv" -> _countryLanguageMappings_sv
    "sw" -> _countryLanguageMappings_sw
    "ta" -> _countryLanguageMappings_ta
    "tg" -> _countryLanguageMappings_tg
    "th" -> _countryLanguageMappings_th
    "ti" -> _countryLanguageMappings_ti
    "tk" -> _countryLanguageMappings_tk
    "to" -> _countryLanguageMappings_to
    "tr" -> _countryLanguageMappings_tr
    "tt" -> _countryLanguageMappings_tt
    "tzm" -> _countryLanguageMappings_tzm
    "uk" -> _countryLanguageMappings_uk
    "uz" -> _countryLanguageMappings_uz
    "vi" -> _countryLanguageMappings_vi
    "zh" -> _countryLanguageMappings_zh
    else -> null
  }
  return mappings ?: throw LanguageCodeNotFoundException(languageCode.lowercase())
}
