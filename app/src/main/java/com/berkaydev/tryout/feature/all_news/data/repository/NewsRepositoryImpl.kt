package com.berkaydev.tryout.feature.all_news.data.repository

import com.berkaydev.tryout.feature.all_news.data.remote.NewsAPI
import com.berkaydev.tryout.feature.all_news.data.remote.dto.NewsDto
import com.berkaydev.tryout.feature.all_news.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val api: NewsAPI,
) :  NewsRepository {

    override suspend fun getNews(query: String, countryCode: String): NewsDto {
        return api.getNews(query = query, countryCode = countryCode)
    }
}