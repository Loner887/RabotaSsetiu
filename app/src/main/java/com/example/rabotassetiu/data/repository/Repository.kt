package com.example.rabotassetiu.data.repository

import com.example.rabotassetiu.data.api.RetrofitInstance
import com.example.rabotassetiu.model.beznal.Beznal
import com.example.rabotassetiu.model.beznal.BeznalItem
import com.example.rabotassetiu.model.nal.Nalichka
import com.example.rabotassetiu.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<NalichkaItem>{
        return RetrofitInstance.api.getNalMoneys()
    }
    suspend fun getBeznal(): Response<BeznalItem>{
        return RetrofitInstance.api.getBezNalMoneys()
    }
}