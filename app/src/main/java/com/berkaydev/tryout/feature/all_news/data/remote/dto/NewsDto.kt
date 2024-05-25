package com.berkaydev.tryout.feature.all_news.data.remote.dto

import com.berkaydev.tryout.feature.all_news.domain.model.News

/// DTO Class
data class NewsDto(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)

/// DTO Class to News Class
fun NewsDto.toNews(): List<News> {
    return articles.map { article ->
        News(
            author = article.author,
            title = article.title,
            publishedAt = article.publishedAt,
            urlToImage = article.urlToImage
        )
    }.toList()
}