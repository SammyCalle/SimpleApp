package com.example.core.data.dto.response.products

import com.google.gson.annotations.SerializedName

data class Description(

    @SerializedName("en") var en: En? = En()

)