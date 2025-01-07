package com.suraj.newsapp.android

import android.app.Application
import com.suraj.newsapp.android.di.viewModelsModule
import com.suraj.newsapp.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NewsAppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelsModule

        startKoin {
            androidContext(this@NewsAppApplication)
            modules(modules)
        }
    }
}