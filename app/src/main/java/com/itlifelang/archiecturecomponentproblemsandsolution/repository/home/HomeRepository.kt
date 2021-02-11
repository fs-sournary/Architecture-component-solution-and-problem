package com.itlifelang.archiecturecomponentproblemsandsolution.repository.home

import androidx.lifecycle.LiveData
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person
import com.itlifelang.archiecturecomponentproblemsandsolution.result.Result

interface HomeRepository {

    fun getPersons(): LiveData<Result<List<Person>>>

    fun getLocalPersons(): LiveData<Result<List<Person>>>

    fun savePersonToDb(person: Person)

    fun deletePersonFromDb(person: Person)
}
