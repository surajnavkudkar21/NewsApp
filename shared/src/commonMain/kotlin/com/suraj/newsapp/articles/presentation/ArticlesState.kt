package com.suraj.newsapp.articles.presentation

import com.suraj.newsapp.articles.application.Article

data class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
