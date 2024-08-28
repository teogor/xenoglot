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
import kotlin.collections.List

/**
 * Holds the internal list of country-language mappings used for lookups within the package for
 * language code bas.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_bas: List<CountryLocalization> = listOf(
  CountryLocalization("af", "Hɔp u pɛrsìà", "Àfgànìstâŋ"),
  CountryLocalization("al", "Albanian", "Àlbanìà"),
  CountryLocalization("dz", "Hɔp u pulàsi", "Àlgerìà"),
  CountryLocalization("as", "Hɔp u ŋgisì", "American Samoa"),
  CountryLocalization("ad", "Catalan", "Àŋdɔ̂r"),
  CountryLocalization("ao", "Lingala", "Àŋgolà"),
  CountryLocalization("ai", "Hɔp u ŋgisì", "Àŋgiyà"),
  CountryLocalization("ag", "Hɔp u ŋgisì", "Àŋtigà ɓɔ Bàrbudà"),
  CountryLocalization("ar", "Hɔp u panyā", "Àrgàŋtinà"),
  CountryLocalization("am", "Armenian", "Àrmenìà"),
  CountryLocalization("aw", "Hɔp u nlɛ̀ndi", "Àrubà"),
  CountryLocalization("au", "Hɔp u ŋgisì", "Òstralìà"),
  CountryLocalization("at", "Hɔp u ŋgisì", "Òstrǐk"),
  CountryLocalization("az", "Azerbaijani", "Àzɛ̀rbajàŋ"),
  CountryLocalization("bs", "Hɔp u ŋgisì", "Bàhamàs"),
  CountryLocalization("bh", "Hɔp u arâb", "Bàraìn"),
  CountryLocalization("bd", "Hɔp u bɛŋgàli", "Bàŋglàdɛ̂s"),
  CountryLocalization("bb", "Hɔp u ŋgisì", "Bàrbadò"),
  CountryLocalization("by", "Hɔp u bièlòrûs", "Bèlarùs"),
  CountryLocalization("be", "Hɔp u pulàsi", "Bɛlgyùm"),
  CountryLocalization("bz", "Hɔp u ŋgisì", "Bèlîs"),
  CountryLocalization("bj", "Hɔp u pulàsi", "Bènɛ̂ŋ"),
  CountryLocalization("bm", "Hɔp u ŋgisì", "Bɛ̀rmudà"),
  CountryLocalization("bt", "Dzongkha", "Bùtân"),
  CountryLocalization("bo", "Hɔp u panyā", "Bòlivìà"),
  CountryLocalization("ba", "Bosnian", "Bòhnià Ɛrzègòvinà"),
  CountryLocalization("bw", "Hɔp u ŋgisì", "Bòdsùanà"),
  CountryLocalization("br", "Hɔp u pɔtɔ̄kì", "Bràsîl"),
  CountryLocalization("io", "Hɔp u ŋgisì", "Bìtèk bi Ŋgisì i Tūyɛ Īndìà"),
  CountryLocalization("vg", "Hɔp u ŋgisì", "Bìòn bi kɔnji bi Ŋgisì"),
  CountryLocalization("bn", "Hɔp u makɛ᷆", "Brunei"),
  CountryLocalization("bg", "Hɔp u bûlgâr", "Bùlgarìà"),
  CountryLocalization("bf", "Hɔp u pulàsi", "Bùrkìnà Fasò"),
  CountryLocalization("bi", "Hɔp u pulàsi", "Bùrundì"),
  CountryLocalization("kh", "Hɔp u kmɛ̂r", "Kàmbodìà"),
  CountryLocalization("cm", "Ɓàsàa", "Kàmɛ̀rûn"),
  CountryLocalization("ca", "Hɔp u pulàsi", "Kànadà"),
  CountryLocalization("ic", "Hɔp u panyā", "IC"),
  CountryLocalization("cv", "kea", "Kabwɛ᷆r"),
  CountryLocalization("bq", "Hɔp u nlɛ̀ndi", "Caribbean Netherlands"),
  CountryLocalization("ky", "Hɔp u ŋgisì", "Bìòn bi Kaymàn"),
  CountryLocalization("cf", "Lingala", "Ŋ̀ɛm Afrīkà"),
  CountryLocalization("ea", "Hɔp u panyā", "EA"),
  CountryLocalization("td", "Hɔp u arâb", "Câd"),
  CountryLocalization("cl", "Hɔp u panyā", "Kìlî"),
  CountryLocalization("cn", "Tibetan", "Kinà"),
  CountryLocalization("cx", "Hɔp u ŋgisì", "Christmas Island"),
  CountryLocalization("cc", "Hɔp u ŋgisì", "Cocos (Keeling) Islands"),
  CountryLocalization("co", "Hɔp u panyā", "Kɔ̀lɔmbìà"),
  CountryLocalization("km", "Hɔp u arâb", "Kɔ̀mɔ̂r"),
  CountryLocalization("cg", "Lingala", "Kòŋgo"),
  CountryLocalization("cd", "Swahili", "Kòŋgo ìkɛŋi"),
  CountryLocalization("ck", "Hɔp u ŋgisì", "Bìòn bi Kook"),
  CountryLocalization("cr", "Hɔp u panyā", "Kòstà Rikà"),
  CountryLocalization("hr", "Croatian", "Kròasìà"),
  CountryLocalization("cu", "Hɔp u panyā", "Kubà"),
  CountryLocalization("cw", "Hɔp u nlɛ̀ndi", "Curaçao"),
  CountryLocalization("cy", "Hɔp u ŋgisì", "Kiprò"),
  CountryLocalization("cz", "Hɔp u cɛ̂k", "Czechia"),
  CountryLocalization("ci", "Hɔp u pulàsi", "Màŋ mi Njɔ̂k"),
  CountryLocalization("dk", "Hɔp u ŋgisì", "Dànmârk"),
  CountryLocalization("dg", "Hɔp u ŋgisì", "DG"),
  CountryLocalization("dj", "Hɔp u pulàsi", "Jìbutì"),
  CountryLocalization("dm", "Hɔp u ŋgisì", "Dòmnîk"),
  CountryLocalization("do", "Hɔp u panyā", "Dòmnikà"),
  CountryLocalization("ec", "Quechua", "Èkwàtorìà"),
  CountryLocalization("eg", "Hɔp u arâb", "Ègîptò"),
  CountryLocalization("sv", "Hɔp u panyā", "Sàlvàdɔ̂r"),
  CountryLocalization("gq", "Hɔp u panyā", "Gìne Èkwàtorìà"),
  CountryLocalization("er", "Tigrinya", "Èrìtrěà"),
  CountryLocalization("ee", "Estonian", "Èstonìà"),
  CountryLocalization("et", "Hɔp u amhārìk", "Ètìopìà"),
  CountryLocalization("fk", "Hɔp u ŋgisì", "Bìòn bi Falkland"),
  CountryLocalization("fo", "Faroese", "Faroe Islands"),
  CountryLocalization("fj", "Hɔp u ŋgisì", "Fiji"),
  CountryLocalization("fi", "Hɔp u suɛ᷆d", "Fìnlând"),
  CountryLocalization("fr", "Swiss German", "Pùlàsi / Fɛ̀lɛ̀nsi /"),
  CountryLocalization("gf", "Hɔp u pulàsi", "Gùyanà Pùlàsi"),
  CountryLocalization("pf", "Hɔp u pulàsi", "Pòlìnesìà Pùlàsi"),
  CountryLocalization("ga", "Hɔp u pulàsi", "Gàbɔ̂ŋ"),
  CountryLocalization("gm", "Hɔp u ŋgisì", "Gàmbià"),
  CountryLocalization("ge", "Ossetic", "Gèɔrgìà"),
  CountryLocalization("de", "Lower Sorbian", "Jamân"),
  CountryLocalization("gh", "Hɔp u ŋgisì", "Ganà"),
  CountryLocalization("gi", "Hɔp u ŋgisì", "Gìlbràtâr"),
  CountryLocalization("gr", "Hɔp u gri ᷇kyà", "Grǐkyà"),
  CountryLocalization("gl", "Kalaallisut", "Grǐnlànd"),
  CountryLocalization("gd", "Hɔp u ŋgisì", "Grènadà"),
  CountryLocalization("gp", "Hɔp u pulàsi", "Gwàdèlûp"),
  CountryLocalization("gu", "Hɔp u ŋgisì", "Gùâm"),
  CountryLocalization("gt", "Hɔp u panyā", "Gwàtèmalà"),
  CountryLocalization("gg", "Hɔp u ŋgisì", "Guernsey"),
  CountryLocalization("gn", "Hɔp u pulàsi", "Gìnê"),
  CountryLocalization("gw", "Hɔp u pɔtɔ̄kì", "Gìne Bìsàô"),
  CountryLocalization("gy", "Hɔp u ŋgisì", "Gùyanà"),
  CountryLocalization("ht", "Hɔp u pulàsi", "Àitì"),
  CountryLocalization("hn", "Hɔp u panyā", "Ɔ̀ŋduràs"),
  CountryLocalization("hk", "Hɔp u kinà", "Hong Kong SAR China"),
  CountryLocalization("hu", "Hɔp u hɔŋgrìi", "Ɔ̀ŋgriì"),
  CountryLocalization("is", "Icelandic", "Ìslandìà"),
  CountryLocalization("in", "Hɔp u nepa᷆l", "Indìà"),
  CountryLocalization("id", "Indonesian", "Indònèsià"),
  CountryLocalization("ir", "Hɔp u pɛrsìà", "Ìrâŋ"),
  CountryLocalization("iq", "lrc", "Ìrâk"),
  CountryLocalization("ie", "Hɔp u ŋgisì", "Ìrlând"),
  CountryLocalization("im", "Manx", "Isle of Man"),
  CountryLocalization("il", "Hɔp u ŋgisì", "Isràɛ̂l"),
  CountryLocalization("it", "Hɔp u jamân", "Ìtalìà"),
  CountryLocalization("jm", "Hɔp u ŋgisì", "Jàmàikà"),
  CountryLocalization("jp", "Hɔp u yapàn", "Japan"),
  CountryLocalization("je", "Hɔp u ŋgisì", "Jersey"),
  CountryLocalization("jo", "Hɔp u arâb", "Yɔ̀rdanià"),
  CountryLocalization("kz", "Kazakh", "Kàzàkstâŋ"),
  CountryLocalization("ke", "Hɔp u somàlî", "Kenìà"),
  CountryLocalization("ki", "Hɔp u ŋgisì", "Kìrìbatì"),
  CountryLocalization("xk", "Serbian", "XK"),
  CountryLocalization("kw", "Hɔp u arâb", "Kòwêt"),
  CountryLocalization("kg", "Hɔp u ruslànd", "Kìrgìzìstàŋ"),
  CountryLocalization("la", "Lao", "Làôs"),
  CountryLocalization("lv", "Latvian", "Làdvià"),
  CountryLocalization("lb", "Hɔp u arâb", "Lèbanòn"),
  CountryLocalization("ls", "Hɔp u ŋgisì", "Lesòtò"),
  CountryLocalization("lr", "Hɔp u ŋgisì", "Lìberìà"),
  CountryLocalization("ly", "Hɔp u arâb", "Libìà"),
  CountryLocalization("li", "Swiss German", "Ligstɛntàn"),
  CountryLocalization("lt", "Lithuanian", "Lìtùanìà"),
  CountryLocalization("lu", "Luxembourgish", "Lùgsàmbûr"),
  CountryLocalization("mo", "Hɔp u pɔtɔ̄kì", "Macao SAR China"),
  CountryLocalization("mk", "Albanian", "Màsèdonìà"),
  CountryLocalization("mg", "Hɔp u pulàsi", "Màdàgàskâr"),
  CountryLocalization("mw", "Hɔp u ŋgisì", "Màlàwi"),
  CountryLocalization("my", "Hɔp u tamu᷆l", "Màlɛ̀sìà"),
  CountryLocalization("ml", "Hɔp u pulàsi", "Màli"),
  CountryLocalization("mt", "Hɔp u ŋgisì", "Maltà"),
  CountryLocalization("mh", "Hɔp u ŋgisì", "Bìòn bi Marcàl"),
  CountryLocalization("mq", "Hɔp u pulàsi", "Màrtìnîk"),
  CountryLocalization("mr", "Hɔp u arâb", "Mòrìtanìà"),
  CountryLocalization("mu", "mfe", "Mòrîs"),
  CountryLocalization("yt", "Hɔp u pulàsi", "Màyɔ̂t"),
  CountryLocalization("mx", "Hɔp u panyā", "Mɛ̀gsîk"),
  CountryLocalization("fm", "Hɔp u ŋgisì", "Mìkrònesìà"),
  CountryLocalization("md", "Hɔp u ruslànd", "Moldavìà"),
  CountryLocalization("mc", "Hɔp u pulàsi", "Mònakò"),
  CountryLocalization("mn", "Mongolian", "Mòŋgolìà"),
  CountryLocalization("me", "Serbian", "Montenegro"),
  CountryLocalization("ms", "Hɔp u ŋgisì", "Mɔ̀ŋseràt"),
  CountryLocalization("ma", "tzm", "Màrokò"),
  CountryLocalization("mz", "mgh", "Mòsàmbîk"),
  CountryLocalization("mm", "Hɔp u birmàn", "Myànmâr"),
  CountryLocalization("na", "Hɔp u ŋgisì", "Nàmibìà"),
  CountryLocalization("nr", "Hɔp u ŋgisì", "Nerù"),
  CountryLocalization("np", "Hɔp u nepa᷆l", "Nèpâl"),
  CountryLocalization("nl", "Hɔp u ŋgisì", "Ǹlɛndi"),
  CountryLocalization("nc", "Hɔp u pulàsi", "Kàlèdonìà Yɔ̀ndɔ"),
  CountryLocalization("nz", "Hɔp u ŋgisì", "Sìlând Yɔ̀ndɔ"),
  CountryLocalization("ni", "Hɔp u panyā", "Nìkàragwà"),
  CountryLocalization("ne", "Hɔp u ɓausa", "Nìjɛ̂r"),
  CountryLocalization("ng", "Hɔp u ɓausa", "Nìgerìà"),
  CountryLocalization("nu", "Hɔp u ŋgisì", "Nìuɛ̀"),
  CountryLocalization("nf", "Hɔp u ŋgisì", "Òn i Nɔrfɔ̂k"),
  CountryLocalization("kp", "Hɔp u kɔrēà", "Kɔ̀re ì Ŋ̀ɔmbɔk"),
  CountryLocalization("mp", "Hɔp u ŋgisì", "Bìòn bi Marìanà ŋ̀ɔmbɔk"),
  CountryLocalization("no", "Northern Sami", "Nɔ̀rvegìà"),
  CountryLocalization("om", "Hɔp u arâb", "Òmân"),
  CountryLocalization("pk", "Hɔp u ŋgisì", "Pàkìstân"),
  CountryLocalization("pw", "Hɔp u ŋgisì", "Pàlaù"),
  CountryLocalization("ps", "Hɔp u arâb", "Pàlɛ̀htinà Hyɔ̀ŋg nì Gazà"),
  CountryLocalization("pa", "Hɔp u panyā", "Pànàma"),
  CountryLocalization("pg", "Hɔp u ŋgisì", "Gìne ì Pàpu"),
  CountryLocalization("py", "Hɔp u panyā", "Pàràgwê"),
  CountryLocalization("pe", "Hɔp u panyā", "Pèrû"),
  CountryLocalization("ph", "Filipino", "Fìlìpîn"),
  CountryLocalization("pn", "Hɔp u ŋgisì", "Pìdkaìrn"),
  CountryLocalization("pl", "Hɔp u pɔlɔ̄nà", "Pòlànd"),
  CountryLocalization("pt", "Hɔp u pɔtɔ̄kì", "Pɔ̀tɔkì"),
  CountryLocalization("pr", "Hɔp u ŋgisì", "Pɔ̀rtò Rikò"),
  CountryLocalization("qa", "Hɔp u arâb", "Kàtâr"),
  CountryLocalization("ro", "Hɔp u rùmanìà", "Rùmanìà"),
  CountryLocalization("ru", "Tatar", "Ruslànd"),
  CountryLocalization("rw", "Hɔp u ŋgisì", "Rùandà"),
  CountryLocalization("re", "Hɔp u pulàsi", "Rèunyɔ̂ŋ"),
  CountryLocalization("ws", "Hɔp u ŋgisì", "Sàmoà"),
  CountryLocalization("sm", "Hɔp u italìà", "Nûmpubi Māatìn"),
  CountryLocalization("sa", "Hɔp u arâb", "Sàudi Àrabìà"),
  CountryLocalization("sn", "Hɔp u pulàsi", "Sènègâl"),
  CountryLocalization("rs", "Serbian", "Serbia"),
  CountryLocalization("cs", "Serbian", "Serbia and Montenegro"),
  CountryLocalization("sc", "Hɔp u pulàsi", "Sèsɛ̂l"),
  CountryLocalization("sl", "Hɔp u ŋgisì", "Sièra Lèɔ̂n"),
  CountryLocalization("sg", "Hɔp u tamu᷆l", "Sìŋgàpûr"),
  CountryLocalization("sx", "Hɔp u ŋgisì", "Sint Maarten"),
  CountryLocalization("sk", "Slovak", "Slòvakìà"),
  CountryLocalization("si", "Slovenian", "Slòvanìà"),
  CountryLocalization("sb", "Hɔp u ŋgisì", "Bìòn bi Salōmò"),
  CountryLocalization("so", "Hɔp u arâb", "Sòmalìà"),
  CountryLocalization("za", "Hɔp u ŋgisì", "Àfrǐkà Sɔ̀"),
  CountryLocalization("kr", "Hɔp u kɔrēà", "Kɔ̀re ì Ŋ̀wɛ̀lmbɔk"),
  CountryLocalization("ss", "nus", "South Sudan"),
  CountryLocalization("es", "Hɔp u panyā", "Pànya"),
  CountryLocalization("lk", "Hɔp u tamu᷆l", "Srìlaŋkà"),
  CountryLocalization("bl", "Hɔp u pulàsi", "St. Barthélemy"),
  CountryLocalization("sh", "Hɔp u ŋgisì", "Nûmpubi Ɛlēnà"),
  CountryLocalization("kn", "Hɔp u ŋgisì", "Nûmpubi Kîts nì Nevìs"),
  CountryLocalization("lc", "Hɔp u ŋgisì", "Nûmpubi Lusì"),
  CountryLocalization("mf", "Hɔp u pulàsi", "St. Martin"),
  CountryLocalization("pm", "Hɔp u pulàsi", "Nûmpubi Petrò nì Mikèlôn"),
  CountryLocalization("vc", "Hɔp u ŋgisì", "Nûmpubi Vɛ̂ŋsâŋ nì grènàdîn"),
  CountryLocalization("sd", "Hɔp u arâb", "Sùdâŋ"),
  CountryLocalization("sr", "Hɔp u nlɛ̀ndi", "Sùrinâm"),
  CountryLocalization("sj", "Norwegian Bokmål", "Svalbard & Jan Mayen"),
  CountryLocalization("sz", "Hɔp u ŋgisì", "Swàzìlând"),
  CountryLocalization("se", "Hɔp u suɛ᷆d", "Swedɛ̀n"),
  CountryLocalization("ch", "Swiss German", "Sùwîs"),
  CountryLocalization("sy", "Hɔp u arâb", "Sirìà"),
  CountryLocalization("st", "Hɔp u pɔtɔ̄kì", "Sào Tòme ɓɔ Prɛ̀ŋcipè"),
  CountryLocalization("tw", "Hɔp u kinà", "Tàywân"),
  CountryLocalization("tj", "Tajik", "Tàjìkìstaŋ"),
  CountryLocalization("tz", "kde", "Tànzànià"),
  CountryLocalization("th", "Hɔp u tây", "Taylànd"),
  CountryLocalization("tl", "Hɔp u pɔtɔ̄kì", "Tìmɔ̂r lìkòl"),
  CountryLocalization("tg", "Hɔp u pulàsi", "Tògo"),
  CountryLocalization("tk", "Hɔp u ŋgisì", "Tòkèlaò"),
  CountryLocalization("to", "Tongan", "Tɔŋgà"),
  CountryLocalization("tt", "Hɔp u ŋgisì", "Trìnidàd ɓɔ Tòbagò"),
  CountryLocalization("tn", "Hɔp u pulàsi", "Tùnisìà"),
  CountryLocalization("tr", "Hɔp u tûrk", "Tùrkây"),
  CountryLocalization("tm", "Turkmen", "Tùrgmènìstân"),
  CountryLocalization("tc", "Hɔp u ŋgisì", "Bìòn bi Tûrks nì Kalkòs"),
  CountryLocalization("tv", "Hɔp u ŋgisì", "Tùvàlù"),
  CountryLocalization("um", "Hɔp u ŋgisì", "U.S. Outlying Islands"),
  CountryLocalization("vi", "Hɔp u ŋgisì", "Bìòn bi kɔnji bi U.S."),
  CountryLocalization("ug", "Swahili", "Ùgandà"),
  CountryLocalization("ua", "Hɔp u ukrǎnìà", "Ùkrɛ̌n"),
  CountryLocalization("ae", "Hɔp u arâb", "Àdnà i Bilɔ̀ŋ bi Arābìà"),
  CountryLocalization("gb", "Hɔp u ŋgisì", "Àdnà i Lɔ̂ŋ"),
  CountryLocalization("us", "lkt", "Àdnà i Bilɔ̀ŋ bi Amerkà"),
  CountryLocalization("uy", "Hɔp u panyā", "Ùrùgwêy"),
  CountryLocalization("uz", "Uzbek", "Ùzbèkìstân"),
  CountryLocalization("vu", "Hɔp u pulàsi", "Vànùatù"),
  CountryLocalization("va", "Hɔp u italìà", "Vàtìkâŋ"),
  CountryLocalization("ve", "Hɔp u panyā", "Vènèzùelà"),
  CountryLocalization("vn", "Hɔp u vyɛ̄dnàm", "Vìɛ̀dnâm"),
  CountryLocalization("wf", "Hɔp u pulàsi", "Wàlîs nì Fùtunà"),
  CountryLocalization("eh", "Hɔp u arâb", "Western Sahara"),
  CountryLocalization("ye", "Hɔp u arâb", "Yèmɛ̂n"),
  CountryLocalization("zm", "Hɔp u ŋgisì", "Zàmbià"),
  CountryLocalization("zw", "North Ndebele", "Zìmbàbwê"),
  CountryLocalization("ax", "Hɔp u suɛ᷆d", "Åland Islands"),
)
