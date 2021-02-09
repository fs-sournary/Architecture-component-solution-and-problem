package com.itlifelang.archiecturecomponentproblemsandsolution.repository.home

import androidx.lifecycle.LiveData
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person
import com.itlifelang.archiecturecomponentproblemsandsolution.repository.Result

interface HomeRepository {

    fun getPersons(): LiveData<Result<List<Person>>>
}
