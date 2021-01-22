package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem0

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Problem0ViewModel : ViewModel(){

    private val _navigateEvent = MutableLiveData<Any>()
    val navigateEvent: LiveData<Any> = _navigateEvent

    fun launchNavigation(){
        _navigateEvent.value = Any()
    }
}
