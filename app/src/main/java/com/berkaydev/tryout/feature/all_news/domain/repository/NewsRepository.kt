package com.berkaydev.tryout.feature.all_news.domain.repository

import com.berkaydev.tryout.feature.all_news.data.remote.dto.NewsDto

interface NewsRepository {

    /// Get all news
    suspend fun getNews(query: String, countryCode: String): NewsDto

}