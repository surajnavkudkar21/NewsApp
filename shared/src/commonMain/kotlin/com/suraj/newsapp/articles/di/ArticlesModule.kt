package com.suraj.newsapp.articles.di

import com.suraj.newsapp.articles.data.ArticlesDataSource
import com.suraj.newsapp.articles.data.ArticlesRepository
import com.suraj.newsapp.articles.data.ArticlesService
import com.suraj.newsapp.articles.application.ArticlesUseCase
import com.suraj.newsapp.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articleModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}