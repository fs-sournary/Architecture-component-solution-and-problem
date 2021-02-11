package com.itlifelang.archiecturecomponentproblemsandsolution.data.pref

interface AppPreference {

    fun saveAccessToken(accessToken: String)

    fun getAccessToken(): String?

    companion object {

        const val SHARED_PREF_NAME = "pref"
        const val ACCESS_TOKEN_KEY = "access_token"
    }
}
