package com.suraj.newsapp.articles

import com.suraj.newsapp.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel(
    private val articlesUseCase: ArticlesUseCase
) : BaseViewModel() {

    private val _articlesState: MutableStateFlow<ArticlesState> =
        MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState>
        get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {

            val fetchedArticles = articlesUseCase.getArticles()

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }
}