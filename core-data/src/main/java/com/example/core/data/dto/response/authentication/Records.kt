package com.example.core.data.dto.response.authentication

import com.google.gson.annotations.SerializedName

data class Records(
    @SerializedName("userID") var userID: String? = null,
    @SerializedName("userName") var userName: String? = null,
    @SerializedName("employeeID") var employeeID: String? = null,
    @SerializedName("employeeName") var employeeName: String? = null,
    @SerializedName("groupID") var groupID: String? = null,
    @SerializedName("groupName") var groupName: String? = null,
    @SerializedName("ipAddress") var ipAddress: String? = null,
    @SerializedName("sessionKey") var sessionKey: String? = null,
    @SerializedName("sessionLength") var sessionLength: Int? = null,
    @SerializedName("isPasswordExpired") var isPasswordExpired: Boolean? = null,
    @SerializedName("loginUrl") var loginUrl: String? = null,
    @SerializedName("berlinPOSVersion") var berlinPOSVersion: String? = null,
    @SerializedName("berlinPOSAssetsURL") var berlinPOSAssetsURL: String? = null,
    @SerializedName("epsiURL") var epsiURL: String? = null,
    @SerializedName("remindUserToUpdateUsername") var remindUserToUpdateUsername: Int? = null,
    @SerializedName("customerRegistryURLs") var customerRegistryURLs: ArrayList<String> = arrayListOf(),
    @SerializedName("couponRegistryURLs") var couponRegistryURLs: ArrayList<String> = arrayListOf(),
    @SerializedName("displayAdManagerURLs") var displayAdManagerURLs: ArrayList<String> = arrayListOf(),
    @SerializedName("epsiDownloadURLs") var epsiDownloadURLs: ArrayList<EpsiDownloadURLs> = arrayListOf(),
    @SerializedName("identityToken") var identityToken: String? = null,
    @SerializedName("token") var token: String? = null
)
