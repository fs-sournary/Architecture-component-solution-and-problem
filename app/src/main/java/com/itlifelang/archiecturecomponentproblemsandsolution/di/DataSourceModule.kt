package com.itlifelang.archiecturecomponentproblemsandsolution.di

import com.itlifelang.archiecturecomponentproblemsandsolution.data.api.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object DataSourceModule {

    @Singleton
    @Provides
    fun provideApi(): Api = Api()
}
