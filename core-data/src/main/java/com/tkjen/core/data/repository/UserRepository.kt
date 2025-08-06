package com.tkjen.core.data.repository

import com.tkjen.core.common.IoDispatcher
import com.tkjen.core.common.utils.NetworkResult
import com.tkjen.core.model.User
import com.tkjen.core.data.mapper.toModel
import com.tkjen.core.network.datasource.ConfigRemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

interface UserRepository {

    suspend fun getUser(): List<User>
}

class UserRepositoryImpl @Inject constructor(
    private val configRemoteDataSource: ConfigRemoteDataSource,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
):UserRepository{
    override suspend fun getUser(): List<User> = withContext(dispatcher){
        when(val result = configRemoteDataSource.getUser()){
            is NetworkResult.Success ->{
                    result.data.map {
                        it.toModel()
                    }

            }
            is NetworkResult.Error -> {
               throw Exception("${result.message} & ${result.code}")
            }
            is NetworkResult.Exception -> throw result.e
        }
    }
}