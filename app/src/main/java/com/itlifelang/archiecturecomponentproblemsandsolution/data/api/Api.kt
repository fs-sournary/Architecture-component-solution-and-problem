package com.itlifelang.archiecturecomponentproblemsandsolution.data.api

import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person

/**
 * Fake api
 */
class Api {

    fun getPersonList(): List<Person> = listOf(
        Person(id = 0,
            name = "Naruto",
            age = 17,
            avatar = "https://hoso.wiki/wp-content/uploads/2020/06/ngoai-hinh-cua-asta.jpg"),
        Person(id = 0,
            name = "B",
            age = 33,
            avatar = "https://static.wikia.nocookie.net/naruto-viet-nam/images/4/49/Naruto_Shipp%C5%ABden_Logo-1.png/revision/latest?cb=20170427074448&path-prefix=vi"),
        Person(id = 0,
            name = "C",
            age = 33,
            avatar = "https://nguyen8.com/app/uploads/2020/03/04/7-vien-ngoc-rong-songoku.jpg"),
        Person(id = 0,
            name = "D",
            age = 22,
            avatar = "https://static.wikia.nocookie.net/fairytail/images/c/ca/Natsu_X792.png/revision/latest?cb=20181111122101"),
        Person(id = 0,
            name = "E",
            age = 33,
            avatar = "https://static.wikia.nocookie.net/p__/images/a/a4/Glenn_Radars.png/revision/latest/top-crop/width/360/height/360?cb=20190518121825&path-prefix=protagonist"),
        Person(id = 0, name = "F", age = 15, avatar = null))
}
