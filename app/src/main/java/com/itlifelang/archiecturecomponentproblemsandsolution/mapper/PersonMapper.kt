package com.itlifelang.archiecturecomponentproblemsandsolution.mapper

import com.itlifelang.archiecturecomponentproblemsandsolution.data.db.PersonEntity
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person

fun Person.mapToEntity(): PersonEntity = PersonEntity(id, name, age, avatar)

fun PersonEntity.mapToPerson(): Person = Person(id, name, age, avatar)
