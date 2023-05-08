package com.example.core.data.dto.response.authentication

import com.google.gson.annotations.SerializedName

data class AuthenticationResponse(
    @SerializedName("status") var status: Status? = Status(),
    @SerializedName("records") var records: ArrayList<Records> = arrayListOf()
)