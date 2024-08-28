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
 * language code tr.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_tr: List<CountryLocalization> = listOf(
  CountryLocalization("af", "Farsça", "Afganistan"),
  CountryLocalization("al", "Arnavutça", "Arnavutluk"),
  CountryLocalization("dz", "Fransızca", "Cezayir"),
  CountryLocalization("as", "İngilizce", "Amerikan Samoası"),
  CountryLocalization("ad", "Katalanca", "Andorra"),
  CountryLocalization("ao", "Lingala", "Angola"),
  CountryLocalization("ai", "İngilizce", "Anguilla"),
  CountryLocalization("ag", "İngilizce", "Antigua ve Barbuda"),
  CountryLocalization("ar", "İspanyolca", "Arjantin"),
  CountryLocalization("am", "Ermenice", "Ermenistan"),
  CountryLocalization("aw", "Felemenkçe", "Aruba"),
  CountryLocalization("au", "İngilizce", "Avustralya"),
  CountryLocalization("at", "İngilizce", "Avusturya"),
  CountryLocalization("az", "Azerice", "Azerbaycan"),
  CountryLocalization("bs", "İngilizce", "Bahamalar"),
  CountryLocalization("bh", "Arapça", "Bahreyn"),
  CountryLocalization("bd", "Bengalce", "Bangladeş"),
  CountryLocalization("bb", "İngilizce", "Barbados"),
  CountryLocalization("by", "Belarusça", "Belarus"),
  CountryLocalization("be", "Fransızca", "Belçika"),
  CountryLocalization("bz", "İngilizce", "Belize"),
  CountryLocalization("bj", "Fransızca", "Benin"),
  CountryLocalization("bm", "İngilizce", "Bermuda"),
  CountryLocalization("bt", "Dzongkha", "Butan"),
  CountryLocalization("bo", "İspanyolca", "Bolivya"),
  CountryLocalization("ba", "Boşnakça", "Bosna-Hersek"),
  CountryLocalization("bw", "İngilizce", "Botsvana"),
  CountryLocalization("br", "Portekizce", "Brezilya"),
  CountryLocalization("io", "İngilizce", "Britanya Hint Okyanusu Toprakları"),
  CountryLocalization("vg", "İngilizce", "Britanya Virjin Adaları"),
  CountryLocalization("bn", "Malayca", "Brunei"),
  CountryLocalization("bg", "Bulgarca", "Bulgaristan"),
  CountryLocalization("bf", "Fransızca", "Burkina Faso"),
  CountryLocalization("bi", "Fransızca", "Burundi"),
  CountryLocalization("kh", "Khmer dili", "Kamboçya"),
  CountryLocalization("cm", "Basa Dili", "Kamerun"),
  CountryLocalization("ca", "Fransızca", "Kanada"),
  CountryLocalization("ic", "İspanyolca", "Kanarya Adaları"),
  CountryLocalization("cv", "Kabuverdianu", "Cape Verde"),
  CountryLocalization("bq", "Felemenkçe", "Karayip Hollandası"),
  CountryLocalization("ky", "İngilizce", "Cayman Adaları"),
  CountryLocalization("cf", "Lingala", "Orta Afrika Cumhuriyeti"),
  CountryLocalization("ea", "İspanyolca", "Septe ve Melilla"),
  CountryLocalization("td", "Arapça", "Çad"),
  CountryLocalization("cl", "İspanyolca", "Şili"),
  CountryLocalization("cn", "Tibetçe", "Çin"),
  CountryLocalization("cx", "İngilizce", "Christmas Adası"),
  CountryLocalization("cc", "İngilizce", "Cocos (Keeling) Adaları"),
  CountryLocalization("co", "İspanyolca", "Kolombiya"),
  CountryLocalization("km", "Arapça", "Komorlar"),
  CountryLocalization("cg", "Lingala", "Kongo - Brazavil"),
  CountryLocalization("cd", "Svahili dili", "Kongo - Kinşasa"),
  CountryLocalization("ck", "İngilizce", "Cook Adaları"),
  CountryLocalization("cr", "İspanyolca", "Kosta Rika"),
  CountryLocalization("hr", "Hırvatça", "Hırvatistan"),
  CountryLocalization("cu", "İspanyolca", "Küba"),
  CountryLocalization("cw", "Felemenkçe", "Curaçao"),
  CountryLocalization("cy", "İngilizce", "Kıbrıs"),
  CountryLocalization("cz", "Çekçe", "Çekya"),
  CountryLocalization("ci", "Fransızca", "Fildişi Sahili"),
  CountryLocalization("dk", "İngilizce", "Danimarka"),
  CountryLocalization("dg", "İngilizce", "Diego Garcia"),
  CountryLocalization("dj", "Fransızca", "Cibuti"),
  CountryLocalization("dm", "İngilizce", "Dominika"),
  CountryLocalization("do", "İspanyolca", "Dominik Cumhuriyeti"),
  CountryLocalization("ec", "Keçuva dili", "Ekvador"),
  CountryLocalization("eg", "Arapça", "Mısır"),
  CountryLocalization("sv", "İspanyolca", "El Salvador"),
  CountryLocalization("gq", "İspanyolca", "Ekvator Ginesi"),
  CountryLocalization("er", "Tigrinya dili", "Eritre"),
  CountryLocalization("ee", "Estonca", "Estonya"),
  CountryLocalization("et", "Amharca", "Etiyopya"),
  CountryLocalization("fk", "İngilizce", "Falkland Adaları"),
  CountryLocalization("fo", "Faroe Dili", "Faroe Adaları"),
  CountryLocalization("fj", "İngilizce", "Fiji"),
  CountryLocalization("fi", "İsveççe", "Finlandiya"),
  CountryLocalization("fr", "İsviçre Almancası", "Fransa"),
  CountryLocalization("gf", "Fransızca", "Fransız Guyanası"),
  CountryLocalization("pf", "Fransızca", "Fransız Polinezyası"),
  CountryLocalization("ga", "Fransızca", "Gabon"),
  CountryLocalization("gm", "İngilizce", "Gambiya"),
  CountryLocalization("ge", "Osetçe", "Gürcistan"),
  CountryLocalization("de", "Aşağı Sorbça", "Almanya"),
  CountryLocalization("gh", "İngilizce", "Gana"),
  CountryLocalization("gi", "İngilizce", "Cebelitarık"),
  CountryLocalization("gr", "Yunanca", "Yunanistan"),
  CountryLocalization("gl", "Grönland dili", "Grönland"),
  CountryLocalization("gd", "İngilizce", "Grenada"),
  CountryLocalization("gp", "Fransızca", "Guadeloupe"),
  CountryLocalization("gu", "İngilizce", "Guam"),
  CountryLocalization("gt", "İspanyolca", "Guatemala"),
  CountryLocalization("gg", "İngilizce", "Guernsey"),
  CountryLocalization("gn", "Fransızca", "Gine"),
  CountryLocalization("gw", "Portekizce", "Gine-Bissau"),
  CountryLocalization("gy", "İngilizce", "Guyana"),
  CountryLocalization("ht", "Fransızca", "Haiti"),
  CountryLocalization("hn", "İspanyolca", "Honduras"),
  CountryLocalization("hk", "Çince", "Çin Hong Kong ÖİB"),
  CountryLocalization("hu", "Macarca", "Macaristan"),
  CountryLocalization("is", "İzlandaca", "İzlanda"),
  CountryLocalization("in", "Nepalce", "Hindistan"),
  CountryLocalization("id", "Indonesian", "Endonezya"),
  CountryLocalization("ir", "Farsça", "İran"),
  CountryLocalization("iq", "Kuzey Luri", "Irak"),
  CountryLocalization("ie", "İngilizce", "İrlanda"),
  CountryLocalization("im", "Man dili", "Man Adası"),
  CountryLocalization("il", "İngilizce", "İsrail"),
  CountryLocalization("it", "Almanca", "İtalya"),
  CountryLocalization("jm", "İngilizce", "Jamaika"),
  CountryLocalization("jp", "Japonca", "Japonya"),
  CountryLocalization("je", "İngilizce", "Jersey"),
  CountryLocalization("jo", "Arapça", "Ürdün"),
  CountryLocalization("kz", "Kazakça", "Kazakistan"),
  CountryLocalization("ke", "Somalice", "Kenya"),
  CountryLocalization("ki", "İngilizce", "Kiribati"),
  CountryLocalization("xk", "Sırpça", "Kosova"),
  CountryLocalization("kw", "Arapça", "Kuveyt"),
  CountryLocalization("kg", "Rusça", "Kırgızistan"),
  CountryLocalization("la", "Lao dili", "Laos"),
  CountryLocalization("lv", "Letonca", "Letonya"),
  CountryLocalization("lb", "Arapça", "Lübnan"),
  CountryLocalization("ls", "İngilizce", "Lesotho"),
  CountryLocalization("lr", "İngilizce", "Liberya"),
  CountryLocalization("ly", "Arapça", "Libya"),
  CountryLocalization("li", "İsviçre Almancası", "Liechtenstein"),
  CountryLocalization("lt", "Litvanca", "Litvanya"),
  CountryLocalization("lu", "Lüksemburgca", "Lüksemburg"),
  CountryLocalization("mo", "Portekizce", "Çin Makao ÖİB"),
  CountryLocalization("mk", "Arnavutça", "Makedonya"),
  CountryLocalization("mg", "Fransızca", "Madagaskar"),
  CountryLocalization("mw", "İngilizce", "Malavi"),
  CountryLocalization("my", "Tamilce", "Malezya"),
  CountryLocalization("ml", "Fransızca", "Mali"),
  CountryLocalization("mt", "İngilizce", "Malta"),
  CountryLocalization("mh", "İngilizce", "Marshall Adaları"),
  CountryLocalization("mq", "Fransızca", "Martinik"),
  CountryLocalization("mr", "Arapça", "Moritanya"),
  CountryLocalization("mu", "Morisyen", "Mauritius"),
  CountryLocalization("yt", "Fransızca", "Mayotte"),
  CountryLocalization("mx", "İspanyolca", "Meksika"),
  CountryLocalization("fm", "İngilizce", "Mikronezya"),
  CountryLocalization("md", "Rusça", "Moldova"),
  CountryLocalization("mc", "Fransızca", "Monako"),
  CountryLocalization("mn", "Moğolca", "Moğolistan"),
  CountryLocalization("me", "Sırpça", "Karadağ"),
  CountryLocalization("ms", "İngilizce", "Montserrat"),
  CountryLocalization("ma", "Orta Atlas Tamazigti", "Fas"),
  CountryLocalization("mz", "Makhuwa-Meetto", "Mozambik"),
  CountryLocalization("mm", "Birman dili", "Myanmar (Burma)"),
  CountryLocalization("na", "İngilizce", "Namibya"),
  CountryLocalization("nr", "İngilizce", "Nauru"),
  CountryLocalization("np", "Nepalce", "Nepal"),
  CountryLocalization("nl", "İngilizce", "Hollanda"),
  CountryLocalization("nc", "Fransızca", "Yeni Kaledonya"),
  CountryLocalization("nz", "İngilizce", "Yeni Zelanda"),
  CountryLocalization("ni", "İspanyolca", "Nikaragua"),
  CountryLocalization("ne", "Hausa dili", "Nijer"),
  CountryLocalization("ng", "Hausa dili", "Nijerya"),
  CountryLocalization("nu", "İngilizce", "Niue"),
  CountryLocalization("nf", "İngilizce", "Norfolk Adası"),
  CountryLocalization("kp", "Korece", "Kuzey Kore"),
  CountryLocalization("mp", "İngilizce", "Kuzey Mariana Adaları"),
  CountryLocalization("no", "Kuzey Laponcası", "Norveç"),
  CountryLocalization("om", "Arapça", "Umman"),
  CountryLocalization("pk", "İngilizce", "Pakistan"),
  CountryLocalization("pw", "İngilizce", "Palau"),
  CountryLocalization("ps", "Arapça", "Filistin Bölgeleri"),
  CountryLocalization("pa", "İspanyolca", "Panama"),
  CountryLocalization("pg", "İngilizce", "Papua Yeni Gine"),
  CountryLocalization("py", "İspanyolca", "Paraguay"),
  CountryLocalization("pe", "İspanyolca", "Peru"),
  CountryLocalization("ph", "Filipince", "Filipinler"),
  CountryLocalization("pn", "İngilizce", "Pitcairn Adaları"),
  CountryLocalization("pl", "Lehçe", "Polonya"),
  CountryLocalization("pt", "Portekizce", "Portekiz"),
  CountryLocalization("pr", "İngilizce", "Porto Riko"),
  CountryLocalization("qa", "Arapça", "Katar"),
  CountryLocalization("ro", "Rumence", "Romanya"),
  CountryLocalization("ru", "Tatarca", "Rusya"),
  CountryLocalization("rw", "İngilizce", "Ruanda"),
  CountryLocalization("re", "Fransızca", "Réunion"),
  CountryLocalization("ws", "İngilizce", "Samoa"),
  CountryLocalization("sm", "İtalyanca", "San Marino"),
  CountryLocalization("sa", "Arapça", "Suudi Arabistan"),
  CountryLocalization("sn", "Fransızca", "Senegal"),
  CountryLocalization("rs", "Sırpça", "Sırbistan"),
  CountryLocalization("cs", "Sırpça", "Serbia and Montenegro"),
  CountryLocalization("sc", "Fransızca", "Seyşeller"),
  CountryLocalization("sl", "İngilizce", "Sierra Leone"),
  CountryLocalization("sg", "Tamilce", "Singapur"),
  CountryLocalization("sx", "İngilizce", "Sint Maarten"),
  CountryLocalization("sk", "Slovakça", "Slovakya"),
  CountryLocalization("si", "Slovence", "Slovenya"),
  CountryLocalization("sb", "İngilizce", "Solomon Adaları"),
  CountryLocalization("so", "Arapça", "Somali"),
  CountryLocalization("za", "İngilizce", "Güney Afrika"),
  CountryLocalization("kr", "Korece", "Güney Kore"),
  CountryLocalization("ss", "Nuer", "Güney Sudan"),
  CountryLocalization("es", "İspanyolca", "İspanya"),
  CountryLocalization("lk", "Tamilce", "Sri Lanka"),
  CountryLocalization("bl", "Fransızca", "Saint Barthelemy"),
  CountryLocalization("sh", "İngilizce", "Saint Helena"),
  CountryLocalization("kn", "İngilizce", "Saint Kitts ve Nevis"),
  CountryLocalization("lc", "İngilizce", "Saint Lucia"),
  CountryLocalization("mf", "Fransızca", "Saint Martin"),
  CountryLocalization("pm", "Fransızca", "Saint Pierre ve Miquelon"),
  CountryLocalization("vc", "İngilizce", "Saint Vincent ve Grenadinler"),
  CountryLocalization("sd", "Arapça", "Sudan"),
  CountryLocalization("sr", "Felemenkçe", "Surinam"),
  CountryLocalization("sj", "Norveççe Bokmål", "Svalbard ve Jan Mayen"),
  CountryLocalization("sz", "İngilizce", "Svaziland"),
  CountryLocalization("se", "İsveççe", "İsveç"),
  CountryLocalization("ch", "İsviçre Almancası", "İsviçre"),
  CountryLocalization("sy", "Arapça", "Suriye"),
  CountryLocalization("st", "Portekizce", "São Tomé ve Príncipe"),
  CountryLocalization("tw", "Çince", "Tayvan"),
  CountryLocalization("tj", "Tacikçe", "Tacikistan"),
  CountryLocalization("tz", "Makonde", "Tanzanya"),
  CountryLocalization("th", "Tayca", "Tayland"),
  CountryLocalization("tl", "Portekizce", "Timor-Leste"),
  CountryLocalization("tg", "Fransızca", "Togo"),
  CountryLocalization("tk", "İngilizce", "Tokelau"),
  CountryLocalization("to", "Tonga dili", "Tonga"),
  CountryLocalization("tt", "İngilizce", "Trinidad ve Tobago"),
  CountryLocalization("tn", "Fransızca", "Tunus"),
  CountryLocalization("tr", "Türkçe", "Türkiye"),
  CountryLocalization("tm", "Türkmence", "Türkmenistan"),
  CountryLocalization("tc", "İngilizce", "Turks ve Caicos Adaları"),
  CountryLocalization("tv", "İngilizce", "Tuvalu"),
  CountryLocalization("um", "İngilizce", "ABD Küçük Harici Adaları"),
  CountryLocalization("vi", "İngilizce", "ABD Virjin Adaları"),
  CountryLocalization("ug", "Svahili dili", "Uganda"),
  CountryLocalization("ua", "Ukraynaca", "Ukrayna"),
  CountryLocalization("ae", "Arapça", "Birleşik Arap Emirlikleri"),
  CountryLocalization("gb", "İngilizce", "Birleşik Krallık"),
  CountryLocalization("us", "Lakotaca", "Amerika Birleşik Devletleri"),
  CountryLocalization("uy", "İspanyolca", "Uruguay"),
  CountryLocalization("uz", "Özbekçe", "Özbekistan"),
  CountryLocalization("vu", "Fransızca", "Vanuatu"),
  CountryLocalization("va", "İtalyanca", "Vatikan"),
  CountryLocalization("ve", "İspanyolca", "Venezuela"),
  CountryLocalization("vn", "Vietnamca", "Vietnam"),
  CountryLocalization("wf", "Fransızca", "Wallis ve Futuna"),
  CountryLocalization("eh", "Arapça", "Batı Sahra"),
  CountryLocalization("ye", "Arapça", "Yemen"),
  CountryLocalization("zm", "İngilizce", "Zambiya"),
  CountryLocalization("zw", "Kuzey Ndebele", "Zimbabve"),
  CountryLocalization("ax", "İsveççe", "Åland Adaları"),
)
