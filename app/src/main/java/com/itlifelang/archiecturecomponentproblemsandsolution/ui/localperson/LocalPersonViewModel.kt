package com.itlifelang.archiecturecomponentproblemsandsolution.ui.localperson

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person
import com.itlifelang.archiecturecomponentproblemsandsolution.repository.home.HomeRepository
import com.itlifelang.archiecturecomponentproblemsandsolution.result.data

class LocalPersonViewModel @ViewModelInject constructor(
    private val homeRepository: HomeRepository
) : ViewModel() {

    private val localPersonResult = homeRepository.getLocalPersons()
    val localPersons = localPersonResult.map { it.data }

    fun deletePersonInDb(person: Person) {
        homeRepository.deletePersonFromDb(person)
    }

    override fun onCleared() {
        homeRepository.clear()
        super.onCleared()
    }
}
