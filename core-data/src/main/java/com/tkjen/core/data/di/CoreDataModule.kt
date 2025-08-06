package com.tkjen.core.data.di

import com.tkjen.core.data.repository.UserRepository
import com.tkjen.core.network.datasource.ConfigRemoteDataSource
import com.tkjen.core.network.datasource.ConfigRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface CoreDataModule {
    @Provides
    fun provideUserRepository(configRemoteDataSourceImpl: ConfigRemoteDataSourceImpl):UserRepository
}