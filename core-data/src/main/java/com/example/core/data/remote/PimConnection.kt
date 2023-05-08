package com.example.core.data.remote

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PimConnection {

    private const val baseUrl = "https://api-pim-eu10.erply.com/v1/product"

    private fun getProducts(): Retrofit {
        val gson = GsonBuilder().create()
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    val apiService: ProductsApiService = getProducts().create(ProductsApiService::class.java)
}