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
 * language code be.
 *
 * This property contains a hardcoded list of [CountryLocalization] objects, each representing
 * a country and its associated official languages. This list is used by [CountryLanguageRegistry]
 * to provide access to country-language data and should not be modified directly.
 *
 * @see CountryLocalization
 * @see CountryLanguageRegistry
 */
internal val _countryLanguageMappings_be: List<CountryLocalization> = listOf(
  CountryLocalization("af", "фарсі", "Афганістан"),
  CountryLocalization("al", "албанская", "Албанія"),
  CountryLocalization("dz", "французская", "Алжыр"),
  CountryLocalization("as", "англійская", "Амерыканскае Самоа"),
  CountryLocalization("ad", "каталанская", "Андора"),
  CountryLocalization("ao", "лінгала", "Ангола"),
  CountryLocalization("ai", "англійская", "Ангілья"),
  CountryLocalization("ag", "англійская", "Антыгуа і Барбуда"),
  CountryLocalization("ar", "іспанская", "Аргенціна"),
  CountryLocalization("am", "армянская", "Арменія"),
  CountryLocalization("aw", "нідэрландская", "Аруба"),
  CountryLocalization("au", "англійская", "Аўстралія"),
  CountryLocalization("at", "англійская", "Аўстрыя"),
  CountryLocalization("az", "азербайджанская", "Азербайджан"),
  CountryLocalization("bs", "англійская", "Багамскія астравы"),
  CountryLocalization("bh", "арабская", "Бахрэйн"),
  CountryLocalization("bd", "бенгальская", "Бангладэш"),
  CountryLocalization("bb", "англійская", "Барбадас"),
  CountryLocalization("by", "беларуская", "Беларусь"),
  CountryLocalization("be", "французская", "Бельгія"),
  CountryLocalization("bz", "англійская", "Беліз"),
  CountryLocalization("bj", "французская", "Бенін"),
  CountryLocalization("bm", "англійская", "Бермудскія астравы"),
  CountryLocalization("bt", "дзонг-кэ", "Бутан"),
  CountryLocalization("bo", "іспанская", "Балівія"),
  CountryLocalization("ba", "баснійская", "Боснія і Герцагавіна"),
  CountryLocalization("bw", "англійская", "Батсвана"),
  CountryLocalization("br", "партугальская", "Бразілія"),
  CountryLocalization("io", "англійская", "Брытанская тэрыторыя ў Індыйскім акіяне"),
  CountryLocalization("vg", "англійская", "Брытанскія Віргінскія астравы"),
  CountryLocalization("bn", "малайская", "Бруней"),
  CountryLocalization("bg", "балгарская", "Балгарыя"),
  CountryLocalization("bf", "французская", "Буркіна-Фасо"),
  CountryLocalization("bi", "французская", "Бурундзі"),
  CountryLocalization("kh", "кхмерская", "Камбоджа"),
  CountryLocalization("cm", "басаа", "Камерун"),
  CountryLocalization("ca", "французская", "Канада"),
  CountryLocalization("ic", "іспанская", "Канарскія астравы"),
  CountryLocalization("cv", "кабувердыяну", "Каба-Вердэ"),
  CountryLocalization("bq", "нідэрландская", "Карыбскія Нідэрланды"),
  CountryLocalization("ky", "англійская", "Кайманавы астравы"),
  CountryLocalization("cf", "лінгала", "Цэнтральна-Афрыканская Рэспубліка"),
  CountryLocalization("ea", "іспанская", "Сеўта і Мелілья"),
  CountryLocalization("td", "арабская", "Чад"),
  CountryLocalization("cl", "іспанская", "Чылі"),
  CountryLocalization("cn", "тыбецкая", "Кітай"),
  CountryLocalization("cx", "англійская", "Востраў Каляд"),
  CountryLocalization("cc", "англійская", "Какосавыя (Кілінг) астравы"),
  CountryLocalization("co", "іспанская", "Калумбія"),
  CountryLocalization("km", "арабская", "Каморскія астравы"),
  CountryLocalization("cg", "лінгала", "Конга - Бразавіль"),
  CountryLocalization("cd", "суахілі", "Конга (Кіншаса)"),
  CountryLocalization("ck", "англійская", "Астравы Кука"),
  CountryLocalization("cr", "іспанская", "Коста-Рыка"),
  CountryLocalization("hr", "харвацкая", "Харватыя"),
  CountryLocalization("cu", "іспанская", "Куба"),
  CountryLocalization("cw", "нідэрландская", "Кюрасаа"),
  CountryLocalization("cy", "англійская", "Кіпр"),
  CountryLocalization("cz", "чэшская", "Чэхія"),
  CountryLocalization("ci", "французская", "Кот-д’Івуар"),
  CountryLocalization("dk", "англійская", "Данія"),
  CountryLocalization("dg", "англійская", "Востраў Дыега-Гарсія"),
  CountryLocalization("dj", "французская", "Джыбуці"),
  CountryLocalization("dm", "англійская", "Дамініка"),
  CountryLocalization("do", "іспанская", "Дамініканская Рэспубліка"),
  CountryLocalization("ec", "кечуа", "Эквадор"),
  CountryLocalization("eg", "арабская", "Егіпет"),
  CountryLocalization("sv", "іспанская", "Сальвадор"),
  CountryLocalization("gq", "іспанская", "Экватарыяльная Гвінея"),
  CountryLocalization("er", "тыгрынья", "Эрытрэя"),
  CountryLocalization("ee", "эстонская", "Эстонія"),
  CountryLocalization("et", "амхарская", "Эфіопія"),
  CountryLocalization("fk", "англійская", "Фалклендскія астравы"),
  CountryLocalization("fo", "фарэрская", "Фарэрскія астравы"),
  CountryLocalization("fj", "англійская", "Фіджы"),
  CountryLocalization("fi", "шведская", "Фінляндыя"),
  CountryLocalization("fr", "швейцарская нямецкая", "Францыя"),
  CountryLocalization("gf", "французская", "Французская Гвіяна"),
  CountryLocalization("pf", "французская", "Французская Палінезія"),
  CountryLocalization("ga", "французская", "Габон"),
  CountryLocalization("gm", "англійская", "Гамбія"),
  CountryLocalization("ge", "асецінская", "Грузія"),
  CountryLocalization("de", "ніжнялужыцкая", "Германія"),
  CountryLocalization("gh", "англійская", "Гана"),
  CountryLocalization("gi", "англійская", "Гібралтар"),
  CountryLocalization("gr", "грэчаская", "Грэцыя"),
  CountryLocalization("gl", "грэнландская", "Грэнландыя"),
  CountryLocalization("gd", "англійская", "Грэнада"),
  CountryLocalization("gp", "французская", "Гвадэлупа"),
  CountryLocalization("gu", "англійская", "Гуам"),
  CountryLocalization("gt", "іспанская", "Гватэмала"),
  CountryLocalization("gg", "англійская", "Гернсі"),
  CountryLocalization("gn", "французская", "Гвінея"),
  CountryLocalization("gw", "партугальская", "Гвінея-Бісау"),
  CountryLocalization("gy", "англійская", "Гаяна"),
  CountryLocalization("ht", "французская", "Гаіці"),
  CountryLocalization("hn", "іспанская", "Гандурас"),
  CountryLocalization("hk", "кітайская", "Ганконг, САР (Кітай)"),
  CountryLocalization("hu", "венгерская", "Венгрыя"),
  CountryLocalization("is", "ісландская", "Ісландыя"),
  CountryLocalization("in", "непальская", "Індыя"),
  CountryLocalization("id", "Indonesian", "Інданезія"),
  CountryLocalization("ir", "фарсі", "Іран"),
  CountryLocalization("iq", "паўночная луры", "Ірак"),
  CountryLocalization("ie", "англійская", "Ірландыя"),
  CountryLocalization("im", "мэнская", "Востраў Мэн"),
  CountryLocalization("il", "англійская", "Ізраіль"),
  CountryLocalization("it", "нямецкая", "Італія"),
  CountryLocalization("jm", "англійская", "Ямайка"),
  CountryLocalization("jp", "японская", "Японія"),
  CountryLocalization("je", "англійская", "Джэрсі"),
  CountryLocalization("jo", "арабская", "Іарданія"),
  CountryLocalization("kz", "казахская", "Казахстан"),
  CountryLocalization("ke", "самалі", "Кенія"),
  CountryLocalization("ki", "англійская", "Кірыбаці"),
  CountryLocalization("xk", "сербская", "Косава"),
  CountryLocalization("kw", "арабская", "Кувейт"),
  CountryLocalization("kg", "руская", "Кыргызстан"),
  CountryLocalization("la", "лаоская", "Лаос"),
  CountryLocalization("lv", "латышская", "Латвія"),
  CountryLocalization("lb", "арабская", "Ліван"),
  CountryLocalization("ls", "англійская", "Лесота"),
  CountryLocalization("lr", "англійская", "Ліберыя"),
  CountryLocalization("ly", "арабская", "Лівія"),
  CountryLocalization("li", "швейцарская нямецкая", "Ліхтэнштэйн"),
  CountryLocalization("lt", "літоўская", "Літва"),
  CountryLocalization("lu", "люксембургская", "Люксембург"),
  CountryLocalization("mo", "партугальская", "Макаа, САР (Кітай)"),
  CountryLocalization("mk", "албанская", "Македонія"),
  CountryLocalization("mg", "французская", "Мадагаскар"),
  CountryLocalization("mw", "англійская", "Малаві"),
  CountryLocalization("my", "тамільская", "Малайзія"),
  CountryLocalization("ml", "французская", "Малі"),
  CountryLocalization("mt", "англійская", "Мальта"),
  CountryLocalization("mh", "англійская", "Маршалавы астравы"),
  CountryLocalization("mq", "французская", "Марцініка"),
  CountryLocalization("mr", "арабская", "Маўрытанія"),
  CountryLocalization("mu", "марысьен", "Маўрыкій"),
  CountryLocalization("yt", "французская", "Маёта"),
  CountryLocalization("mx", "іспанская", "Мексіка"),
  CountryLocalization("fm", "англійская", "Мікранезія"),
  CountryLocalization("md", "руская", "Малдова"),
  CountryLocalization("mc", "французская", "Манака"),
  CountryLocalization("mn", "мангольская", "Манголія"),
  CountryLocalization("me", "сербская", "Чарнагорыя"),
  CountryLocalization("ms", "англійская", "Мантсерат"),
  CountryLocalization("ma", "цэнтральнаатлаская тамазіхт", "Марока"),
  CountryLocalization("mz", "макуўа-меета", "Мазамбік"),
  CountryLocalization("mm", "бірманская", "М’янма (Бірма)"),
  CountryLocalization("na", "англійская", "Намібія"),
  CountryLocalization("nr", "англійская", "Науру"),
  CountryLocalization("np", "непальская", "Непал"),
  CountryLocalization("nl", "англійская", "Нідэрланды"),
  CountryLocalization("nc", "французская", "Новая Каледонія"),
  CountryLocalization("nz", "англійская", "Новая Зеландыя"),
  CountryLocalization("ni", "іспанская", "Нікарагуа"),
  CountryLocalization("ne", "хауса", "Нігер"),
  CountryLocalization("ng", "хауса", "Нігерыя"),
  CountryLocalization("nu", "англійская", "Ніуэ"),
  CountryLocalization("nf", "англійская", "Востраў Норфалк"),
  CountryLocalization("kp", "карэйская", "Паўночная Карэя"),
  CountryLocalization("mp", "англійская", "Паўночныя Марыянскія астравы"),
  CountryLocalization("no", "паўночнасаамская", "Нарвегія"),
  CountryLocalization("om", "арабская", "Аман"),
  CountryLocalization("pk", "англійская", "Пакістан"),
  CountryLocalization("pw", "англійская", "Палау"),
  CountryLocalization("ps", "арабская", "Палесцінскія Тэрыторыі"),
  CountryLocalization("pa", "іспанская", "Панама"),
  CountryLocalization("pg", "англійская", "Папуа-Новая Гвінея"),
  CountryLocalization("py", "іспанская", "Парагвай"),
  CountryLocalization("pe", "іспанская", "Перу"),
  CountryLocalization("ph", "філіпінская", "Філіпіны"),
  CountryLocalization("pn", "англійская", "Астравы Піткэрн"),
  CountryLocalization("pl", "польская", "Польшча"),
  CountryLocalization("pt", "партугальская", "Партугалія"),
  CountryLocalization("pr", "англійская", "Пуэрта-Рыка"),
  CountryLocalization("qa", "арабская", "Катар"),
  CountryLocalization("ro", "румынская", "Румынія"),
  CountryLocalization("ru", "татарская", "Расія"),
  CountryLocalization("rw", "англійская", "Руанда"),
  CountryLocalization("re", "французская", "Рэюньён"),
  CountryLocalization("ws", "англійская", "Самоа"),
  CountryLocalization("sm", "італьянская", "Сан-Марына"),
  CountryLocalization("sa", "арабская", "Саудаўская Аравія"),
  CountryLocalization("sn", "французская", "Сенегал"),
  CountryLocalization("rs", "сербская", "Сербія"),
  CountryLocalization("cs", "сербская", "Serbia and Montenegro"),
  CountryLocalization("sc", "французская", "Сейшэльскія астравы"),
  CountryLocalization("sl", "англійская", "Сьера-Леонэ"),
  CountryLocalization("sg", "тамільская", "Сінгапур"),
  CountryLocalization("sx", "англійская", "Сінт-Мартэн"),
  CountryLocalization("sk", "славацкая", "Славакія"),
  CountryLocalization("si", "славенская", "Славенія"),
  CountryLocalization("sb", "англійская", "Саламонавы астравы"),
  CountryLocalization("so", "арабская", "Самалі"),
  CountryLocalization("za", "англійская", "Паўднёва-Афрыканская Рэспубліка"),
  CountryLocalization("kr", "карэйская", "Паўднёвая Карэя"),
  CountryLocalization("ss", "нуэр", "Паўднёвы Судан"),
  CountryLocalization("es", "іспанская", "Іспанія"),
  CountryLocalization("lk", "тамільская", "Шры-Ланка"),
  CountryLocalization("bl", "французская", "Сен-Бартэльмі"),
  CountryLocalization("sh", "англійская", "Востраў Святой Алены"),
  CountryLocalization("kn", "англійская", "Сент-Кітс і Невіс"),
  CountryLocalization("lc", "англійская", "Сент-Люсія"),
  CountryLocalization("mf", "французская", "Сен-Мартэн"),
  CountryLocalization("pm", "французская", "Сен-П’ер і Мікелон"),
  CountryLocalization("vc", "англійская", "Сент-Вінсент і Грэнадзіны"),
  CountryLocalization("sd", "арабская", "Судан"),
  CountryLocalization("sr", "нідэрландская", "Сурынам"),
  CountryLocalization("sj", "нарвежская (букмол)", "Шпіцберген і Ян-Маен"),
  CountryLocalization("sz", "англійская", "Свазіленд"),
  CountryLocalization("se", "шведская", "Швецыя"),
  CountryLocalization("ch", "швейцарская нямецкая", "Швейцарыя"),
  CountryLocalization("sy", "арабская", "Сірыя"),
  CountryLocalization("st", "партугальская", "Сан-Тамэ і Прынсіпі"),
  CountryLocalization("tw", "кітайская", "Тайвань"),
  CountryLocalization("tj", "таджыкская", "Таджыкістан"),
  CountryLocalization("tz", "макондэ", "Танзанія"),
  CountryLocalization("th", "тайская", "Тайланд"),
  CountryLocalization("tl", "партугальская", "Тымор-Лешці"),
  CountryLocalization("tg", "французская", "Тога"),
  CountryLocalization("tk", "англійская", "Такелау"),
  CountryLocalization("to", "танганская", "Тонга"),
  CountryLocalization("tt", "англійская", "Трынідад і Табага"),
  CountryLocalization("tn", "французская", "Туніс"),
  CountryLocalization("tr", "турэцкая", "Турцыя"),
  CountryLocalization("tm", "туркменская", "Туркменістан"),
  CountryLocalization("tc", "англійская", "Астравы Цёркс і Кайкас"),
  CountryLocalization("tv", "англійская", "Тувалу"),
  CountryLocalization("um", "англійская", "Малыя Аддаленыя астравы ЗША"),
  CountryLocalization("vi", "англійская", "Амерыканскія Віргінскія астравы"),
  CountryLocalization("ug", "суахілі", "Уганда"),
  CountryLocalization("ua", "украінская", "Украіна"),
  CountryLocalization("ae", "арабская", "Аб’яднаныя Арабскія Эміраты"),
  CountryLocalization("gb", "англійская", "Вялікабрытанія"),
  CountryLocalization("us", "лакота", "Злучаныя Штаты Амерыкі"),
  CountryLocalization("uy", "іспанская", "Уругвай"),
  CountryLocalization("uz", "узбекская", "Узбекістан"),
  CountryLocalization("vu", "французская", "Вануату"),
  CountryLocalization("va", "італьянская", "Ватыкан"),
  CountryLocalization("ve", "іспанская", "Венесуэла"),
  CountryLocalization("vn", "в’етнамская", "В’етнам"),
  CountryLocalization("wf", "французская", "Уоліс і Футуна"),
  CountryLocalization("eh", "арабская", "Заходняя Сахара"),
  CountryLocalization("ye", "арабская", "Емен"),
  CountryLocalization("zm", "англійская", "Замбія"),
  CountryLocalization("zw", "паўночная ндэбеле", "Зімбабвэ"),
  CountryLocalization("ax", "шведская", "Аландскія астравы"),
)
