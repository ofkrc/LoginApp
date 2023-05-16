package com.ofkrc.loginapp.data.model

annotation class SerializedName(val value: String)


data class LoginRequest (
    @SerializedName("email"    ) var email    : String? = null,
    @SerializedName("password" ) var password : String? = null
)

data class LoginResponse (
    @SerializedName("token" ) var token : String? = null
)


