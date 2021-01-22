package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Problem3ViewModel : ViewModel() {

    private val _number = MutableLiveData<Int>()
    val number: LiveData<Int> = _number

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    fun makeFakeLoading() {
        viewModelScope.launch {
            _loading.value = true
            delay(1000)
            _loading.value = false
        }
    }

    fun setNumber(newNumber: Int) {
        _number.value = newNumber
    }
}
