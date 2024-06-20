package com.example.terminal.data

import retrofit2.http.GET

interface ApiService {

    @GET("aggs/ticker/AAPL/range/1/hour/2022-01-09/2023-02-09?adjusted=true&sort=dec&limit=49999&apiKey=DqBoaSBY9WnId0vQAIo1MMep5ZpVmsGE")
    suspend fun loadBars() : Result
}