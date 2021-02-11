package com.itlifelang.archiecturecomponentproblemsandsolution.di

import com.itlifelang.archiecturecomponentproblemsandsolution.data.api.Api
import com.itlifelang.archiecturecomponentproblemsandsolution.data.db.PersonDao
import com.itlifelang.archiecturecomponentproblemsandsolution.repository.home.DefaultHomeRepository
import com.itlifelang.archiecturecomponentproblemsandsolution.repository.home.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideHomeRepository(api: Api, personDao: PersonDao): HomeRepository =
        DefaultHomeRepository(api, personDao)
}
