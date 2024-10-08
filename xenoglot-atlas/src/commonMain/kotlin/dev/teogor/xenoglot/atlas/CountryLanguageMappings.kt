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

package dev.teogor.xenoglot.atlas

import kotlin.collections.List

/**
 * Holds the internal list of country-language mappings used for lookups within the package.
 *
 * This property contains a hardcoded list of [CountryLanguageMapping] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLanguageMapping
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings: List<CountryLanguageMapping> = listOf(
  CountryLanguageMapping("AF", listOf("fa", "ps", "uz")),
  CountryLanguageMapping("AL", listOf("sq")),
  CountryLanguageMapping("DZ", listOf("ar", "fr", "kab")),
  CountryLanguageMapping("AS", listOf("en")),
  CountryLanguageMapping("AD", listOf("ca")),
  CountryLanguageMapping("AO", listOf("ln", "pt")),
  CountryLanguageMapping("AI", listOf("en")),
  CountryLanguageMapping("AG", listOf("en")),
  CountryLanguageMapping("AR", listOf("es")),
  CountryLanguageMapping("AM", listOf("hy")),
  CountryLanguageMapping("AW", listOf("nl")),
  CountryLanguageMapping("AU", listOf("en")),
  CountryLanguageMapping("AT", listOf("de", "en")),
  CountryLanguageMapping("AZ", listOf("az")),
  CountryLanguageMapping("BS", listOf("en")),
  CountryLanguageMapping("BH", listOf("ar")),
  CountryLanguageMapping("BD", listOf("bn", "ccp")),
  CountryLanguageMapping("BB", listOf("en")),
  CountryLanguageMapping("BY", listOf("be", "ru")),
  CountryLanguageMapping("BE", listOf("de", "en", "fr", "nl")),
  CountryLanguageMapping("BZ", listOf("en", "es")),
  CountryLanguageMapping("BJ", listOf("fr", "yo")),
  CountryLanguageMapping("BM", listOf("en")),
  CountryLanguageMapping("BT", listOf("dz")),
  CountryLanguageMapping("BO", listOf("es", "qu")),
  CountryLanguageMapping("BA", listOf("bs", "hr", "sr")),
  CountryLanguageMapping("BW", listOf("en")),
  CountryLanguageMapping("BR", listOf("es", "pt")),
  CountryLanguageMapping("IO", listOf("en")),
  CountryLanguageMapping("VG", listOf("en")),
  CountryLanguageMapping("BN", listOf("ms")),
  CountryLanguageMapping("BG", listOf("bg")),
  CountryLanguageMapping("BF", listOf("fr")),
  CountryLanguageMapping("BI", listOf("en", "fr", "rn")),
  CountryLanguageMapping("KH", listOf("km")),
  CountryLanguageMapping(
    "CM",
    listOf(
      "agq", "bas", "dua", "en", "ewo", "ff", "fr", "jgo", "kkj",
      "ksf", "mgo", "mua", "nmg", "nnh", "yav",
    ),
  ),
  CountryLanguageMapping("CA", listOf("en", "fr")),
  CountryLanguageMapping("IC", listOf("es")),
  CountryLanguageMapping("CV", listOf("kea", "pt")),
  CountryLanguageMapping("BQ", listOf("nl")),
  CountryLanguageMapping("KY", listOf("en")),
  CountryLanguageMapping("CF", listOf("fr", "ln", "sg")),
  CountryLanguageMapping("EA", listOf("es")),
  CountryLanguageMapping("TD", listOf("ar", "fr")),
  CountryLanguageMapping("CL", listOf("es")),
  CountryLanguageMapping("CN", listOf("bo", "ii", "ug", "yue", "zh")),
  CountryLanguageMapping("CX", listOf("en")),
  CountryLanguageMapping("CC", listOf("en")),
  CountryLanguageMapping("CO", listOf("es")),
  CountryLanguageMapping("KM", listOf("ar", "fr")),
  CountryLanguageMapping("CG", listOf("fr", "ln")),
  CountryLanguageMapping("CD", listOf("fr", "ln", "lu", "sw")),
  CountryLanguageMapping("CK", listOf("en")),
  CountryLanguageMapping("CR", listOf("es")),
  CountryLanguageMapping("HR", listOf("hr")),
  CountryLanguageMapping("CU", listOf("es")),
  CountryLanguageMapping("CW", listOf("nl")),
  CountryLanguageMapping("CY", listOf("el", "en", "tr")),
  CountryLanguageMapping("CZ", listOf("cs")),
  CountryLanguageMapping("CI", listOf("fr")),
  CountryLanguageMapping("DK", listOf("da", "en", "fo")),
  CountryLanguageMapping("DG", listOf("en")),
  CountryLanguageMapping("DJ", listOf("ar", "fr", "so")),
  CountryLanguageMapping("DM", listOf("en")),
  CountryLanguageMapping("DO", listOf("es")),
  CountryLanguageMapping("EC", listOf("es", "qu")),
  CountryLanguageMapping("EG", listOf("ar")),
  CountryLanguageMapping("SV", listOf("es")),
  CountryLanguageMapping("GQ", listOf("es", "fr", "pt")),
  CountryLanguageMapping("ER", listOf("ar", "en", "ti")),
  CountryLanguageMapping("EE", listOf("et")),
  CountryLanguageMapping("ET", listOf("am", "om", "so", "ti")),
  CountryLanguageMapping("150", listOf("en")),
  CountryLanguageMapping("FK", listOf("en")),
  CountryLanguageMapping("FO", listOf("fo")),
  CountryLanguageMapping("FJ", listOf("en")),
  CountryLanguageMapping("FI", listOf("en", "fi", "se", "smn", "sv")),
  CountryLanguageMapping("FR", listOf("br", "ca", "fr", "gsw")),
  CountryLanguageMapping("GF", listOf("fr")),
  CountryLanguageMapping("PF", listOf("fr")),
  CountryLanguageMapping("GA", listOf("fr")),
  CountryLanguageMapping("GM", listOf("en")),
  CountryLanguageMapping("GE", listOf("ka", "os")),
  CountryLanguageMapping("DE", listOf("de", "dsb", "en", "hsb", "ksh", "nds")),
  CountryLanguageMapping("GH", listOf("ak", "ee", "en", "ha")),
  CountryLanguageMapping("GI", listOf("en")),
  CountryLanguageMapping("GR", listOf("el")),
  CountryLanguageMapping("GL", listOf("da", "kl")),
  CountryLanguageMapping("GD", listOf("en")),
  CountryLanguageMapping("GP", listOf("fr")),
  CountryLanguageMapping("GU", listOf("en")),
  CountryLanguageMapping("GT", listOf("es")),
  CountryLanguageMapping("GG", listOf("en")),
  CountryLanguageMapping("GN", listOf("ff", "fr")),
  CountryLanguageMapping("GW", listOf("pt")),
  CountryLanguageMapping("GY", listOf("en")),
  CountryLanguageMapping("HT", listOf("fr")),
  CountryLanguageMapping("HN", listOf("es")),
  CountryLanguageMapping("HK", listOf("en", "yue", "zh")),
  CountryLanguageMapping("HU", listOf("hu")),
  CountryLanguageMapping("IS", listOf("is")),
  CountryLanguageMapping(
    "IN",
    listOf(
      "as", "bn", "bo", "brx", "ccp", "en", "gu", "hi", "kn", "kok",
      "ks", "ml", "mr", "ne", "or", "pa", "ta", "te", "ur",
    ),
  ),
  CountryLanguageMapping("ID", listOf("in")),
  CountryLanguageMapping("IR", listOf("ckb", "fa", "lrc", "mzn")),
  CountryLanguageMapping("IQ", listOf("ar", "ckb", "lrc")),
  CountryLanguageMapping("IE", listOf("en", "ga")),
  CountryLanguageMapping("IM", listOf("en", "gv")),
  CountryLanguageMapping("IL", listOf("ar", "en", "iw")),
  CountryLanguageMapping("IT", listOf("ca", "de", "fur", "it")),
  CountryLanguageMapping("JM", listOf("en")),
  CountryLanguageMapping("JP", listOf("ja")),
  CountryLanguageMapping("JE", listOf("en")),
  CountryLanguageMapping("JO", listOf("ar")),
  CountryLanguageMapping("KZ", listOf("kk", "ru")),
  CountryLanguageMapping(
    "KE",
    listOf(
      "dav", "ebu", "en", "guz", "kam", "ki", "kln", "luo", "luy",
      "mas", "mer", "om", "saq", "so", "sw", "teo",
    ),
  ),
  CountryLanguageMapping("KI", listOf("en")),
  CountryLanguageMapping("XK", listOf("sq", "sr")),
  CountryLanguageMapping("KW", listOf("ar")),
  CountryLanguageMapping("KG", listOf("ky", "ru")),
  CountryLanguageMapping("LA", listOf("lo")),
  CountryLanguageMapping("419", listOf("es")),
  CountryLanguageMapping("LV", listOf("lv")),
  CountryLanguageMapping("LB", listOf("ar")),
  CountryLanguageMapping("LS", listOf("en")),
  CountryLanguageMapping("LR", listOf("en", "vai")),
  CountryLanguageMapping("LY", listOf("ar")),
  CountryLanguageMapping("LI", listOf("de", "gsw")),
  CountryLanguageMapping("LT", listOf("lt")),
  CountryLanguageMapping("LU", listOf("de", "fr", "lb", "pt")),
  CountryLanguageMapping("MO", listOf("en", "pt", "zh")),
  CountryLanguageMapping("MK", listOf("mk", "sq")),
  CountryLanguageMapping("MG", listOf("en", "fr", "mg")),
  CountryLanguageMapping("MW", listOf("en")),
  CountryLanguageMapping("MY", listOf("en", "ms", "ta")),
  CountryLanguageMapping("ML", listOf("bm", "fr", "khq", "ses")),
  CountryLanguageMapping("MT", listOf("en", "mt")),
  CountryLanguageMapping("MH", listOf("en")),
  CountryLanguageMapping("MQ", listOf("fr")),
  CountryLanguageMapping("MR", listOf("ar", "ff", "fr")),
  CountryLanguageMapping("MU", listOf("en", "fr", "mfe")),
  CountryLanguageMapping("YT", listOf("fr")),
  CountryLanguageMapping("MX", listOf("es")),
  CountryLanguageMapping("FM", listOf("en")),
  CountryLanguageMapping("MD", listOf("ro", "ru")),
  CountryLanguageMapping("MC", listOf("fr")),
  CountryLanguageMapping("MN", listOf("mn")),
  CountryLanguageMapping("ME", listOf("sr")),
  CountryLanguageMapping("MS", listOf("en")),
  CountryLanguageMapping("MA", listOf("ar", "fr", "shi", "tzm", "zgh")),
  CountryLanguageMapping("MZ", listOf("mgh", "pt", "seh")),
  CountryLanguageMapping("MM", listOf("my")),
  CountryLanguageMapping("NA", listOf("af", "en", "naq")),
  CountryLanguageMapping("NR", listOf("en")),
  CountryLanguageMapping("NP", listOf("ne")),
  CountryLanguageMapping("NL", listOf("en", "fy", "nds", "nl")),
  CountryLanguageMapping("NC", listOf("fr")),
  CountryLanguageMapping("NZ", listOf("en")),
  CountryLanguageMapping("NI", listOf("es")),
  CountryLanguageMapping("NE", listOf("dje", "fr", "ha", "twq")),
  CountryLanguageMapping("NG", listOf("en", "ha", "ig", "yo")),
  CountryLanguageMapping("NU", listOf("en")),
  CountryLanguageMapping("NF", listOf("en")),
  CountryLanguageMapping("KP", listOf("ko")),
  CountryLanguageMapping("MP", listOf("en")),
  CountryLanguageMapping("NO", listOf("nb", "nn", "no", "se")),
  CountryLanguageMapping("OM", listOf("ar")),
  CountryLanguageMapping("PK", listOf("en", "pa", "sd", "ur")),
  CountryLanguageMapping("PW", listOf("en")),
  CountryLanguageMapping("PS", listOf("ar")),
  CountryLanguageMapping("PA", listOf("es")),
  CountryLanguageMapping("PG", listOf("en")),
  CountryLanguageMapping("PY", listOf("es")),
  CountryLanguageMapping("PE", listOf("es", "qu")),
  CountryLanguageMapping("PH", listOf("en", "es", "fil")),
  CountryLanguageMapping("PN", listOf("en")),
  CountryLanguageMapping("PL", listOf("pl")),
  CountryLanguageMapping("PT", listOf("pt")),
  CountryLanguageMapping("PR", listOf("en", "es")),
  CountryLanguageMapping("QA", listOf("ar")),
  CountryLanguageMapping("RO", listOf("ro")),
  CountryLanguageMapping("RU", listOf("ce", "cu", "os", "ru", "sah", "tt")),
  CountryLanguageMapping("RW", listOf("en", "fr", "rw")),
  CountryLanguageMapping("RE", listOf("fr")),
  CountryLanguageMapping("WS", listOf("en")),
  CountryLanguageMapping("SM", listOf("it")),
  CountryLanguageMapping("SA", listOf("ar")),
  CountryLanguageMapping("SN", listOf("dyo", "ff", "fr", "wo")),
  CountryLanguageMapping("RS", listOf("sr")),
  CountryLanguageMapping("CS", listOf("sr")),
  CountryLanguageMapping("SC", listOf("en", "fr")),
  CountryLanguageMapping("SL", listOf("en")),
  CountryLanguageMapping("SG", listOf("en", "ms", "ta", "zh")),
  CountryLanguageMapping("SX", listOf("en", "nl")),
  CountryLanguageMapping("SK", listOf("sk")),
  CountryLanguageMapping("SI", listOf("en", "sl")),
  CountryLanguageMapping("SB", listOf("en")),
  CountryLanguageMapping("SO", listOf("ar", "so")),
  CountryLanguageMapping("ZA", listOf("af", "en", "zu")),
  CountryLanguageMapping("KR", listOf("ko")),
  CountryLanguageMapping("SS", listOf("ar", "en", "nus")),
  CountryLanguageMapping("ES", listOf("ast", "ca", "es", "eu", "gl")),
  CountryLanguageMapping("LK", listOf("si", "ta")),
  CountryLanguageMapping("BL", listOf("fr")),
  CountryLanguageMapping("SH", listOf("en")),
  CountryLanguageMapping("KN", listOf("en")),
  CountryLanguageMapping("LC", listOf("en")),
  CountryLanguageMapping("MF", listOf("fr")),
  CountryLanguageMapping("PM", listOf("fr")),
  CountryLanguageMapping("VC", listOf("en")),
  CountryLanguageMapping("SD", listOf("ar", "en")),
  CountryLanguageMapping("SR", listOf("nl")),
  CountryLanguageMapping("SJ", listOf("nb")),
  CountryLanguageMapping("SZ", listOf("en")),
  CountryLanguageMapping("SE", listOf("en", "se", "sv")),
  CountryLanguageMapping("CH", listOf("de", "en", "fr", "gsw", "it", "pt", "rm", "wae")),
  CountryLanguageMapping("SY", listOf("ar", "fr")),
  CountryLanguageMapping("ST", listOf("pt")),
  CountryLanguageMapping("TW", listOf("zh")),
  CountryLanguageMapping("TJ", listOf("tg")),
  CountryLanguageMapping(
    "TZ",
    listOf(
      "asa", "bez", "en", "jmc", "kde", "ksb", "lag", "mas", "rof",
      "rwk", "sbp", "sw", "vun",
    ),
  ),
  CountryLanguageMapping("TH", listOf("th")),
  CountryLanguageMapping("TL", listOf("pt")),
  CountryLanguageMapping("TG", listOf("ee", "fr")),
  CountryLanguageMapping("TK", listOf("en")),
  CountryLanguageMapping("TO", listOf("en", "to")),
  CountryLanguageMapping("TT", listOf("en")),
  CountryLanguageMapping("TN", listOf("ar", "fr")),
  CountryLanguageMapping("TR", listOf("tr")),
  CountryLanguageMapping("TM", listOf("tk")),
  CountryLanguageMapping("TC", listOf("en")),
  CountryLanguageMapping("TV", listOf("en")),
  CountryLanguageMapping("UM", listOf("en")),
  CountryLanguageMapping("VI", listOf("en")),
  CountryLanguageMapping("UG", listOf("cgg", "en", "lg", "nyn", "sw", "teo", "xog")),
  CountryLanguageMapping("UA", listOf("ru", "uk")),
  CountryLanguageMapping("AE", listOf("ar")),
  CountryLanguageMapping("GB", listOf("cy", "en", "gd", "kw")),
  CountryLanguageMapping("US", listOf("chr", "en", "es", "haw", "lkt")),
  CountryLanguageMapping("UY", listOf("es")),
  CountryLanguageMapping("UZ", listOf("uz")),
  CountryLanguageMapping("VU", listOf("en", "fr")),
  CountryLanguageMapping("VA", listOf("it")),
  CountryLanguageMapping("VE", listOf("es")),
  CountryLanguageMapping("VN", listOf("vi")),
  CountryLanguageMapping("WF", listOf("fr")),
  CountryLanguageMapping("EH", listOf("ar")),
  CountryLanguageMapping("001", listOf("ar", "en", "eo", "ji", "prg", "vo")),
  CountryLanguageMapping("YE", listOf("ar")),
  CountryLanguageMapping("ZM", listOf("bem", "en")),
  CountryLanguageMapping("ZW", listOf("en", "nd", "sn")),
  CountryLanguageMapping("AX", listOf("sv")),
)
