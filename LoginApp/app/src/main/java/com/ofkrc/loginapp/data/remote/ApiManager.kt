package com.ofkrc.loginapp.data.remote


import com.ofkrc.loginapp.data.model.LoginRequest
import com.ofkrc.loginapp.data.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiManager {
    @POST("api/login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}