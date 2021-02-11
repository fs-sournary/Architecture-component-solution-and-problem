package com.itlifelang.archiecturecomponentproblemsandsolution.result

import com.itlifelang.archiecturecomponentproblemsandsolution.result.Result.Success

/**
 * The wrapper class handles data with its loading state such as loading, success, error...
 */
sealed class Result<out R> {

    object Loading : Result<Nothing>()

    data class Success<out T>(val data: T) : Result<T>()

    data class Error(val e: Exception) : Result<Nothing>()
}

val <T> Result<T>.data: T?
    get() = (this as? Success)?.data

fun <T> Result<T>.successOr(fallback: () -> T): T = (this as? Success)?.data ?: fallback()
