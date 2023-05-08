package com.example.core.database.dto

sealed class LocalResult<out T : Any> {
    data class Success<out T : Any>(val data: T) : LocalResult<T>()
    data class Error(val message: String?, val statusCode: Int? = null) :
        LocalResult<Nothing>()
}