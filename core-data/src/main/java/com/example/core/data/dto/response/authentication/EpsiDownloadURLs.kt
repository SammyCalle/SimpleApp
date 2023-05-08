package com.example.core.data.dto.response.authentication

import com.google.gson.annotations.SerializedName

data class EpsiDownloadURLs(
    @SerializedName("operatingSystem") var operatingSystem: String? = null,
    @SerializedName("url") var url: String? = null
)
