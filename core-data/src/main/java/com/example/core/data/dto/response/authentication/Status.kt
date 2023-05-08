package com.example.core.data.dto.response.authentication

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("request") var request: String? = null,
    @SerializedName("requestUnixTime") var requestUnixTime: Int? = null,
    @SerializedName("responseStatus") var responseStatus: String? = null,
    @SerializedName("errorCode") var errorCode: Int? = null,
    @SerializedName("generationTime") var generationTime: Double? = null,
    @SerializedName("recordsTotal") var recordsTotal: Int? = null,
    @SerializedName("recordsInResponse") var recordsInResponse: Int? = null
)
