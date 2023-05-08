package com.example.core.data

import com.example.core.data.dto.Result
import com.example.core.data.dto.response.authentication.AuthenticationResponse
import com.example.core.data.dto.response.products.ProductResponse
import retrofit2.Response

interface ProductsDataSource {

    suspend fun getToken(
        clientCode: String,
        username: String,
        password: String
    ): Result<Response<AuthenticationResponse>>

    suspend fun getProductsList(token: String): Result<ProductResponse>
}