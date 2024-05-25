package com.berkaydev.tryout.feature.all_news.presentation.view_model

import androidx.lifecycle.ViewModel
import com.berkaydev.tryout.feature.all_news.domain.use_cases.AllNewsUseCase
import javax.inject.Inject

class AllNewsViewModel @Inject constructor(
    private val useCase: AllNewsUseCase
) :  ViewModel() {



}