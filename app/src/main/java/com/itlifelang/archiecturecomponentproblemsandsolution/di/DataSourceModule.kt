package com.itlifelang.archiecturecomponentproblemsandsolution.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.itlifelang.archiecturecomponentproblemsandsolution.data.api.Api
import com.itlifelang.archiecturecomponentproblemsandsolution.data.db.AppDatabase
import com.itlifelang.archiecturecomponentproblemsandsolution.data.db.PersonDao
import com.itlifelang.archiecturecomponentproblemsandsolution.data.pref.AppPreference
import com.itlifelang.archiecturecomponentproblemsandsolution.data.pref.DefaultAppPreference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object DataSourceModule {

    @Singleton
    @Provides
    fun provideApi(): Api = Api()

    @Singleton
    @Provides
    fun provideAppPreference(preference: SharedPreferences): AppPreference =
        DefaultAppPreference(preference)

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "app.db").build()

    @Singleton
    @Provides
    fun providePersonDao(appDatabase: AppDatabase): PersonDao = appDatabase.getPersonDao()
}
