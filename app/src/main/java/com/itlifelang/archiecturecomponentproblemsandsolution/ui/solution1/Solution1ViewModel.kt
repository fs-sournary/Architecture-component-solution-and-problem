package com.itlifelang.archiecturecomponentproblemsandsolution.ui.solution1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class Solution1ViewModel : ViewModel() {

    private val _number = MutableLiveData<Int>()
    val number: LiveData<Int> = _number
    val numberText = _number.map { "Number is: $it" }

    fun setNumber(newNumber: Int) {
        if (_number.value != newNumber) {
            _number.value = newNumber
        }
    }
}
