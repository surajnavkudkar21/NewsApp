package com.suraj.newsapp

import kotlinx.coroutines.CoroutineScope

expect open class BaseViewModel() {

    val scope:CoroutineScope
}