package com.example.core.data.dto.response.products

import com.google.gson.annotations.SerializedName

data class En(

    @SerializedName("html") var html: String? = null,
    @SerializedName("plain_text") var plainText: String? = null

)