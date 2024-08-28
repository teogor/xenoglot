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
 * language code pl.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_pl: List<CountryLocalization> = listOf(
  CountryLocalization("af", "perski", "Afganistan"),
  CountryLocalization("al", "albański", "Albania"),
  CountryLocalization("dz", "francuski", "Algieria"),
  CountryLocalization("as", "angielski", "Samoa Amerykańskie"),
  CountryLocalization("ad", "kataloński", "Andora"),
  CountryLocalization("ao", "lingala", "Angola"),
  CountryLocalization("ai", "angielski", "Anguilla"),
  CountryLocalization("ag", "angielski", "Antigua i Barbuda"),
  CountryLocalization("ar", "hiszpański", "Argentyna"),
  CountryLocalization("am", "ormiański", "Armenia"),
  CountryLocalization("aw", "niderlandzki", "Aruba"),
  CountryLocalization("au", "angielski", "Australia"),
  CountryLocalization("at", "angielski", "Austria"),
  CountryLocalization("az", "azerbejdżański", "Azerbejdżan"),
  CountryLocalization("bs", "angielski", "Bahamy"),
  CountryLocalization("bh", "arabski", "Bahrajn"),
  CountryLocalization("bd", "bengalski", "Bangladesz"),
  CountryLocalization("bb", "angielski", "Barbados"),
  CountryLocalization("by", "białoruski", "Białoruś"),
  CountryLocalization("be", "francuski", "Belgia"),
  CountryLocalization("bz", "angielski", "Belize"),
  CountryLocalization("bj", "francuski", "Benin"),
  CountryLocalization("bm", "angielski", "Bermudy"),
  CountryLocalization("bt", "dzongkha", "Bhutan"),
  CountryLocalization("bo", "hiszpański", "Boliwia"),
  CountryLocalization("ba", "bośniacki", "Bośnia i Hercegowina"),
  CountryLocalization("bw", "angielski", "Botswana"),
  CountryLocalization("br", "portugalski", "Brazylia"),
  CountryLocalization("io", "angielski", "Brytyjskie Terytorium Oceanu Indyjskiego"),
  CountryLocalization("vg", "angielski", "Brytyjskie Wyspy Dziewicze"),
  CountryLocalization("bn", "malajski", "Brunei"),
  CountryLocalization("bg", "bułgarski", "Bułgaria"),
  CountryLocalization("bf", "francuski", "Burkina Faso"),
  CountryLocalization("bi", "francuski", "Burundi"),
  CountryLocalization("kh", "khmerski", "Kambodża"),
  CountryLocalization("cm", "basaa", "Kamerun"),
  CountryLocalization("ca", "francuski", "Kanada"),
  CountryLocalization("ic", "hiszpański", "Wyspy Kanaryjskie"),
  CountryLocalization("cv", "kreolski Wysp Zielonego Przylądka", "Republika Zielonego Przylądka"),
  CountryLocalization("bq", "niderlandzki", "Niderlandy Karaibskie"),
  CountryLocalization("ky", "angielski", "Kajmany"),
  CountryLocalization("cf", "lingala", "Republika Środkowoafrykańska"),
  CountryLocalization("ea", "hiszpański", "Ceuta i Melilla"),
  CountryLocalization("td", "arabski", "Czad"),
  CountryLocalization("cl", "hiszpański", "Chile"),
  CountryLocalization("cn", "tybetański", "Chiny"),
  CountryLocalization("cx", "angielski", "Wyspa Bożego Narodzenia"),
  CountryLocalization("cc", "angielski", "Wyspy Kokosowe"),
  CountryLocalization("co", "hiszpański", "Kolumbia"),
  CountryLocalization("km", "arabski", "Komory"),
  CountryLocalization("cg", "lingala", "Kongo"),
  CountryLocalization("cd", "suahili", "Demokratyczna Republika Konga"),
  CountryLocalization("ck", "angielski", "Wyspy Cooka"),
  CountryLocalization("cr", "hiszpański", "Kostaryka"),
  CountryLocalization("hr", "chorwacki", "Chorwacja"),
  CountryLocalization("cu", "hiszpański", "Kuba"),
  CountryLocalization("cw", "niderlandzki", "Curaçao"),
  CountryLocalization("cy", "angielski", "Cypr"),
  CountryLocalization("cz", "czeski", "Czechy"),
  CountryLocalization("ci", "francuski", "Côte d’Ivoire"),
  CountryLocalization("dk", "angielski", "Dania"),
  CountryLocalization("dg", "angielski", "Diego Garcia"),
  CountryLocalization("dj", "francuski", "Dżibuti"),
  CountryLocalization("dm", "angielski", "Dominika"),
  CountryLocalization("do", "hiszpański", "Dominikana"),
  CountryLocalization("ec", "keczua", "Ekwador"),
  CountryLocalization("eg", "arabski", "Egipt"),
  CountryLocalization("sv", "hiszpański", "Salwador"),
  CountryLocalization("gq", "hiszpański", "Gwinea Równikowa"),
  CountryLocalization("er", "tigrinia", "Erytrea"),
  CountryLocalization("ee", "estoński", "Estonia"),
  CountryLocalization("et", "amharski", "Etiopia"),
  CountryLocalization("fk", "angielski", "Falklandy"),
  CountryLocalization("fo", "farerski", "Wyspy Owcze"),
  CountryLocalization("fj", "angielski", "Fidżi"),
  CountryLocalization("fi", "szwedzki", "Finlandia"),
  CountryLocalization("fr", "szwajcarski niemiecki", "Francja"),
  CountryLocalization("gf", "francuski", "Gujana Francuska"),
  CountryLocalization("pf", "francuski", "Polinezja Francuska"),
  CountryLocalization("ga", "francuski", "Gabon"),
  CountryLocalization("gm", "angielski", "Gambia"),
  CountryLocalization("ge", "osetyjski", "Gruzja"),
  CountryLocalization("de", "dolnołużycki", "Niemcy"),
  CountryLocalization("gh", "angielski", "Ghana"),
  CountryLocalization("gi", "angielski", "Gibraltar"),
  CountryLocalization("gr", "grecki", "Grecja"),
  CountryLocalization("gl", "grenlandzki", "Grenlandia"),
  CountryLocalization("gd", "angielski", "Grenada"),
  CountryLocalization("gp", "francuski", "Gwadelupa"),
  CountryLocalization("gu", "angielski", "Guam"),
  CountryLocalization("gt", "hiszpański", "Gwatemala"),
  CountryLocalization("gg", "angielski", "Guernsey"),
  CountryLocalization("gn", "francuski", "Gwinea"),
  CountryLocalization("gw", "portugalski", "Gwinea Bissau"),
  CountryLocalization("gy", "angielski", "Gujana"),
  CountryLocalization("ht", "francuski", "Haiti"),
  CountryLocalization("hn", "hiszpański", "Honduras"),
  CountryLocalization("hk", "chiński", "SRA Hongkong (Chiny)"),
  CountryLocalization("hu", "węgierski", "Węgry"),
  CountryLocalization("is", "islandzki", "Islandia"),
  CountryLocalization("in", "nepalski", "Indie"),
  CountryLocalization("id", "indonezyjski", "Indonezja"),
  CountryLocalization("ir", "perski", "Iran"),
  CountryLocalization("iq", "luryjski północny", "Irak"),
  CountryLocalization("ie", "angielski", "Irlandia"),
  CountryLocalization("im", "manx", "Wyspa Man"),
  CountryLocalization("il", "angielski", "Izrael"),
  CountryLocalization("it", "niemiecki", "Włochy"),
  CountryLocalization("jm", "angielski", "Jamajka"),
  CountryLocalization("jp", "japoński", "Japonia"),
  CountryLocalization("je", "angielski", "Jersey"),
  CountryLocalization("jo", "arabski", "Jordania"),
  CountryLocalization("kz", "kazachski", "Kazachstan"),
  CountryLocalization("ke", "somalijski", "Kenia"),
  CountryLocalization("ki", "angielski", "Kiribati"),
  CountryLocalization("xk", "serbski", "Kosowo"),
  CountryLocalization("kw", "arabski", "Kuwejt"),
  CountryLocalization("kg", "rosyjski", "Kirgistan"),
  CountryLocalization("la", "laotański", "Laos"),
  CountryLocalization("lv", "łotewski", "Łotwa"),
  CountryLocalization("lb", "arabski", "Liban"),
  CountryLocalization("ls", "angielski", "Lesotho"),
  CountryLocalization("lr", "angielski", "Liberia"),
  CountryLocalization("ly", "arabski", "Libia"),
  CountryLocalization("li", "szwajcarski niemiecki", "Liechtenstein"),
  CountryLocalization("lt", "litewski", "Litwa"),
  CountryLocalization("lu", "luksemburski", "Luksemburg"),
  CountryLocalization("mo", "portugalski", "SRA Makau (Chiny)"),
  CountryLocalization("mk", "albański", "Macedonia"),
  CountryLocalization("mg", "francuski", "Madagaskar"),
  CountryLocalization("mw", "angielski", "Malawi"),
  CountryLocalization("my", "tamilski", "Malezja"),
  CountryLocalization("ml", "francuski", "Mali"),
  CountryLocalization("mt", "angielski", "Malta"),
  CountryLocalization("mh", "angielski", "Wyspy Marshalla"),
  CountryLocalization("mq", "francuski", "Martynika"),
  CountryLocalization("mr", "arabski", "Mauretania"),
  CountryLocalization("mu", "kreolski Mauritiusa", "Mauritius"),
  CountryLocalization("yt", "francuski", "Majotta"),
  CountryLocalization("mx", "hiszpański", "Meksyk"),
  CountryLocalization("fm", "angielski", "Mikronezja"),
  CountryLocalization("md", "rosyjski", "Mołdawia"),
  CountryLocalization("mc", "francuski", "Monako"),
  CountryLocalization("mn", "mongolski", "Mongolia"),
  CountryLocalization("me", "serbski", "Czarnogóra"),
  CountryLocalization("ms", "angielski", "Montserrat"),
  CountryLocalization("ma", "tamazight (Atlas Środkowy)", "Maroko"),
  CountryLocalization("mz", "makua", "Mozambik"),
  CountryLocalization("mm", "birmański", "Mjanma (Birma)"),
  CountryLocalization("na", "angielski", "Namibia"),
  CountryLocalization("nr", "angielski", "Nauru"),
  CountryLocalization("np", "nepalski", "Nepal"),
  CountryLocalization("nl", "angielski", "Holandia"),
  CountryLocalization("nc", "francuski", "Nowa Kaledonia"),
  CountryLocalization("nz", "angielski", "Nowa Zelandia"),
  CountryLocalization("ni", "hiszpański", "Nikaragua"),
  CountryLocalization("ne", "hausa", "Niger"),
  CountryLocalization("ng", "hausa", "Nigeria"),
  CountryLocalization("nu", "angielski", "Niue"),
  CountryLocalization("nf", "angielski", "Norfolk"),
  CountryLocalization("kp", "koreański", "Korea Północna"),
  CountryLocalization("mp", "angielski", "Mariany Północne"),
  CountryLocalization("no", "północnolapoński", "Norwegia"),
  CountryLocalization("om", "arabski", "Oman"),
  CountryLocalization("pk", "angielski", "Pakistan"),
  CountryLocalization("pw", "angielski", "Palau"),
  CountryLocalization("ps", "arabski", "Terytoria Palestyńskie"),
  CountryLocalization("pa", "hiszpański", "Panama"),
  CountryLocalization("pg", "angielski", "Papua-Nowa Gwinea"),
  CountryLocalization("py", "hiszpański", "Paragwaj"),
  CountryLocalization("pe", "hiszpański", "Peru"),
  CountryLocalization("ph", "filipino", "Filipiny"),
  CountryLocalization("pn", "angielski", "Pitcairn"),
  CountryLocalization("pl", "polski", "Polska"),
  CountryLocalization("pt", "portugalski", "Portugalia"),
  CountryLocalization("pr", "angielski", "Portoryko"),
  CountryLocalization("qa", "arabski", "Katar"),
  CountryLocalization("ro", "rumuński", "Rumunia"),
  CountryLocalization("ru", "tatarski", "Rosja"),
  CountryLocalization("rw", "angielski", "Rwanda"),
  CountryLocalization("re", "francuski", "Reunion"),
  CountryLocalization("ws", "angielski", "Samoa"),
  CountryLocalization("sm", "włoski", "San Marino"),
  CountryLocalization("sa", "arabski", "Arabia Saudyjska"),
  CountryLocalization("sn", "francuski", "Senegal"),
  CountryLocalization("rs", "serbski", "Serbia"),
  CountryLocalization("cs", "serbski", "Serbia and Montenegro"),
  CountryLocalization("sc", "francuski", "Seszele"),
  CountryLocalization("sl", "angielski", "Sierra Leone"),
  CountryLocalization("sg", "tamilski", "Singapur"),
  CountryLocalization("sx", "angielski", "Sint Maarten"),
  CountryLocalization("sk", "słowacki", "Słowacja"),
  CountryLocalization("si", "słoweński", "Słowenia"),
  CountryLocalization("sb", "angielski", "Wyspy Salomona"),
  CountryLocalization("so", "arabski", "Somalia"),
  CountryLocalization("za", "angielski", "Republika Południowej Afryki"),
  CountryLocalization("kr", "koreański", "Korea Południowa"),
  CountryLocalization("ss", "nuer", "Sudan Południowy"),
  CountryLocalization("es", "hiszpański", "Hiszpania"),
  CountryLocalization("lk", "tamilski", "Sri Lanka"),
  CountryLocalization("bl", "francuski", "Saint-Barthélemy"),
  CountryLocalization("sh", "angielski", "Wyspa Świętej Heleny"),
  CountryLocalization("kn", "angielski", "Saint Kitts i Nevis"),
  CountryLocalization("lc", "angielski", "Saint Lucia"),
  CountryLocalization("mf", "francuski", "Saint-Martin"),
  CountryLocalization("pm", "francuski", "Saint-Pierre i Miquelon"),
  CountryLocalization("vc", "angielski", "Saint Vincent i Grenadyny"),
  CountryLocalization("sd", "arabski", "Sudan"),
  CountryLocalization("sr", "niderlandzki", "Surinam"),
  CountryLocalization("sj", "norweski (bokmål)", "Svalbard i Jan Mayen"),
  CountryLocalization("sz", "angielski", "Suazi"),
  CountryLocalization("se", "szwedzki", "Szwecja"),
  CountryLocalization("ch", "szwajcarski niemiecki", "Szwajcaria"),
  CountryLocalization("sy", "arabski", "Syria"),
  CountryLocalization("st", "portugalski", "Wyspy Świętego Tomasza i Książęca"),
  CountryLocalization("tw", "chiński", "Tajwan"),
  CountryLocalization("tj", "tadżycki", "Tadżykistan"),
  CountryLocalization("tz", "makonde", "Tanzania"),
  CountryLocalization("th", "tajski", "Tajlandia"),
  CountryLocalization("tl", "portugalski", "Timor Wschodni"),
  CountryLocalization("tg", "francuski", "Togo"),
  CountryLocalization("tk", "angielski", "Tokelau"),
  CountryLocalization("to", "tonga", "Tonga"),
  CountryLocalization("tt", "angielski", "Trynidad i Tobago"),
  CountryLocalization("tn", "francuski", "Tunezja"),
  CountryLocalization("tr", "turecki", "Turcja"),
  CountryLocalization("tm", "turkmeński", "Turkmenistan"),
  CountryLocalization("tc", "angielski", "Turks i Caicos"),
  CountryLocalization("tv", "angielski", "Tuvalu"),
  CountryLocalization("um", "angielski", "Dalekie Wyspy Mniejsze Stanów Zjednoczonych"),
  CountryLocalization("vi", "angielski", "Wyspy Dziewicze Stanów Zjednoczonych"),
  CountryLocalization("ug", "suahili", "Uganda"),
  CountryLocalization("ua", "ukraiński", "Ukraina"),
  CountryLocalization("ae", "arabski", "Zjednoczone Emiraty Arabskie"),
  CountryLocalization("gb", "angielski", "Wielka Brytania"),
  CountryLocalization("us", "lakota", "Stany Zjednoczone"),
  CountryLocalization("uy", "hiszpański", "Urugwaj"),
  CountryLocalization("uz", "uzbecki", "Uzbekistan"),
  CountryLocalization("vu", "francuski", "Vanuatu"),
  CountryLocalization("va", "włoski", "Watykan"),
  CountryLocalization("ve", "hiszpański", "Wenezuela"),
  CountryLocalization("vn", "wietnamski", "Wietnam"),
  CountryLocalization("wf", "francuski", "Wallis i Futuna"),
  CountryLocalization("eh", "arabski", "Sahara Zachodnia"),
  CountryLocalization("ye", "arabski", "Jemen"),
  CountryLocalization("zm", "angielski", "Zambia"),
  CountryLocalization("zw", "ndebele północny", "Zimbabwe"),
  CountryLocalization("ax", "szwedzki", "Wyspy Alandzkie"),
)
