package com.suraj.newsapp.di

import com.suraj.newsapp.articles.di.articleModule

val sharedKoinModules = listOf(
    articleModule,
    networkModule
)