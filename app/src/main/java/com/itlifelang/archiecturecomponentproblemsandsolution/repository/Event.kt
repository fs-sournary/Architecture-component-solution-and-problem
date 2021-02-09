package com.itlifelang.archiecturecomponentproblemsandsolution.repository

/**
 * The wrapper class handles events that wrap by the LiveData.
 */
open class Event<T>(private val content: T) {

    var hasContentHandled = false
        private set // allow read but not write

    /**
     * This method returns data if it hasn't been handled. Otherwise, it will return null.
     */
    fun handleContentIfNotHandled(): T? {
        return if (hasContentHandled) {
            null
        } else {
            hasContentHandled = true
            content
        }
    }

    /**
     * This method returns data even if it has been handled.
     */
    fun peekContent(): T = content
}
