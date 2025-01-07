package com.suraj.newsapp.db

import app.cash.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {

    fun createDriver(): SqlDriver
}