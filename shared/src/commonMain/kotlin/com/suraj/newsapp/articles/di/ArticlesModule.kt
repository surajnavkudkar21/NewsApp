package com.suraj.newsapp.articles.di

import com.suraj.newsapp.articles.ArticlesService
import com.suraj.newsapp.articles.ArticlesUseCase
import com.suraj.newsapp.articles.ArticlesViewModel
import org.koin.dsl.module

val articleModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}