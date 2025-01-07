package com.suraj.newsapp.android.di

import app.cash.sqldelight.db.SqlDriver
import com.suraj.newsapp.db.DatabaseDriverFactory
import com.suraj.newsapp.db.NewsAppDatabase
import org.koin.dsl.module

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory(get()).createDriver() }
    single<NewsAppDatabase> { NewsAppDatabase(get()) }
}