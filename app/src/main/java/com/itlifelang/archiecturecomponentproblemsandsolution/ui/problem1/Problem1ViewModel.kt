package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Problem1ViewModel : ViewModel() {

    // This isn't a bug but Architecture component doesn't recommend this.
    val number = MutableLiveData<Int>()
}
