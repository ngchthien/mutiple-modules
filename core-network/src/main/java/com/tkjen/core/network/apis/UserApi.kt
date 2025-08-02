package com.tkjen.core.network.apis

import com.tkjen.core.network.entities.UserRemote
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {

    @GET("/users/")
    suspend fun getUser():Response<List<UserRemote>>
}