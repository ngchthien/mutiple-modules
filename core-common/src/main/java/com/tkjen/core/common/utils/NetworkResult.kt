package com.tkjen.core.common.utils

sealed class NetworkResult<T>{
    data class Success<T>(val data: T) : NetworkResult<T>()
    data class Error<T>(val code: Int, val message: String?) : NetworkResult<T>()
    data class Exception<T>(val e: Throwable) : NetworkResult<T>()
}
