package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET(value = "countries")
    fun getData(): Call<List<MyDataItem>>
}
