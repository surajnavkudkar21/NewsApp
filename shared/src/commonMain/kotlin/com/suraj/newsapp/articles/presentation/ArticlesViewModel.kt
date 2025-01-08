package com.suraj.newsapp.articles.presentation

import com.suraj.newsapp.BaseViewModel
import com.suraj.newsapp.articles.application.ArticlesUseCase
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

    fun getArticles(forceFetch: Boolean = false) {
        scope.launch {

            _articlesState.emit(
                ArticlesState(
                    loading = true,
                    articles = _articlesState.value.articles
                )
            )

            val fetchedArticles = articlesUseCase.getArticles(forceFetch)

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }
}