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
 * language code ln.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_ln: List<CountryLocalization> = listOf(
  CountryLocalization("af", "lipelésanɛ", "Afiganisitá"),
  CountryLocalization("al", "Albanian", "Alibani"),
  CountryLocalization("dz", "lifalansɛ́", "Alizɛri"),
  CountryLocalization("as", "lingɛlɛ́sa", "Samoa ya Ameriki"),
  CountryLocalization("ad", "Catalan", "Andorɛ"),
  CountryLocalization("ao", "lingála", "Angóla"),
  CountryLocalization("ai", "lingɛlɛ́sa", "Angiyɛ"),
  CountryLocalization("ag", "lingɛlɛ́sa", "Antiga mpé Barbuda"),
  CountryLocalization("ar", "lisipanye", "Arizantinɛ"),
  CountryLocalization("am", "Armenian", "Amɛni"),
  CountryLocalization("aw", "lifalamá", "Aruba"),
  CountryLocalization("au", "lingɛlɛ́sa", "Ositáli"),
  CountryLocalization("at", "lingɛlɛ́sa", "Otilisi"),
  CountryLocalization("az", "Azerbaijani", "Azɛlɛbaizá"),
  CountryLocalization("bs", "lingɛlɛ́sa", "Bahamasɛ"),
  CountryLocalization("bh", "lialabo", "Bahrɛnɛ"),
  CountryLocalization("bd", "libengali", "Bengalidɛsi"),
  CountryLocalization("bb", "lingɛlɛ́sa", "Barɛbadɛ"),
  CountryLocalization("by", "libyelorisí", "Byelorisi"),
  CountryLocalization("be", "lifalansɛ́", "Beleziki"),
  CountryLocalization("bz", "lingɛlɛ́sa", "Belizɛ"),
  CountryLocalization("bj", "lifalansɛ́", "Benɛ"),
  CountryLocalization("bm", "lingɛlɛ́sa", "Bermuda"),
  CountryLocalization("bt", "Dzongkha", "Butáni"),
  CountryLocalization("bo", "lisipanye", "Bolivi"),
  CountryLocalization("ba", "Bosnian", "Bosini mpé Hezegovine"),
  CountryLocalization("bw", "lingɛlɛ́sa", "Botswana"),
  CountryLocalization("br", "lipulutugɛ́si", "Brezílɛ"),
  CountryLocalization("io", "lingɛlɛ́sa", "Mabelé ya Angɛlɛtɛ́lɛ na mbú ya Indiya"),
  CountryLocalization("vg", "lingɛlɛ́sa", "Bisanga bya Vierzi ya Angɛlɛtɛ́lɛ"),
  CountryLocalization("bn", "limalezi", "Brineyi"),
  CountryLocalization("bg", "libiligali", "Biligari"),
  CountryLocalization("bf", "lifalansɛ́", "Bukina Faso"),
  CountryLocalization("bi", "lifalansɛ́", "Burundi"),
  CountryLocalization("kh", "likambodza", "Kambodza"),
  CountryLocalization("cm", "Basaa", "Kamɛrune"),
  CountryLocalization("ca", "lifalansɛ́", "Kanada"),
  CountryLocalization("ic", "lisipanye", "IC"),
  CountryLocalization("cv", "kea", "Bisanga bya Kapevɛrɛ"),
  CountryLocalization("bq", "lifalamá", "Caribbean Netherlands"),
  CountryLocalization("ky", "lingɛlɛ́sa", "Bisanga bya Kayíma"),
  CountryLocalization("cf", "lingála", "Repibiki ya Afríka ya Káti"),
  CountryLocalization("ea", "lisipanye", "EA"),
  CountryLocalization("td", "lialabo", "Tsádi"),
  CountryLocalization("cl", "lisipanye", "Síli"),
  CountryLocalization("cn", "Tibetan", "Sinɛ"),
  CountryLocalization("cx", "lingɛlɛ́sa", "Christmas Island"),
  CountryLocalization("cc", "lingɛlɛ́sa", "Cocos (Keeling) Islands"),
  CountryLocalization("co", "lisipanye", "Kolombi"),
  CountryLocalization("km", "lialabo", "Komorɛ"),
  CountryLocalization("cg", "lingála", "Kongo"),
  CountryLocalization("cd", "Swahili", "Republíki ya Kongó Demokratíki"),
  CountryLocalization("ck", "lingɛlɛ́sa", "Bisanga bya Kookɛ"),
  CountryLocalization("cr", "lisipanye", "Kositarika"),
  CountryLocalization("hr", "Croatian", "Krowasi"),
  CountryLocalization("cu", "lisipanye", "Kiba"),
  CountryLocalization("cw", "lifalamá", "Curaçao"),
  CountryLocalization("cy", "lingɛlɛ́sa", "Sípɛlɛ"),
  CountryLocalization("cz", "litshekɛ", "Shekia"),
  CountryLocalization("ci", "lifalansɛ́", "Kotídivualɛ"),
  CountryLocalization("dk", "lingɛlɛ́sa", "Danɛmarike"),
  CountryLocalization("dg", "lingɛlɛ́sa", "DG"),
  CountryLocalization("dj", "lifalansɛ́", "Dzibuti"),
  CountryLocalization("dm", "lingɛlɛ́sa", "Domínike"),
  CountryLocalization("do", "lisipanye", "Repibiki ya Domínikɛ"),
  CountryLocalization("ec", "Quechua", "Ekwatɛ́lɛ"),
  CountryLocalization("eg", "lialabo", "Ezípite"),
  CountryLocalization("sv", "lisipanye", "Savadɔrɛ"),
  CountryLocalization("gq", "lisipanye", "Ginɛ́kwatɛ́lɛ"),
  CountryLocalization("er", "Tigrinya", "Elitelɛ"),
  CountryLocalization("ee", "Estonian", "Esitoni"),
  CountryLocalization("et", "liamariki", "Etsíopi"),
  CountryLocalization("fk", "lingɛlɛ́sa", "Bisanga bya Maluni"),
  CountryLocalization("fo", "Faroese", "Faroe Islands"),
  CountryLocalization("fj", "lingɛlɛ́sa", "Fidzi"),
  CountryLocalization("fi", "lisuwedɛ", "Filandɛ"),
  CountryLocalization("fr", "Swiss German", "Falánsɛ"),
  CountryLocalization("gf", "lifalansɛ́", "Giyanɛ ya Falánsɛ"),
  CountryLocalization("pf", "lifalansɛ́", "Polinezi ya Falánsɛ"),
  CountryLocalization("ga", "lifalansɛ́", "Gabɔ"),
  CountryLocalization("gm", "lingɛlɛ́sa", "Gambi"),
  CountryLocalization("ge", "Ossetic", "Zorzi"),
  CountryLocalization("de", "Lower Sorbian", "Alemani"),
  CountryLocalization("gh", "lingɛlɛ́sa", "Gana"),
  CountryLocalization("gi", "lingɛlɛ́sa", "Zibatalɛ"),
  CountryLocalization("gr", "ligeleki", "Geleki"),
  CountryLocalization("gl", "Kalaallisut", "Gowelande"),
  CountryLocalization("gd", "lingɛlɛ́sa", "Gelenadɛ"),
  CountryLocalization("gp", "lifalansɛ́", "Gwadɛlupɛ"),
  CountryLocalization("gu", "lingɛlɛ́sa", "Gwamɛ"),
  CountryLocalization("gt", "lisipanye", "Gwatémala"),
  CountryLocalization("gg", "lingɛlɛ́sa", "Guernesey"),
  CountryLocalization("gn", "lifalansɛ́", "Ginɛ"),
  CountryLocalization("gw", "lipulutugɛ́si", "Ginɛbisau"),
  CountryLocalization("gy", "lingɛlɛ́sa", "Giyane"),
  CountryLocalization("ht", "lifalansɛ́", "Ayiti"),
  CountryLocalization("hn", "lisipanye", "Ondurasɛ"),
  CountryLocalization("hk", "lisinwa", "Hong Kong SAR China"),
  CountryLocalization("hu", "liongili", "Ongili"),
  CountryLocalization("is", "Icelandic", "Isilandɛ"),
  CountryLocalization("in", "linepalɛ", "Índɛ"),
  CountryLocalization("id", "Indonesian", "Indonezi"),
  CountryLocalization("ir", "lipelésanɛ", "Irâ"),
  CountryLocalization("iq", "lrc", "Iraki"),
  CountryLocalization("ie", "lingɛlɛ́sa", "Irelandɛ"),
  CountryLocalization("im", "Manx", "Isle of Man"),
  CountryLocalization("il", "lingɛlɛ́sa", "Isirayelɛ"),
  CountryLocalization("it", "lialemá", "Itali"),
  CountryLocalization("jm", "lingɛlɛ́sa", "Zamaiki"),
  CountryLocalization("jp", "lizapɔ", "Zapɔ"),
  CountryLocalization("je", "lingɛlɛ́sa", "Jersey"),
  CountryLocalization("jo", "lialabo", "Zɔdani"),
  CountryLocalization("kz", "Kazakh", "Kazakisitá"),
  CountryLocalization("ke", "lisomali", "Kenya"),
  CountryLocalization("ki", "lingɛlɛ́sa", "Kiribati"),
  CountryLocalization("xk", "Serbian", "XK"),
  CountryLocalization("kw", "lialabo", "Koweti"),
  CountryLocalization("kg", "lirisí", "Kigizisitá"),
  CountryLocalization("la", "Lao", "Lawosi"),
  CountryLocalization("lv", "Latvian", "Letoni"),
  CountryLocalization("lb", "lialabo", "Libá"),
  CountryLocalization("ls", "lingɛlɛ́sa", "Lesoto"),
  CountryLocalization("lr", "lingɛlɛ́sa", "Libériya"),
  CountryLocalization("ly", "lialabo", "Libí"),
  CountryLocalization("li", "Swiss German", "Lishɛteni"),
  CountryLocalization("lt", "Lithuanian", "Litwani"),
  CountryLocalization("lu", "Luxembourgish", "Likisambulu"),
  CountryLocalization("mo", "lipulutugɛ́si", "Macao SAR China"),
  CountryLocalization("mk", "Albanian", "Masedwanɛ"),
  CountryLocalization("mg", "lifalansɛ́", "Madagasikari"),
  CountryLocalization("mw", "lingɛlɛ́sa", "Malawi"),
  CountryLocalization("my", "litamuli", "Malezi"),
  CountryLocalization("ml", "lifalansɛ́", "Malí"),
  CountryLocalization("mt", "lingɛlɛ́sa", "Malitɛ"),
  CountryLocalization("mh", "lingɛlɛ́sa", "Bisanga bya Marishalɛ"),
  CountryLocalization("mq", "lifalansɛ́", "Martiniki"),
  CountryLocalization("mr", "lialabo", "Moritani"),
  CountryLocalization("mu", "mfe", "Morisɛ"),
  CountryLocalization("yt", "lifalansɛ́", "Mayotɛ"),
  CountryLocalization("mx", "lisipanye", "Meksike"),
  CountryLocalization("fm", "lingɛlɛ́sa", "Mikronezi"),
  CountryLocalization("md", "lirisí", "Molidavi"),
  CountryLocalization("mc", "lifalansɛ́", "Monako"),
  CountryLocalization("mn", "Mongolian", "Mongolí"),
  CountryLocalization("me", "Serbian", "Monténégro"),
  CountryLocalization("ms", "lingɛlɛ́sa", "Mɔsera"),
  CountryLocalization("ma", "tzm", "Marokɛ"),
  CountryLocalization("mz", "mgh", "Mozambíki"),
  CountryLocalization("mm", "libilimá", "Birmanie"),
  CountryLocalization("na", "lingɛlɛ́sa", "Namibi"),
  CountryLocalization("nr", "lingɛlɛ́sa", "Nauru"),
  CountryLocalization("np", "linepalɛ", "Nepálɛ"),
  CountryLocalization("nl", "lingɛlɛ́sa", "Olandɛ"),
  CountryLocalization("nc", "lifalansɛ́", "Kaledoni ya sika"),
  CountryLocalization("nz", "lingɛlɛ́sa", "Zelandɛ ya sika"),
  CountryLocalization("ni", "lisipanye", "Nikaragwa"),
  CountryLocalization("ne", "hausa", "Nizɛrɛ"),
  CountryLocalization("ng", "hausa", "Nizerya"),
  CountryLocalization("nu", "lingɛlɛ́sa", "Nyué"),
  CountryLocalization("nf", "lingɛlɛ́sa", "Esanga Norfokɛ"),
  CountryLocalization("kp", "likoreya", "Korɛ ya nɔ́rdi"),
  CountryLocalization("mp", "lingɛlɛ́sa", "Bisanga bya Marianɛ ya nɔ́rdi"),
  CountryLocalization("no", "Northern Sami", "Norivezɛ"),
  CountryLocalization("om", "lialabo", "Ománɛ"),
  CountryLocalization("pk", "lingɛlɛ́sa", "Pakisitá"),
  CountryLocalization("pw", "lingɛlɛ́sa", "Palau"),
  CountryLocalization("ps", "lialabo", "Palɛsine"),
  CountryLocalization("pa", "lisipanye", "Panama"),
  CountryLocalization("pg", "lingɛlɛ́sa", "Papwazi Ginɛ ya sika"),
  CountryLocalization("py", "lisipanye", "Palagwei"),
  CountryLocalization("pe", "lisipanye", "Péru"),
  CountryLocalization("ph", "Filipino", "Filipinɛ"),
  CountryLocalization("pn", "lingɛlɛ́sa", "Pikairni"),
  CountryLocalization("pl", "lipolonɛ", "Poloni"),
  CountryLocalization("pt", "lipulutugɛ́si", "Putúlugɛsi"),
  CountryLocalization("pr", "lingɛlɛ́sa", "Pɔtoriko"),
  CountryLocalization("qa", "lialabo", "Katari"),
  CountryLocalization("ro", "liromani", "Romani"),
  CountryLocalization("ru", "Tatar", "Risí"),
  CountryLocalization("rw", "lingɛlɛ́sa", "Rwanda"),
  CountryLocalization("re", "lifalansɛ́", "Lenyo"),
  CountryLocalization("ws", "lingɛlɛ́sa", "Samoa"),
  CountryLocalization("sm", "litaliano", "Sántu Marinɛ"),
  CountryLocalization("sa", "lialabo", "Alabi Sawuditɛ"),
  CountryLocalization("sn", "lifalansɛ́", "Senegalɛ"),
  CountryLocalization("rs", "Serbian", "Serbie"),
  CountryLocalization("cs", "Serbian", "Serbia and Montenegro"),
  CountryLocalization("sc", "lifalansɛ́", "Sɛshɛlɛ"),
  CountryLocalization("sl", "lingɛlɛ́sa", "Siera Leonɛ"),
  CountryLocalization("sg", "litamuli", "Singapurɛ"),
  CountryLocalization("sx", "lingɛlɛ́sa", "Sint Maarten"),
  CountryLocalization("sk", "Slovak", "Silovaki"),
  CountryLocalization("si", "Slovenian", "Siloveni"),
  CountryLocalization("sb", "lingɛlɛ́sa", "Bisanga Solomɔ"),
  CountryLocalization("so", "lialabo", "Somali"),
  CountryLocalization("za", "lingɛlɛ́sa", "Afríka ya Súdi"),
  CountryLocalization("kr", "likoreya", "Korɛ ya súdi"),
  CountryLocalization("ss", "nus", "South Sudan"),
  CountryLocalization("es", "lisipanye", "Esipanye"),
  CountryLocalization("lk", "litamuli", "Sirilanka"),
  CountryLocalization("bl", "lifalansɛ́", "St. Barthélemy"),
  CountryLocalization("sh", "lingɛlɛ́sa", "Sántu eleni"),
  CountryLocalization("kn", "lingɛlɛ́sa", "Sántu krístofe mpé Nevɛ̀s"),
  CountryLocalization("lc", "lingɛlɛ́sa", "Sántu lisi"),
  CountryLocalization("mf", "lifalansɛ́", "St. Martin"),
  CountryLocalization("pm", "lifalansɛ́", "Sántu pététo mpé Mikelɔ"),
  CountryLocalization("vc", "lingɛlɛ́sa", "Sántu vesá mpé Gelenadinɛ"),
  CountryLocalization("sd", "lialabo", "Sudá"),
  CountryLocalization("sr", "lifalamá", "Surinamɛ"),
  CountryLocalization("sj", "Norwegian Bokmål", "Svalbard & Jan Mayen"),
  CountryLocalization("sz", "lingɛlɛ́sa", "Swazilandi"),
  CountryLocalization("se", "lisuwedɛ", "Swédɛ"),
  CountryLocalization("ch", "Swiss German", "Swisɛ"),
  CountryLocalization("sy", "lialabo", "Sirí"),
  CountryLocalization("st", "lipulutugɛ́si", "Sao Tomé mpé Presipɛ"),
  CountryLocalization("tw", "lisinwa", "Taiwanin"),
  CountryLocalization("tj", "Tajik", "Tazikisitá"),
  CountryLocalization("tz", "kde", "Tanzani"),
  CountryLocalization("th", "litaye", "Tailandɛ"),
  CountryLocalization("tl", "lipulutugɛ́si", "Timorɛ ya Moniɛlɛ"),
  CountryLocalization("tg", "lifalansɛ́", "Togo"),
  CountryLocalization("tk", "lingɛlɛ́sa", "Tokelau"),
  CountryLocalization("to", "Tongan", "Tonga"),
  CountryLocalization("tt", "lingɛlɛ́sa", "Tinidadɛ mpé Tobago"),
  CountryLocalization("tn", "lifalansɛ́", "Tinizi"),
  CountryLocalization("tr", "litiliki", "Tiliki"),
  CountryLocalization("tm", "Turkmen", "Tikɛménisitá"),
  CountryLocalization("tc", "lingɛlɛ́sa", "Bisanga bya Turki mpé Kaiko"),
  CountryLocalization("tv", "lingɛlɛ́sa", "Tuvalu"),
  CountryLocalization("um", "lingɛlɛ́sa", "U.S. Outlying Islands"),
  CountryLocalization("vi", "lingɛlɛ́sa", "Bisanga bya Vierzi ya Ameriki"),
  CountryLocalization("ug", "Swahili", "Uganda"),
  CountryLocalization("ua", "likrɛni", "Ikrɛni"),
  CountryLocalization("ae", "lialabo", "Lɛmila alabo"),
  CountryLocalization("gb", "lingɛlɛ́sa", "Angɛlɛtɛ́lɛ"),
  CountryLocalization("us", "lkt", "Ameriki"),
  CountryLocalization("uy", "lisipanye", "Irigwei"),
  CountryLocalization("uz", "Uzbek", "Uzibɛkisitá"),
  CountryLocalization("vu", "lifalansɛ́", "Vanuatu"),
  CountryLocalization("va", "litaliano", "Vatiká"),
  CountryLocalization("ve", "lisipanye", "Venézuela"),
  CountryLocalization("vn", "liviyetinámi", "Viyetinamɛ"),
  CountryLocalization("wf", "lifalansɛ́", "Walisɛ mpé Futuna"),
  CountryLocalization("eh", "lialabo", "Western Sahara"),
  CountryLocalization("ye", "lialabo", "Yemɛnɛ"),
  CountryLocalization("zm", "lingɛlɛ́sa", "Zambi"),
  CountryLocalization("zw", "North Ndebele", "Zimbabwe"),
  CountryLocalization("ax", "lisuwedɛ", "Åland Islands"),
)
