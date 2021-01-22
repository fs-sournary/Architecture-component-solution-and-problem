package com.itlifelang.archiecturecomponentproblemsandsolution.ui.solution0

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.itlifelang.archiecturecomponentproblemsandsolution.util.Event
import com.itlifelang.archiecturecomponentproblemsandsolution.util.SingleLiveEvent

class Solution0ViewModel : ViewModel() {

    // Use [Event]
    // private val _navigateEvent = MutableLiveData<Event<Any>>()
    // val navigateEvent: LiveData<Event<Any>> = _navigateEvent

    // Use [SingleLiveEvent]
     private val _navigateEvent = SingleLiveEvent<Any>()
     val navigateEvent: LiveData<Any> = _navigateEvent

    fun launchNavigation() {
        // Use [Event]
        //    _navigateEvent.value = Event(Any())

        // Use [SingleLiveEvent]
         _navigateEvent.value = Any()
    }
}
