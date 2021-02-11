package com.itlifelang.archiecturecomponentproblemsandsolution.result

/**
 * Wrapper class of data that is used for events such as navigation, show message...
 */
open class Event<out T>(private val content: T) {

    var hasBeenHandled: Boolean = false
        private set // Allow external read but not write

    /**
     * Return the content's event if we handled and prevent use it again.
     */
    fun getContentIfNotHandled(): T? = if (hasBeenHandled) {
        null
    } else {
        hasBeenHandled = true
        content
    }

    /**
     * Return the content's event whenever it handled
     */
    fun peekContent(): T = content
}
