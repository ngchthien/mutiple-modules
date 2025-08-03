package com.tkjen.core.network.datasource

import com.tkjen.core.network.apis.UserApi
import com.tkjen.core.network.entities.UserRemote
import com.tkjen.core.network.utils.NetworkResult
import javax.inject.Inject

interface ConfigRemoteDataSource {

    suspend fun getUser(): NetworkResult<List<UserRemote>>
}

class ConfigRemoteDataSourceImpl @Inject constructor(
    private val userApi: UserApi
) : ConfigRemoteDataSource {

    override suspend fun getUser(): NetworkResult<List<UserRemote>> {
        try {
            val response = userApi.getUser()
            if (response.isSuccessful) {
                return NetworkResult.Success(response.body() ?: emptyList())
            } else {
                return NetworkResult.Error(response.code(), response.message())
            }
        } catch (e: Exception) {
            return NetworkResult.Exception(e)
        }
    }
}