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
 * language code hu.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_hu: List<CountryLocalization> = listOf(
  CountryLocalization("af", "perzsa", "Afganisztán"),
  CountryLocalization("al", "albán", "Albánia"),
  CountryLocalization("dz", "francia", "Algéria"),
  CountryLocalization("as", "angol", "Amerikai Szamoa"),
  CountryLocalization("ad", "katalán", "Andorra"),
  CountryLocalization("ao", "lingala", "Angola"),
  CountryLocalization("ai", "angol", "Anguilla"),
  CountryLocalization("ag", "angol", "Antigua és Barbuda"),
  CountryLocalization("ar", "spanyol", "Argentína"),
  CountryLocalization("am", "örmény", "Örményország"),
  CountryLocalization("aw", "holland", "Aruba"),
  CountryLocalization("au", "angol", "Ausztrália"),
  CountryLocalization("at", "angol", "Ausztria"),
  CountryLocalization("az", "azerbajdzsáni", "Azerbajdzsán"),
  CountryLocalization("bs", "angol", "Bahama-szigetek"),
  CountryLocalization("bh", "arab", "Bahrein"),
  CountryLocalization("bd", "bangla", "Banglades"),
  CountryLocalization("bb", "angol", "Barbados"),
  CountryLocalization("by", "belarusz", "Belarusz"),
  CountryLocalization("be", "francia", "Belgium"),
  CountryLocalization("bz", "angol", "Belize"),
  CountryLocalization("bj", "francia", "Benin"),
  CountryLocalization("bm", "angol", "Bermuda"),
  CountryLocalization("bt", "dzsonga", "Bhután"),
  CountryLocalization("bo", "spanyol", "Bolívia"),
  CountryLocalization("ba", "bosnyák", "Bosznia-Hercegovina"),
  CountryLocalization("bw", "angol", "Botswana"),
  CountryLocalization("br", "portugál", "Brazília"),
  CountryLocalization("io", "angol", "Brit Indiai-óceáni Terület"),
  CountryLocalization("vg", "angol", "Brit Virgin-szigetek"),
  CountryLocalization("bn", "maláj", "Brunei"),
  CountryLocalization("bg", "bolgár", "Bulgária"),
  CountryLocalization("bf", "francia", "Burkina Faso"),
  CountryLocalization("bi", "francia", "Burundi"),
  CountryLocalization("kh", "khmer", "Kambodzsa"),
  CountryLocalization("cm", "basza", "Kamerun"),
  CountryLocalization("ca", "francia", "Kanada"),
  CountryLocalization("ic", "spanyol", "Kanári-szigetek"),
  CountryLocalization("cv", "kabuverdianu", "Zöld-foki Köztársaság"),
  CountryLocalization("bq", "holland", "Holland Karib-térség"),
  CountryLocalization("ky", "angol", "Kajmán-szigetek"),
  CountryLocalization("cf", "lingala", "Közép-afrikai Köztársaság"),
  CountryLocalization("ea", "spanyol", "Ceuta és Melilla"),
  CountryLocalization("td", "arab", "Csád"),
  CountryLocalization("cl", "spanyol", "Chile"),
  CountryLocalization("cn", "tibeti", "Kína"),
  CountryLocalization("cx", "angol", "Karácsony-sziget"),
  CountryLocalization("cc", "angol", "Kókusz (Keeling)-szigetek"),
  CountryLocalization("co", "spanyol", "Kolumbia"),
  CountryLocalization("km", "arab", "Comore-szigetek"),
  CountryLocalization("cg", "lingala", "Kongó - Brazzaville"),
  CountryLocalization("cd", "szuahéli", "Kongó - Kinshasa"),
  CountryLocalization("ck", "angol", "Cook-szigetek"),
  CountryLocalization("cr", "spanyol", "Costa Rica"),
  CountryLocalization("hr", "horvát", "Horvátország"),
  CountryLocalization("cu", "spanyol", "Kuba"),
  CountryLocalization("cw", "holland", "Curaçao"),
  CountryLocalization("cy", "angol", "Ciprus"),
  CountryLocalization("cz", "cseh", "Csehország"),
  CountryLocalization("ci", "francia", "Elefántcsontpart"),
  CountryLocalization("dk", "angol", "Dánia"),
  CountryLocalization("dg", "angol", "Diego Garcia"),
  CountryLocalization("dj", "francia", "Dzsibuti"),
  CountryLocalization("dm", "angol", "Dominika"),
  CountryLocalization("do", "spanyol", "Dominikai Köztársaság"),
  CountryLocalization("ec", "kecsua", "Ecuador"),
  CountryLocalization("eg", "arab", "Egyiptom"),
  CountryLocalization("sv", "spanyol", "Salvador"),
  CountryLocalization("gq", "spanyol", "Egyenlítői-Guinea"),
  CountryLocalization("er", "tigrinya", "Eritrea"),
  CountryLocalization("ee", "észt", "Észtország"),
  CountryLocalization("et", "amhara", "Etiópia"),
  CountryLocalization("fk", "angol", "Falkland-szigetek"),
  CountryLocalization("fo", "feröeri", "Feröer-szigetek"),
  CountryLocalization("fj", "angol", "Fidzsi"),
  CountryLocalization("fi", "svéd", "Finnország"),
  CountryLocalization("fr", "svájci német", "Franciaország"),
  CountryLocalization("gf", "francia", "Francia Guyana"),
  CountryLocalization("pf", "francia", "Francia Polinézia"),
  CountryLocalization("ga", "francia", "Gabon"),
  CountryLocalization("gm", "angol", "Gambia"),
  CountryLocalization("ge", "oszét", "Grúzia"),
  CountryLocalization("de", "alsó-szorb", "Németország"),
  CountryLocalization("gh", "angol", "Ghána"),
  CountryLocalization("gi", "angol", "Gibraltár"),
  CountryLocalization("gr", "görög", "Görögország"),
  CountryLocalization("gl", "grönlandi", "Grönland"),
  CountryLocalization("gd", "angol", "Grenada"),
  CountryLocalization("gp", "francia", "Guadeloupe"),
  CountryLocalization("gu", "angol", "Guam"),
  CountryLocalization("gt", "spanyol", "Guatemala"),
  CountryLocalization("gg", "angol", "Guernsey"),
  CountryLocalization("gn", "francia", "Guinea"),
  CountryLocalization("gw", "portugál", "Bissau-Guinea"),
  CountryLocalization("gy", "angol", "Guyana"),
  CountryLocalization("ht", "francia", "Haiti"),
  CountryLocalization("hn", "spanyol", "Honduras"),
  CountryLocalization("hk", "kínai", "Hongkong KKT"),
  CountryLocalization("hu", "magyar", "Magyarország"),
  CountryLocalization("is", "izlandi", "Izland"),
  CountryLocalization("in", "nepáli", "India"),
  CountryLocalization("id", "Indonesian", "Indonézia"),
  CountryLocalization("ir", "perzsa", "Irán"),
  CountryLocalization("iq", "északi luri", "Irak"),
  CountryLocalization("ie", "angol", "Írország"),
  CountryLocalization("im", "man-szigeti", "Man-sziget"),
  CountryLocalization("il", "angol", "Izrael"),
  CountryLocalization("it", "német", "Olaszország"),
  CountryLocalization("jm", "angol", "Jamaica"),
  CountryLocalization("jp", "japán", "Japán"),
  CountryLocalization("je", "angol", "Jersey"),
  CountryLocalization("jo", "arab", "Jordánia"),
  CountryLocalization("kz", "kazah", "Kazahsztán"),
  CountryLocalization("ke", "szomáli", "Kenya"),
  CountryLocalization("ki", "angol", "Kiribati"),
  CountryLocalization("xk", "szerb", "Koszovó"),
  CountryLocalization("kw", "arab", "Kuvait"),
  CountryLocalization("kg", "orosz", "Kirgizisztán"),
  CountryLocalization("la", "lao", "Laosz"),
  CountryLocalization("lv", "lett", "Lettország"),
  CountryLocalization("lb", "arab", "Libanon"),
  CountryLocalization("ls", "angol", "Lesotho"),
  CountryLocalization("lr", "angol", "Libéria"),
  CountryLocalization("ly", "arab", "Líbia"),
  CountryLocalization("li", "svájci német", "Liechtenstein"),
  CountryLocalization("lt", "litván", "Litvánia"),
  CountryLocalization("lu", "luxemburgi", "Luxemburg"),
  CountryLocalization("mo", "portugál", "Makaó KKT"),
  CountryLocalization("mk", "albán", "Macedónia"),
  CountryLocalization("mg", "francia", "Madagaszkár"),
  CountryLocalization("mw", "angol", "Malawi"),
  CountryLocalization("my", "tamil", "Malajzia"),
  CountryLocalization("ml", "francia", "Mali"),
  CountryLocalization("mt", "angol", "Málta"),
  CountryLocalization("mh", "angol", "Marshall-szigetek"),
  CountryLocalization("mq", "francia", "Martinique"),
  CountryLocalization("mr", "arab", "Mauritánia"),
  CountryLocalization("mu", "mauritiusi kreol", "Mauritius"),
  CountryLocalization("yt", "francia", "Mayotte"),
  CountryLocalization("mx", "spanyol", "Mexikó"),
  CountryLocalization("fm", "angol", "Mikronézia"),
  CountryLocalization("md", "orosz", "Moldova"),
  CountryLocalization("mc", "francia", "Monaco"),
  CountryLocalization("mn", "mongol", "Mongólia"),
  CountryLocalization("me", "szerb", "Montenegró"),
  CountryLocalization("ms", "angol", "Montserrat"),
  CountryLocalization("ma", "közép-atlaszi tamazigt", "Marokkó"),
  CountryLocalization("mz", "makua-metó", "Mozambik"),
  CountryLocalization("mm", "burmai", "Mianmar (Burma)"),
  CountryLocalization("na", "angol", "Namíbia"),
  CountryLocalization("nr", "angol", "Nauru"),
  CountryLocalization("np", "nepáli", "Nepál"),
  CountryLocalization("nl", "angol", "Hollandia"),
  CountryLocalization("nc", "francia", "Új-Kaledónia"),
  CountryLocalization("nz", "angol", "Új-Zéland"),
  CountryLocalization("ni", "spanyol", "Nicaragua"),
  CountryLocalization("ne", "hausza", "Niger"),
  CountryLocalization("ng", "hausza", "Nigéria"),
  CountryLocalization("nu", "angol", "Niue"),
  CountryLocalization("nf", "angol", "Norfolk-sziget"),
  CountryLocalization("kp", "koreai", "Észak-Korea"),
  CountryLocalization("mp", "angol", "Északi Mariana-szigetek"),
  CountryLocalization("no", "északi számi", "Norvégia"),
  CountryLocalization("om", "arab", "Omán"),
  CountryLocalization("pk", "angol", "Pakisztán"),
  CountryLocalization("pw", "angol", "Palau"),
  CountryLocalization("ps", "arab", "Palesztin Terület"),
  CountryLocalization("pa", "spanyol", "Panama"),
  CountryLocalization("pg", "angol", "Pápua Új-Guinea"),
  CountryLocalization("py", "spanyol", "Paraguay"),
  CountryLocalization("pe", "spanyol", "Peru"),
  CountryLocalization("ph", "filippínó", "Fülöp-szigetek"),
  CountryLocalization("pn", "angol", "Pitcairn-szigetek"),
  CountryLocalization("pl", "lengyel", "Lengyelország"),
  CountryLocalization("pt", "portugál", "Portugália"),
  CountryLocalization("pr", "angol", "Puerto Rico"),
  CountryLocalization("qa", "arab", "Katar"),
  CountryLocalization("ro", "román", "Románia"),
  CountryLocalization("ru", "tatár", "Oroszország"),
  CountryLocalization("rw", "angol", "Ruanda"),
  CountryLocalization("re", "francia", "Réunion"),
  CountryLocalization("ws", "angol", "Szamoa"),
  CountryLocalization("sm", "olasz", "San Marino"),
  CountryLocalization("sa", "arab", "Szaúd-Arábia"),
  CountryLocalization("sn", "francia", "Szenegál"),
  CountryLocalization("rs", "szerb", "Szerbia"),
  CountryLocalization("cs", "szerb", "Serbia and Montenegro"),
  CountryLocalization("sc", "francia", "Seychelle-szigetek"),
  CountryLocalization("sl", "angol", "Sierra Leone"),
  CountryLocalization("sg", "tamil", "Szingapúr"),
  CountryLocalization("sx", "angol", "Sint Maarten"),
  CountryLocalization("sk", "szlovák", "Szlovákia"),
  CountryLocalization("si", "szlovén", "Szlovénia"),
  CountryLocalization("sb", "angol", "Salamon-szigetek"),
  CountryLocalization("so", "arab", "Szomália"),
  CountryLocalization("za", "angol", "Dél-afrikai Köztársaság"),
  CountryLocalization("kr", "koreai", "Dél-Korea"),
  CountryLocalization("ss", "nuer", "Dél-Szudán"),
  CountryLocalization("es", "spanyol", "Spanyolország"),
  CountryLocalization("lk", "tamil", "Srí Lanka"),
  CountryLocalization("bl", "francia", "Saint-Barthélemy"),
  CountryLocalization("sh", "angol", "Szent Ilona"),
  CountryLocalization("kn", "angol", "Saint Kitts és Nevis"),
  CountryLocalization("lc", "angol", "Saint Lucia"),
  CountryLocalization("mf", "francia", "Saint Martin"),
  CountryLocalization("pm", "francia", "Saint-Pierre és Miquelon"),
  CountryLocalization("vc", "angol", "Saint Vincent és a Grenadine-szigetek"),
  CountryLocalization("sd", "arab", "Szudán"),
  CountryLocalization("sr", "holland", "Suriname"),
  CountryLocalization("sj", "norvég (bokmål)", "Svalbard és Jan Mayen"),
  CountryLocalization("sz", "angol", "Szváziföld"),
  CountryLocalization("se", "svéd", "Svédország"),
  CountryLocalization("ch", "svájci német", "Svájc"),
  CountryLocalization("sy", "arab", "Szíria"),
  CountryLocalization("st", "portugál", "São Tomé és Príncipe"),
  CountryLocalization("tw", "kínai", "Tajvan"),
  CountryLocalization("tj", "tadzsik", "Tádzsikisztán"),
  CountryLocalization("tz", "makonde", "Tanzánia"),
  CountryLocalization("th", "thai", "Thaiföld"),
  CountryLocalization("tl", "portugál", "Kelet-Timor"),
  CountryLocalization("tg", "francia", "Togo"),
  CountryLocalization("tk", "angol", "Tokelau"),
  CountryLocalization("to", "tongai", "Tonga"),
  CountryLocalization("tt", "angol", "Trinidad és Tobago"),
  CountryLocalization("tn", "francia", "Tunézia"),
  CountryLocalization("tr", "török", "Törökország"),
  CountryLocalization("tm", "türkmén", "Türkmenisztán"),
  CountryLocalization("tc", "angol", "Turks- és Caicos-szigetek"),
  CountryLocalization("tv", "angol", "Tuvalu"),
  CountryLocalization("um", "angol", "Az USA lakatlan külbirtokai"),
  CountryLocalization("vi", "angol", "Amerikai Virgin-szigetek"),
  CountryLocalization("ug", "szuahéli", "Uganda"),
  CountryLocalization("ua", "ukrán", "Ukrajna"),
  CountryLocalization("ae", "arab", "Egyesült Arab Emírségek"),
  CountryLocalization("gb", "angol", "Egyesült Királyság"),
  CountryLocalization("us", "lakota", "Egyesült Államok"),
  CountryLocalization("uy", "spanyol", "Uruguay"),
  CountryLocalization("uz", "üzbég", "Üzbegisztán"),
  CountryLocalization("vu", "francia", "Vanuatu"),
  CountryLocalization("va", "olasz", "Vatikán"),
  CountryLocalization("ve", "spanyol", "Venezuela"),
  CountryLocalization("vn", "vietnami", "Vietnam"),
  CountryLocalization("wf", "francia", "Wallis és Futuna"),
  CountryLocalization("eh", "arab", "Nyugat-Szahara"),
  CountryLocalization("ye", "arab", "Jemen"),
  CountryLocalization("zm", "angol", "Zambia"),
  CountryLocalization("zw", "északi ndebele", "Zimbabwe"),
  CountryLocalization("ax", "svéd", "Åland-szigetek"),
)
