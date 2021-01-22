package com.itlifelang.archiecturecomponentproblemsandsolution.ui.solution3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itlifelang.archiecturecomponentproblemsandsolution.util.Event
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Solution3ViewModel : ViewModel() {

    private val _number = MutableLiveData<Event<Int>>()
    val number: LiveData<Event<Int>> = _number

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    init {
        makeFakeLoading()
    }

    private fun makeFakeLoading() {
        viewModelScope.launch {
            _loading.value = true
            delay(1000)
            _loading.value = false
        }
    }

    fun setNumber(newNumber: Int) {
        if (_number.value?.peekContent() != newNumber) {
            _number.value = Event(newNumber)
        }
    }
}
