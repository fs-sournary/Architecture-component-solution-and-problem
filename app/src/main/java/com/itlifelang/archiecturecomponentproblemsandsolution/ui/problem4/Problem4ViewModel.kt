package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem4

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.itlifelang.archiecturecomponentproblemsandsolution.util.Event

class Problem4ViewModel : ViewModel() {

    private val _message = MutableLiveData<Event<String>>()
    val message: LiveData<Event<String>> = _message

    // Don't do this: ViewModel shouldn't contain any object that have lifecycle shorter than it
    val viewListener = View.OnClickListener {
        _message.value = Event("Problem 4: Leaking ViewModel")
    }
}
