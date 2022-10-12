package com.example.rabotassetiu.data.api

import com.example.rabotassetiu.model.beznal.Beznal
import com.example.rabotassetiu.model.beznal.BeznalItem
import com.example.rabotassetiu.model.nal.Nalichka
import com.example.rabotassetiu.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("daily_json.js")
    suspend fun getNalMoneys(): Response<NalichkaItem>

    @GET("daily_json.js")
    suspend fun getBezNalMoneys(): Response<BeznalItem>
}