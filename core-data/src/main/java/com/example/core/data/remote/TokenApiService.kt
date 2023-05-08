package com.example.core.data.remote

import com.example.core.data.dto.response.authentication.AuthenticationResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Field

interface TokenApiService {
    @POST("/")
    @FormUrlEncoded
    fun verifyUser(
                   @Field("clientCode") clientCode: String,
                   @Field("username") username: String,
                   @Field("password") password: String,
                   @Field("request") request: String = "verifyUser",
                   @Field("sendContentType") sendContentType: Int = 1,
    ): Response<AuthenticationResponse>
}