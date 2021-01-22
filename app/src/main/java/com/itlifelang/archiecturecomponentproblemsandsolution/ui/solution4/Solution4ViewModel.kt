package com.itlifelang.archiecturecomponentproblemsandsolution.ui.solution4

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.itlifelang.archiecturecomponentproblemsandsolution.R
import com.itlifelang.archiecturecomponentproblemsandsolution.util.Event

class Solution4ViewModel(application: Application) : AndroidViewModel(application) {

    private val resources = application.resources

    private val _message = MutableLiveData<Event<String>>()
    val message: LiveData<Event<String>> = _message

    fun showMessage() {
        _message.value = Event(resources.getString(R.string.message))
    }
}
