package com.suraj.newsapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform