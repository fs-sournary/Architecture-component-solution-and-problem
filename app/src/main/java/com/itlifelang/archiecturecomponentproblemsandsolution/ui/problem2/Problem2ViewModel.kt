package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Problem2ViewModel : ViewModel(){

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name
}
