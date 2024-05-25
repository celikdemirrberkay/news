package com.berkaydev.tryout.feature.all_news.domain.use_cases

import com.berkaydev.tryout.core.utils.Resource
import com.berkaydev.tryout.feature.all_news.data.remote.dto.toNews
import com.berkaydev.tryout.feature.all_news.domain.model.News
import com.berkaydev.tryout.feature.all_news.domain.repository.NewsRepository
import kotlinx.coroutines.flow.flow
import java.util.concurrent.Flow
import javax.inject.Inject

class AllNewsUseCase @Inject constructor(
    private val repository: NewsRepository
) {

    fun executeAllNewsUseCase(query: String, countryCode: String) = flow<Resource<List<News>>> {
        try {
            emit(Resource.Loading())
            val news = repository.getNews(query, countryCode)

            if (news.status.equals("ok")) {
                emit(Resource.Success(news.toNews()))
            } else {
                emit(Resource.Error("News not found", news.toNews()))
            }

        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Error "))
        }
    }


}