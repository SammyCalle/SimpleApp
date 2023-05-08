package com.example.core.data.remote

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TokenGeneration {

    var code = ""
    private val baseUrl = "https://$code.erply.com/api/"

    private fun getToken(): Retrofit {
        val gson = GsonBuilder().create()
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    val apiService: TokenApiService = getToken().create(TokenApiService::class.java)
}