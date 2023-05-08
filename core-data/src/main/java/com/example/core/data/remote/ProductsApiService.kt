package com.example.core.data.remote

import com.example.core.data.dto.response.products.ProductResponse
import retrofit2.http.GET
import retrofit2.http.Header

interface ProductsApiService {

    @GET("v1/product")
    suspend fun getProducts(
        @Header("jwt") jwt: String,
        @Header("accept") accept: String = "application/json"
    ): ProductResponse
}