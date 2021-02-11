package com.itlifelang.archiecturecomponentproblemsandsolution.extension

import androidx.fragment.app.Fragment
import com.itlifelang.archiecturecomponentproblemsandsolution.util.AutoClearedValue

fun <T> Fragment.autoCleared(): AutoClearedValue<T> = AutoClearedValue(this)
