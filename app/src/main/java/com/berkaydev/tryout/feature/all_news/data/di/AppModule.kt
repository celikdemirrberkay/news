package com.berkaydev.tryout.feature.all_news.data.di

import com.berkaydev.tryout.core.utils.NetworkConstants.BASE_URL
import com.berkaydev.tryout.feature.all_news.data.remote.NewsAPI
import com.berkaydev.tryout.feature.all_news.data.repository.NewsRepositoryImpl
import com.berkaydev.tryout.feature.all_news.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /// Provides NewsApi
    @Provides
    @Singleton
    fun provideNewsApi(): NewsAPI {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsAPI::class.java)

    }

    /// Provides NewsRepository
    @Provides
    @Singleton
    fun provideNewsRepository(api: NewsAPI): NewsRepository {
        return NewsRepositoryImpl(api)
    }
}