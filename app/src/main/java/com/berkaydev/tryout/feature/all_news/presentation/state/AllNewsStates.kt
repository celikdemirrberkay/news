package com.berkaydev.tryout.feature.all_news.presentation.state

import com.berkaydev.tryout.feature.all_news.domain.model.News

data class AllNewsStates (
    val isLoading: Boolean = false,
    val news: List<News> = emptyList(),
    val error : String = "",
    val search : String = ""
)