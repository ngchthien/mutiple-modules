package com.tkjen.core.common

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
object AppCoroutinesDispatcherModule {

    @IoDispatcher
    @Provides
    fun provideIoDispatcher():CoroutineDispatcher = Dispatchers.IO
}