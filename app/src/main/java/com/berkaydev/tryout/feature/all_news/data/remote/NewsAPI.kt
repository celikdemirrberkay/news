package com.berkaydev.tryout.feature.all_news.data.remote

import com.berkaydev.tryout.core.utils.NetworkConstants
import com.berkaydev.tryout.feature.all_news.data.remote.dto.NewsDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    /// Get the latest news
    @GET(NetworkConstants.ENDPOINT)
    suspend fun getNews(
        @Query("country") countryCode: String = "tr",
        @Query("q") query: String,
        @Query("apiKey") apiKey: String = NetworkConstants.API_KEY
    ) : NewsDto


}
