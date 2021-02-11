package com.itlifelang.archiecturecomponentproblemsandsolution.repository.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.itlifelang.archiecturecomponentproblemsandsolution.data.api.Api
import com.itlifelang.archiecturecomponentproblemsandsolution.data.db.PersonDao
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person
import com.itlifelang.archiecturecomponentproblemsandsolution.result.Result

class DefaultHomeRepository(private val api: Api, private val personDao: PersonDao) :
    HomeRepository {

    override fun getPersons(): LiveData<Result<List<Person>>> = liveData { }

    override fun getLocalPersons(): LiveData<Result<List<Person>>> = liveData { }

    override fun savePersonToDb(person: Person) {

    }

    override fun deletePersonFromDb(person: Person) {

    }
}
