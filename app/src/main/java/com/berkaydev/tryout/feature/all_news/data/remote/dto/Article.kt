package com.berkaydev.tryout.feature.all_news.data.remote.dto

data class Article(
    val author: String,
    val content: Any,
    val description: Any,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: Any
)