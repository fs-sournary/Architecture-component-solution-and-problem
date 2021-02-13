package com.itlifelang.archiecturecomponentproblemsandsolution.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person
import com.itlifelang.archiecturecomponentproblemsandsolution.repository.home.HomeRepository
import com.itlifelang.archiecturecomponentproblemsandsolution.result.Result
import com.itlifelang.archiecturecomponentproblemsandsolution.result.data
import com.itlifelang.archiecturecomponentproblemsandsolution.result.error

class HomeViewModel @ViewModelInject constructor(
    private val homeRepository: HomeRepository
) : ViewModel() {

    private val personResult = homeRepository.getPersons()
    val loading = personResult.map { it is Result.Loading }
    val persons = personResult.map { it.data }
    val error = personResult.map { it.error }

    fun savePersonToDb(person: Person) {
        homeRepository.savePersonToDb(person)
    }

    override fun onCleared() {
        homeRepository.clear()
        super.onCleared()
    }
}
