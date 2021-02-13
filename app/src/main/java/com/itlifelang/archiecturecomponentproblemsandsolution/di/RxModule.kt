package com.itlifelang.archiecturecomponentproblemsandsolution.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
annotation class MainScheduler

@Qualifier
annotation class IoScheduler

@Qualifier
annotation class ComputationScheduler

@InstallIn(ApplicationComponent::class)
@Module
object RxModule {

    @Singleton
    @Provides
    @MainScheduler
    fun provideMainScheduler(): Scheduler = AndroidSchedulers.mainThread()

    @Singleton
    @Provides
    @IoScheduler
    fun provideIoScheduler(): Scheduler = Schedulers.io()

    @Singleton
    @Provides
    @ComputationScheduler
    fun provideComputationScheduler(): Scheduler = Schedulers.computation()
}
