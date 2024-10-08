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
 * language code en.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_en: List<CountryLocalization> = listOf(
  CountryLocalization("af", "Persian", "Afghanistan"),
  CountryLocalization("al", "Albanian", "Albania"),
  CountryLocalization("dz", "French", "Algeria"),
  CountryLocalization("as", "English", "American Samoa"),
  CountryLocalization("ad", "Catalan", "Andorra"),
  CountryLocalization("ao", "Lingala", "Angola"),
  CountryLocalization("ai", "English", "Anguilla"),
  CountryLocalization("ag", "English", "Antigua & Barbuda"),
  CountryLocalization("ar", "Spanish", "Argentina"),
  CountryLocalization("am", "Armenian", "Armenia"),
  CountryLocalization("aw", "Dutch", "Aruba"),
  CountryLocalization("au", "English", "Australia"),
  CountryLocalization("at", "English", "Austria"),
  CountryLocalization("az", "Azerbaijani", "Azerbaijan"),
  CountryLocalization("bs", "English", "Bahamas"),
  CountryLocalization("bh", "Arabic", "Bahrain"),
  CountryLocalization("bd", "Bangla", "Bangladesh"),
  CountryLocalization("bb", "English", "Barbados"),
  CountryLocalization("by", "Belarusian", "Belarus"),
  CountryLocalization("be", "French", "Belgium"),
  CountryLocalization("bz", "English", "Belize"),
  CountryLocalization("bj", "French", "Benin"),
  CountryLocalization("bm", "English", "Bermuda"),
  CountryLocalization("bt", "Dzongkha", "Bhutan"),
  CountryLocalization("bo", "Spanish", "Bolivia"),
  CountryLocalization("ba", "Bosnian", "Bosnia & Herzegovina"),
  CountryLocalization("bw", "English", "Botswana"),
  CountryLocalization("br", "Portuguese", "Brazil"),
  CountryLocalization("io", "English", "British Indian Ocean Territory"),
  CountryLocalization("vg", "English", "British Virgin Islands"),
  CountryLocalization("bn", "Malay", "Brunei"),
  CountryLocalization("bg", "Bulgarian", "Bulgaria"),
  CountryLocalization("bf", "French", "Burkina Faso"),
  CountryLocalization("bi", "French", "Burundi"),
  CountryLocalization("kh", "Khmer", "Cambodia"),
  CountryLocalization("cm", "Basaa", "Cameroon"),
  CountryLocalization("ca", "French", "Canada"),
  CountryLocalization("ic", "Spanish", "Canary Islands"),
  CountryLocalization("cv", "Kabuverdianu", "Cape Verde"),
  CountryLocalization("bq", "Dutch", "Caribbean Netherlands"),
  CountryLocalization("ky", "English", "Cayman Islands"),
  CountryLocalization("cf", "Lingala", "Central African Republic"),
  CountryLocalization("ea", "Spanish", "Ceuta & Melilla"),
  CountryLocalization("td", "Arabic", "Chad"),
  CountryLocalization("cl", "Spanish", "Chile"),
  CountryLocalization("cn", "Tibetan", "China"),
  CountryLocalization("cx", "English", "Christmas Island"),
  CountryLocalization("cc", "English", "Cocos (Keeling) Islands"),
  CountryLocalization("co", "Spanish", "Colombia"),
  CountryLocalization("km", "Arabic", "Comoros"),
  CountryLocalization("cg", "Lingala", "Congo - Brazzaville"),
  CountryLocalization("cd", "Swahili", "Congo - Kinshasa"),
  CountryLocalization("ck", "English", "Cook Islands"),
  CountryLocalization("cr", "Spanish", "Costa Rica"),
  CountryLocalization("hr", "Croatian", "Croatia"),
  CountryLocalization("cu", "Spanish", "Cuba"),
  CountryLocalization("cw", "Dutch", "Curaçao"),
  CountryLocalization("cy", "English", "Cyprus"),
  CountryLocalization("cz", "Czech", "Czechia"),
  CountryLocalization("ci", "French", "Côte d’Ivoire"),
  CountryLocalization("dk", "English", "Denmark"),
  CountryLocalization("dg", "English", "Diego Garcia"),
  CountryLocalization("dj", "French", "Djibouti"),
  CountryLocalization("dm", "English", "Dominica"),
  CountryLocalization("do", "Spanish", "Dominican Republic"),
  CountryLocalization("ec", "Quechua", "Ecuador"),
  CountryLocalization("eg", "Arabic", "Egypt"),
  CountryLocalization("sv", "Spanish", "El Salvador"),
  CountryLocalization("gq", "Spanish", "Equatorial Guinea"),
  CountryLocalization("er", "Tigrinya", "Eritrea"),
  CountryLocalization("ee", "Estonian", "Estonia"),
  CountryLocalization("et", "Amharic", "Ethiopia"),
  CountryLocalization("fk", "English", "Falkland Islands"),
  CountryLocalization("fo", "Faroese", "Faroe Islands"),
  CountryLocalization("fj", "English", "Fiji"),
  CountryLocalization("fi", "Swedish", "Finland"),
  CountryLocalization("fr", "Swiss German", "France"),
  CountryLocalization("gf", "French", "French Guiana"),
  CountryLocalization("pf", "French", "French Polynesia"),
  CountryLocalization("ga", "French", "Gabon"),
  CountryLocalization("gm", "English", "Gambia"),
  CountryLocalization("ge", "Ossetic", "Georgia"),
  CountryLocalization("de", "Lower Sorbian", "Germany"),
  CountryLocalization("gh", "English", "Ghana"),
  CountryLocalization("gi", "English", "Gibraltar"),
  CountryLocalization("gr", "Greek", "Greece"),
  CountryLocalization("gl", "Kalaallisut", "Greenland"),
  CountryLocalization("gd", "English", "Grenada"),
  CountryLocalization("gp", "French", "Guadeloupe"),
  CountryLocalization("gu", "English", "Guam"),
  CountryLocalization("gt", "Spanish", "Guatemala"),
  CountryLocalization("gg", "English", "Guernsey"),
  CountryLocalization("gn", "French", "Guinea"),
  CountryLocalization("gw", "Portuguese", "Guinea-Bissau"),
  CountryLocalization("gy", "English", "Guyana"),
  CountryLocalization("ht", "French", "Haiti"),
  CountryLocalization("hn", "Spanish", "Honduras"),
  CountryLocalization("hk", "Chinese", "Hong Kong SAR China"),
  CountryLocalization("hu", "Hungarian", "Hungary"),
  CountryLocalization("is", "Icelandic", "Iceland"),
  CountryLocalization("in", "Nepali", "India"),
  CountryLocalization("id", "Indonesian", "Indonesia"),
  CountryLocalization("ir", "Persian", "Iran"),
  CountryLocalization("iq", "Northern Luri", "Iraq"),
  CountryLocalization("ie", "English", "Ireland"),
  CountryLocalization("im", "Manx", "Isle of Man"),
  CountryLocalization("il", "English", "Israel"),
  CountryLocalization("it", "German", "Italy"),
  CountryLocalization("jm", "English", "Jamaica"),
  CountryLocalization("jp", "Japanese", "Japan"),
  CountryLocalization("je", "English", "Jersey"),
  CountryLocalization("jo", "Arabic", "Jordan"),
  CountryLocalization("kz", "Kazakh", "Kazakhstan"),
  CountryLocalization("ke", "Somali", "Kenya"),
  CountryLocalization("ki", "English", "Kiribati"),
  CountryLocalization("xk", "Serbian", "Kosovo"),
  CountryLocalization("kw", "Arabic", "Kuwait"),
  CountryLocalization("kg", "Russian", "Kyrgyzstan"),
  CountryLocalization("la", "Lao", "Laos"),
  CountryLocalization("lv", "Latvian", "Latvia"),
  CountryLocalization("lb", "Arabic", "Lebanon"),
  CountryLocalization("ls", "English", "Lesotho"),
  CountryLocalization("lr", "English", "Liberia"),
  CountryLocalization("ly", "Arabic", "Libya"),
  CountryLocalization("li", "Swiss German", "Liechtenstein"),
  CountryLocalization("lt", "Lithuanian", "Lithuania"),
  CountryLocalization("lu", "Luxembourgish", "Luxembourg"),
  CountryLocalization("mo", "Portuguese", "Macau SAR China"),
  CountryLocalization("mk", "Albanian", "Macedonia"),
  CountryLocalization("mg", "French", "Madagascar"),
  CountryLocalization("mw", "English", "Malawi"),
  CountryLocalization("my", "Tamil", "Malaysia"),
  CountryLocalization("ml", "French", "Mali"),
  CountryLocalization("mt", "English", "Malta"),
  CountryLocalization("mh", "English", "Marshall Islands"),
  CountryLocalization("mq", "French", "Martinique"),
  CountryLocalization("mr", "Arabic", "Mauritania"),
  CountryLocalization("mu", "Morisyen", "Mauritius"),
  CountryLocalization("yt", "French", "Mayotte"),
  CountryLocalization("mx", "Spanish", "Mexico"),
  CountryLocalization("fm", "English", "Micronesia"),
  CountryLocalization("md", "Russian", "Moldova"),
  CountryLocalization("mc", "French", "Monaco"),
  CountryLocalization("mn", "Mongolian", "Mongolia"),
  CountryLocalization("me", "Serbian", "Montenegro"),
  CountryLocalization("ms", "English", "Montserrat"),
  CountryLocalization("ma", "Central Atlas Tamazight", "Morocco"),
  CountryLocalization("mz", "Makhuwa-Meetto", "Mozambique"),
  CountryLocalization("mm", "Burmese", "Myanmar (Burma)"),
  CountryLocalization("na", "English", "Namibia"),
  CountryLocalization("nr", "English", "Nauru"),
  CountryLocalization("np", "Nepali", "Nepal"),
  CountryLocalization("nl", "English", "Netherlands"),
  CountryLocalization("nc", "French", "New Caledonia"),
  CountryLocalization("nz", "English", "New Zealand"),
  CountryLocalization("ni", "Spanish", "Nicaragua"),
  CountryLocalization("ne", "Hausa", "Niger"),
  CountryLocalization("ng", "Hausa", "Nigeria"),
  CountryLocalization("nu", "English", "Niue"),
  CountryLocalization("nf", "English", "Norfolk Island"),
  CountryLocalization("kp", "Korean", "North Korea"),
  CountryLocalization("mp", "English", "Northern Mariana Islands"),
  CountryLocalization("no", "Northern Sami", "Norway"),
  CountryLocalization("om", "Arabic", "Oman"),
  CountryLocalization("pk", "English", "Pakistan"),
  CountryLocalization("pw", "English", "Palau"),
  CountryLocalization("ps", "Arabic", "Palestinian Territories"),
  CountryLocalization("pa", "Spanish", "Panama"),
  CountryLocalization("pg", "English", "Papua New Guinea"),
  CountryLocalization("py", "Spanish", "Paraguay"),
  CountryLocalization("pe", "Spanish", "Peru"),
  CountryLocalization("ph", "Filipino", "Philippines"),
  CountryLocalization("pn", "English", "Pitcairn Islands"),
  CountryLocalization("pl", "Polish", "Poland"),
  CountryLocalization("pt", "Portuguese", "Portugal"),
  CountryLocalization("pr", "English", "Puerto Rico"),
  CountryLocalization("qa", "Arabic", "Qatar"),
  CountryLocalization("ro", "Romanian", "Romania"),
  CountryLocalization("ru", "Tatar", "Russia"),
  CountryLocalization("rw", "English", "Rwanda"),
  CountryLocalization("re", "French", "Réunion"),
  CountryLocalization("ws", "English", "Samoa"),
  CountryLocalization("sm", "Italian", "San Marino"),
  CountryLocalization("sa", "Arabic", "Saudi Arabia"),
  CountryLocalization("sn", "French", "Senegal"),
  CountryLocalization("rs", "Serbian", "Serbia"),
  CountryLocalization("cs", "Serbian", "Serbia and Montenegro"),
  CountryLocalization("sc", "French", "Seychelles"),
  CountryLocalization("sl", "English", "Sierra Leone"),
  CountryLocalization("sg", "Tamil", "Singapore"),
  CountryLocalization("sx", "English", "Sint Maarten"),
  CountryLocalization("sk", "Slovak", "Slovakia"),
  CountryLocalization("si", "Slovenian", "Slovenia"),
  CountryLocalization("sb", "English", "Solomon Islands"),
  CountryLocalization("so", "Arabic", "Somalia"),
  CountryLocalization("za", "English", "South Africa"),
  CountryLocalization("kr", "Korean", "South Korea"),
  CountryLocalization("ss", "Nuer", "South Sudan"),
  CountryLocalization("es", "Spanish", "Spain"),
  CountryLocalization("lk", "Tamil", "Sri Lanka"),
  CountryLocalization("bl", "French", "St. Barthélemy"),
  CountryLocalization("sh", "English", "St. Helena"),
  CountryLocalization("kn", "English", "St. Kitts & Nevis"),
  CountryLocalization("lc", "English", "St. Lucia"),
  CountryLocalization("mf", "French", "St. Martin"),
  CountryLocalization("pm", "French", "St. Pierre & Miquelon"),
  CountryLocalization("vc", "English", "St. Vincent & Grenadines"),
  CountryLocalization("sd", "Arabic", "Sudan"),
  CountryLocalization("sr", "Dutch", "Suriname"),
  CountryLocalization("sj", "Norwegian Bokmål", "Svalbard & Jan Mayen"),
  CountryLocalization("sz", "English", "Swaziland"),
  CountryLocalization("se", "Swedish", "Sweden"),
  CountryLocalization("ch", "Swiss German", "Switzerland"),
  CountryLocalization("sy", "Arabic", "Syria"),
  CountryLocalization("st", "Portuguese", "São Tomé & Príncipe"),
  CountryLocalization("tw", "Chinese", "Taiwan"),
  CountryLocalization("tj", "Tajik", "Tajikistan"),
  CountryLocalization("tz", "Makonde", "Tanzania"),
  CountryLocalization("th", "Thai", "Thailand"),
  CountryLocalization("tl", "Portuguese", "Timor-Leste"),
  CountryLocalization("tg", "French", "Togo"),
  CountryLocalization("tk", "English", "Tokelau"),
  CountryLocalization("to", "Tongan", "Tonga"),
  CountryLocalization("tt", "English", "Trinidad & Tobago"),
  CountryLocalization("tn", "French", "Tunisia"),
  CountryLocalization("tr", "Turkish", "Turkey"),
  CountryLocalization("tm", "Turkmen", "Turkmenistan"),
  CountryLocalization("tc", "English", "Turks & Caicos Islands"),
  CountryLocalization("tv", "English", "Tuvalu"),
  CountryLocalization("um", "English", "U.S. Outlying Islands"),
  CountryLocalization("vi", "English", "U.S. Virgin Islands"),
  CountryLocalization("ug", "Swahili", "Uganda"),
  CountryLocalization("ua", "Ukrainian", "Ukraine"),
  CountryLocalization("ae", "Arabic", "United Arab Emirates"),
  CountryLocalization("gb", "English", "United Kingdom"),
  CountryLocalization("us", "Lakota", "United States"),
  CountryLocalization("uy", "Spanish", "Uruguay"),
  CountryLocalization("uz", "Uzbek", "Uzbekistan"),
  CountryLocalization("vu", "French", "Vanuatu"),
  CountryLocalization("va", "Italian", "Vatican City"),
  CountryLocalization("ve", "Spanish", "Venezuela"),
  CountryLocalization("vn", "Vietnamese", "Vietnam"),
  CountryLocalization("wf", "French", "Wallis & Futuna"),
  CountryLocalization("eh", "Arabic", "Western Sahara"),
  CountryLocalization("ye", "Arabic", "Yemen"),
  CountryLocalization("zm", "English", "Zambia"),
  CountryLocalization("zw", "North Ndebele", "Zimbabwe"),
  CountryLocalization("ax", "Swedish", "Åland Islands"),
)
