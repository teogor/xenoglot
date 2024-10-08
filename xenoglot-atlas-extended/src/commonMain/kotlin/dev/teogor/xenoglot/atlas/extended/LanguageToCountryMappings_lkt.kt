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
 * language code lkt.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_lkt: List<CountryLocalization> = listOf(
  CountryLocalization("af", "Persian Iyápi", "Afghanistan"),
  CountryLocalization("al", "Albanian Iyápi", "Albania"),
  CountryLocalization("dz", "Wašíču Ikčéka Iyápi", "Algeria"),
  CountryLocalization("as", "Wašíčuiyapi", "American Samoa"),
  CountryLocalization("ad", "Catalan Iyápi", "Andorra"),
  CountryLocalization("ao", "Lingala", "Angola"),
  CountryLocalization("ai", "Wašíčuiyapi", "Anguilla"),
  CountryLocalization("ag", "Wašíčuiyapi", "Antigua & Barbuda"),
  CountryLocalization("ar", "Spayóla Iyápi", "Argentina"),
  CountryLocalization("am", "Armenia Iyápi", "Armenia"),
  CountryLocalization("aw", "Dutch Iyápi", "Aruba"),
  CountryLocalization("au", "Wašíčuiyapi", "Australia"),
  CountryLocalization("at", "Wašíčuiyapi", "Austria"),
  CountryLocalization("az", "Azerbaijani Iyápi", "Azerbaijan"),
  CountryLocalization("bs", "Wašíčuiyapi", "Bahamas"),
  CountryLocalization("bh", "Arab Iyápi", "Bahrain"),
  CountryLocalization("bd", "Bengali Iyápi", "Bangladesh"),
  CountryLocalization("bb", "Wašíčuiyapi", "Barbados"),
  CountryLocalization("by", "Belarus Iyápi", "Belarus"),
  CountryLocalization("be", "Wašíču Ikčéka Iyápi", "Belgium"),
  CountryLocalization("bz", "Wašíčuiyapi", "Belize"),
  CountryLocalization("bj", "Wašíču Ikčéka Iyápi", "Benin"),
  CountryLocalization("bm", "Wašíčuiyapi", "Bermuda"),
  CountryLocalization("bt", "Dzongkha", "Bhutan"),
  CountryLocalization("bo", "Spayóla Iyápi", "Bolivia"),
  CountryLocalization("ba", "Bosnia Iyápi", "Bosnia & Herzegovina"),
  CountryLocalization("bw", "Wašíčuiyapi", "Botswana"),
  CountryLocalization("br", "Portuguese Iyápi", "Brazil"),
  CountryLocalization("io", "Wašíčuiyapi", "British Indian Ocean Territory"),
  CountryLocalization("vg", "Wašíčuiyapi", "British Virgin Islands"),
  CountryLocalization("bn", "Malay Iyápi", "Brunei"),
  CountryLocalization("bg", "Bulgar Iyápi", "Bulgaria"),
  CountryLocalization("bf", "Wašíču Ikčéka Iyápi", "Burkina Faso"),
  CountryLocalization("bi", "Wašíču Ikčéka Iyápi", "Burundi"),
  CountryLocalization("kh", "Khmer Iyápi", "Cambodia"),
  CountryLocalization("cm", "Basaa", "Cameroon"),
  CountryLocalization("ca", "Wašíču Ikčéka Iyápi", "Uŋčíyapi Makȟóčhe"),
  CountryLocalization("ic", "Spayóla Iyápi", "IC"),
  CountryLocalization("cv", "kea", "Cape Verde"),
  CountryLocalization("bq", "Dutch Iyápi", "Caribbean Netherlands"),
  CountryLocalization("ky", "Wašíčuiyapi", "Cayman Islands"),
  CountryLocalization("cf", "Lingala", "Central African Republic"),
  CountryLocalization("ea", "Spayóla Iyápi", "EA"),
  CountryLocalization("td", "Arab Iyápi", "Chad"),
  CountryLocalization("cl", "Spayóla Iyápi", "Chile"),
  CountryLocalization("cn", "Tibetan Iyápi", "Pȟečhókaŋhaŋska Makȟóčhe"),
  CountryLocalization("cx", "Wašíčuiyapi", "Christmas Island"),
  CountryLocalization("cc", "Wašíčuiyapi", "Cocos (Keeling) Islands"),
  CountryLocalization("co", "Spayóla Iyápi", "Colombia"),
  CountryLocalization("km", "Arab Iyápi", "Comoros"),
  CountryLocalization("cg", "Lingala", "Congo - Brazzaville"),
  CountryLocalization("cd", "Swahili Iyápi", "Congo - Kinshasa"),
  CountryLocalization("ck", "Wašíčuiyapi", "Cook Islands"),
  CountryLocalization("cr", "Spayóla Iyápi", "Costa Rica"),
  CountryLocalization("hr", "Croatian Iyápi", "Croatia"),
  CountryLocalization("cu", "Spayóla Iyápi", "Cuba"),
  CountryLocalization("cw", "Dutch Iyápi", "Curaçao"),
  CountryLocalization("cy", "Wašíčuiyapi", "Cyprus"),
  CountryLocalization("cz", "Czech Iyápi", "Czechia"),
  CountryLocalization("ci", "Wašíču Ikčéka Iyápi", "Côte d’Ivoire"),
  CountryLocalization("dk", "Wašíčuiyapi", "Denmark"),
  CountryLocalization("dg", "Wašíčuiyapi", "DG"),
  CountryLocalization("dj", "Wašíču Ikčéka Iyápi", "Djibouti"),
  CountryLocalization("dm", "Wašíčuiyapi", "Dominica"),
  CountryLocalization("do", "Spayóla Iyápi", "Dominican Republic"),
  CountryLocalization("ec", "Quechua Iyápi", "Ecuador"),
  CountryLocalization("eg", "Arab Iyápi", "Egypt"),
  CountryLocalization("sv", "Spayóla Iyápi", "El Salvador"),
  CountryLocalization("gq", "Spayóla Iyápi", "Equatorial Guinea"),
  CountryLocalization("er", "Tigrinya Iyápi", "Eritrea"),
  CountryLocalization("ee", "Estonia Iyápi", "Estonia"),
  CountryLocalization("et", "Amharic Iyápi", "Ethiopia"),
  CountryLocalization("fk", "Wašíčuiyapi", "Falkland Islands"),
  CountryLocalization("fo", "Faroese Iyápi", "Faroe Islands"),
  CountryLocalization("fj", "Wašíčuiyapi", "Fiji"),
  CountryLocalization("fi", "Swedish Iyápi", "Finland"),
  CountryLocalization("fr", "Swiss German", "France"),
  CountryLocalization("gf", "Wašíču Ikčéka Iyápi", "French Guiana"),
  CountryLocalization("pf", "Wašíču Ikčéka Iyápi", "French Polynesia"),
  CountryLocalization("ga", "Wašíču Ikčéka Iyápi", "Gabon"),
  CountryLocalization("gm", "Wašíčuiyapi", "Gambia"),
  CountryLocalization("ge", "Ossetic", "Georgia"),
  CountryLocalization("de", "Lower Sorbian", "Iyášiča Makȟóčhe"),
  CountryLocalization("gh", "Wašíčuiyapi", "Ghana"),
  CountryLocalization("gi", "Wašíčuiyapi", "Gibraltar"),
  CountryLocalization("gr", "Greece Iyápi", "Greece"),
  CountryLocalization("gl", "Kalaallisut", "Greenland"),
  CountryLocalization("gd", "Wašíčuiyapi", "Grenada"),
  CountryLocalization("gp", "Wašíču Ikčéka Iyápi", "Guadeloupe"),
  CountryLocalization("gu", "Wašíčuiyapi", "Guam"),
  CountryLocalization("gt", "Spayóla Iyápi", "Guatemala"),
  CountryLocalization("gg", "Wašíčuiyapi", "Guernsey"),
  CountryLocalization("gn", "Wašíču Ikčéka Iyápi", "Guinea"),
  CountryLocalization("gw", "Portuguese Iyápi", "Guinea-Bissau"),
  CountryLocalization("gy", "Wašíčuiyapi", "Guyana"),
  CountryLocalization("ht", "Wašíču Ikčéka Iyápi", "Haiti"),
  CountryLocalization("hn", "Spayóla Iyápi", "Honduras"),
  CountryLocalization("hk", "Pȟečhókaŋ Háŋska Iyápi", "Hong Kong SAR China"),
  CountryLocalization("hu", "Hungary Iyápi", "Hungary"),
  CountryLocalization("is", "Iceland Iyápi", "Iceland"),
  CountryLocalization("in", "Nepal Iyápi", "India"),
  CountryLocalization("id", "Indonesian", "Indonesia"),
  CountryLocalization("ir", "Persian Iyápi", "Iran"),
  CountryLocalization("iq", "lrc", "Iraq"),
  CountryLocalization("ie", "Wašíčuiyapi", "Ireland"),
  CountryLocalization("im", "Manx", "Isle of Man"),
  CountryLocalization("il", "Wašíčuiyapi", "Israel"),
  CountryLocalization("it", "Iyášiča Iyápi", "Italy"),
  CountryLocalization("jm", "Wašíčuiyapi", "Jamaica"),
  CountryLocalization("jp", "Kisúŋla Iyápi", "Kisúŋla Makȟóčhe"),
  CountryLocalization("je", "Wašíčuiyapi", "Jersey"),
  CountryLocalization("jo", "Arab Iyápi", "Jordan"),
  CountryLocalization("kz", "Kazakh Iyápi", "Kazakhstan"),
  CountryLocalization("ke", "Somali Iyápi", "Kenya"),
  CountryLocalization("ki", "Wašíčuiyapi", "Kiribati"),
  CountryLocalization("xk", "Serbia Iyápi", "XK"),
  CountryLocalization("kw", "Arab Iyápi", "Kuwait"),
  CountryLocalization("kg", "Russia Iyápi", "Kyrgyzstan"),
  CountryLocalization("la", "Lao Iyápi", "Laos"),
  CountryLocalization("lv", "Latvia Iyápi", "Latvia"),
  CountryLocalization("lb", "Arab Iyápi", "Lebanon"),
  CountryLocalization("ls", "Wašíčuiyapi", "Lesotho"),
  CountryLocalization("lr", "Wašíčuiyapi", "Liberia"),
  CountryLocalization("ly", "Arab Iyápi", "Libya"),
  CountryLocalization("li", "Swiss German", "Liechtenstein"),
  CountryLocalization("lt", "Lithuania Iyápilt", "Lithuania"),
  CountryLocalization("lu", "Luxembourg Iyápi", "Luxembourg"),
  CountryLocalization("mo", "Portuguese Iyápi", "Macao SAR China"),
  CountryLocalization("mk", "Albanian Iyápi", "North Macedonia"),
  CountryLocalization("mg", "Wašíču Ikčéka Iyápi", "Madagascar"),
  CountryLocalization("mw", "Wašíčuiyapi", "Malawi"),
  CountryLocalization("my", "Tamil Iyápi", "Malaysia"),
  CountryLocalization("ml", "Wašíču Ikčéka Iyápi", "Mali"),
  CountryLocalization("mt", "Wašíčuiyapi", "Malta"),
  CountryLocalization("mh", "Wašíčuiyapi", "Marshall Islands"),
  CountryLocalization("mq", "Wašíču Ikčéka Iyápi", "Martinique"),
  CountryLocalization("mr", "Arab Iyápi", "Mauritania"),
  CountryLocalization("mu", "mfe", "Mauritius"),
  CountryLocalization("yt", "Wašíču Ikčéka Iyápi", "Mayotte"),
  CountryLocalization("mx", "Spayóla Iyápi", "Spayóla Makȟóčhe"),
  CountryLocalization("fm", "Wašíčuiyapi", "Micronesia"),
  CountryLocalization("md", "Russia Iyápi", "Moldova"),
  CountryLocalization("mc", "Wašíču Ikčéka Iyápi", "Monaco"),
  CountryLocalization("mn", "Mongolian", "Mongolia"),
  CountryLocalization("me", "Serbia Iyápi", "Montenegro"),
  CountryLocalization("ms", "Wašíčuiyapi", "Montserrat"),
  CountryLocalization("ma", "tzm", "Morocco"),
  CountryLocalization("mz", "mgh", "Mozambique"),
  CountryLocalization("mm", "Burmese Iyápi", "Myanmar (Burma)"),
  CountryLocalization("na", "Wašíčuiyapi", "Namibia"),
  CountryLocalization("nr", "Wašíčuiyapi", "Nauru"),
  CountryLocalization("np", "Nepal Iyápi", "Nepal"),
  CountryLocalization("nl", "Wašíčuiyapi", "Netherlands"),
  CountryLocalization("nc", "Wašíču Ikčéka Iyápi", "New Caledonia"),
  CountryLocalization("nz", "Wašíčuiyapi", "New Zealand"),
  CountryLocalization("ni", "Spayóla Iyápi", "Nicaragua"),
  CountryLocalization("ne", "Hausa Iyápi", "Niger"),
  CountryLocalization("ng", "Hausa Iyápi", "Nigeria"),
  CountryLocalization("nu", "Wašíčuiyapi", "Niue"),
  CountryLocalization("nf", "Wašíčuiyapi", "Norfolk Island"),
  CountryLocalization("kp", "Korea Iyápi", "North Korea"),
  CountryLocalization("mp", "Wašíčuiyapi", "Northern Mariana Islands"),
  CountryLocalization("no", "Northern Sami", "Norway"),
  CountryLocalization("om", "Arab Iyápi", "Oman"),
  CountryLocalization("pk", "Wašíčuiyapi", "Pakistan"),
  CountryLocalization("pw", "Wašíčuiyapi", "Palau"),
  CountryLocalization("ps", "Arab Iyápi", "Palestinian Territories"),
  CountryLocalization("pa", "Spayóla Iyápi", "Panama"),
  CountryLocalization("pg", "Wašíčuiyapi", "Papua New Guinea"),
  CountryLocalization("py", "Spayóla Iyápi", "Paraguay"),
  CountryLocalization("pe", "Spayóla Iyápi", "Peru"),
  CountryLocalization("ph", "Filipino Iyápi", "Philippines"),
  CountryLocalization("pn", "Wašíčuiyapi", "Pitcairn Islands"),
  CountryLocalization("pl", "Polish Iyápi", "Poland"),
  CountryLocalization("pt", "Portuguese Iyápi", "Portugal"),
  CountryLocalization("pr", "Wašíčuiyapi", "Puerto Rico"),
  CountryLocalization("qa", "Arab Iyápi", "Qatar"),
  CountryLocalization("ro", "Romanian Iyápi", "Romania"),
  CountryLocalization("ru", "Tatar Iyápi", "Russia"),
  CountryLocalization("rw", "Wašíčuiyapi", "Rwanda"),
  CountryLocalization("re", "Wašíču Ikčéka Iyápi", "Réunion"),
  CountryLocalization("ws", "Wašíčuiyapi", "Samoa"),
  CountryLocalization("sm", "Italia Iyápi", "San Marino"),
  CountryLocalization("sa", "Arab Iyápi", "Saudi Arabia"),
  CountryLocalization("sn", "Wašíču Ikčéka Iyápi", "Senegal"),
  CountryLocalization("rs", "Serbia Iyápi", "Serbia"),
  CountryLocalization("cs", "Serbia Iyápi", "Serbia and Montenegro"),
  CountryLocalization("sc", "Wašíču Ikčéka Iyápi", "Seychelles"),
  CountryLocalization("sl", "Wašíčuiyapi", "Sierra Leone"),
  CountryLocalization("sg", "Tamil Iyápi", "Singapore"),
  CountryLocalization("sx", "Wašíčuiyapi", "Sint Maarten"),
  CountryLocalization("sk", "Slovak Iyápi", "Slovakia"),
  CountryLocalization("si", "Slovenian Iyápi", "Slovenia"),
  CountryLocalization("sb", "Wašíčuiyapi", "Solomon Islands"),
  CountryLocalization("so", "Arab Iyápi", "Somalia"),
  CountryLocalization("za", "Wašíčuiyapi", "South Africa"),
  CountryLocalization("kr", "Korea Iyápi", "South Korea"),
  CountryLocalization("ss", "nus", "South Sudan"),
  CountryLocalization("es", "Spayóla Iyápi", "Spayólaȟče Makȟóčhe"),
  CountryLocalization("lk", "Tamil Iyápi", "Sri Lanka"),
  CountryLocalization("bl", "Wašíču Ikčéka Iyápi", "St. Barthélemy"),
  CountryLocalization("sh", "Wašíčuiyapi", "St. Helena"),
  CountryLocalization("kn", "Wašíčuiyapi", "St. Kitts & Nevis"),
  CountryLocalization("lc", "Wašíčuiyapi", "St. Lucia"),
  CountryLocalization("mf", "Wašíču Ikčéka Iyápi", "St. Martin"),
  CountryLocalization("pm", "Wašíču Ikčéka Iyápi", "St. Pierre & Miquelon"),
  CountryLocalization("vc", "Wašíčuiyapi", "St. Vincent & Grenadines"),
  CountryLocalization("sd", "Arab Iyápi", "Sudan"),
  CountryLocalization("sr", "Dutch Iyápi", "Suriname"),
  CountryLocalization("sj", "Norwegian Bokmål", "Svalbard & Jan Mayen"),
  CountryLocalization("sz", "Wašíčuiyapi", "Eswatini"),
  CountryLocalization("se", "Swedish Iyápi", "Sweden"),
  CountryLocalization("ch", "Swiss German", "Switzerland"),
  CountryLocalization("sy", "Arab Iyápi", "Syria"),
  CountryLocalization("st", "Portuguese Iyápi", "São Tomé & Príncipe"),
  CountryLocalization("tw", "Pȟečhókaŋ Háŋska Iyápi", "Taiwan"),
  CountryLocalization("tj", "Tajik Iyápi", "Tajikistan"),
  CountryLocalization("tz", "kde", "Tanzania"),
  CountryLocalization("th", "Thai Iyápi", "Thailand"),
  CountryLocalization("tl", "Portuguese Iyápi", "Timor-Leste"),
  CountryLocalization("tg", "Wašíču Ikčéka Iyápi", "Togo"),
  CountryLocalization("tk", "Wašíčuiyapi", "Tokelau"),
  CountryLocalization("to", "Tongan Iyápi", "Tonga"),
  CountryLocalization("tt", "Wašíčuiyapi", "Trinidad & Tobago"),
  CountryLocalization("tn", "Wašíču Ikčéka Iyápi", "Tunisia"),
  CountryLocalization("tr", "Turkish Iyápi", "Turkey"),
  CountryLocalization("tm", "Turkmen Iyápi", "Turkmenistan"),
  CountryLocalization("tc", "Wašíčuiyapi", "Turks & Caicos Islands"),
  CountryLocalization("tv", "Wašíčuiyapi", "Tuvalu"),
  CountryLocalization("um", "Wašíčuiyapi", "U.S. Outlying Islands"),
  CountryLocalization("vi", "Wašíčuiyapi", "U.S. Virgin Islands"),
  CountryLocalization("ug", "Swahili Iyápi", "Uganda"),
  CountryLocalization("ua", "Ukrain Iyápi", "Ukraine"),
  CountryLocalization("ae", "Arab Iyápi", "United Arab Emirates"),
  CountryLocalization("gb", "Wašíčuiyapi", "United Kingdom"),
  CountryLocalization("us", "Lakȟólʼiyapi", "Mílahaŋska Tȟamákȟočhe"),
  CountryLocalization("uy", "Spayóla Iyápi", "Uruguay"),
  CountryLocalization("uz", "Uzbek Iyápi", "Uzbekistan"),
  CountryLocalization("vu", "Wašíču Ikčéka Iyápi", "Vanuatu"),
  CountryLocalization("va", "Italia Iyápi", "Vatican City"),
  CountryLocalization("ve", "Spayóla Iyápi", "Venezuela"),
  CountryLocalization("vn", "Vietnamese Iyápi", "Vietnam"),
  CountryLocalization("wf", "Wašíču Ikčéka Iyápi", "Wallis & Futuna"),
  CountryLocalization("eh", "Arab Iyápi", "Western Sahara"),
  CountryLocalization("ye", "Arab Iyápi", "Yemen"),
  CountryLocalization("zm", "Wašíčuiyapi", "Zambia"),
  CountryLocalization("zw", "North Ndebele", "Zimbabwe"),
  CountryLocalization("ax", "Swedish Iyápi", "Åland Islands"),
)
