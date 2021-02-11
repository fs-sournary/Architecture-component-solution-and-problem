package com.itlifelang.archiecturecomponentproblemsandsolution.data.pref

import android.content.SharedPreferences
import androidx.core.content.edit
import com.itlifelang.archiecturecomponentproblemsandsolution.data.pref.AppPreference.Companion.ACCESS_TOKEN_KEY

class DefaultAppPreference(private val preference: SharedPreferences) : AppPreference {

    override fun saveAccessToken(accessToken: String) {
        preference.edit { putString(ACCESS_TOKEN_KEY, accessToken) }
    }

    override fun getAccessToken(): String? = preference.getString(ACCESS_TOKEN_KEY, "")
}
