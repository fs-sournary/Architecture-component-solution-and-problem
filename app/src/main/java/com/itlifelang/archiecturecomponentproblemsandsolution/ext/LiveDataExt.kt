package com.itlifelang.archiecturecomponentproblemsandsolution.ext

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.itlifelang.archiecturecomponentproblemsandsolution.util.Event

fun <T> LiveData<Event<T>>.observeEvent(lifecycleOwner: LifecycleOwner, action: (T) -> Unit) {
    observe(lifecycleOwner) { event ->
        event.getContentIfNotHandled()?.let { data -> action(data) }
    }
}
