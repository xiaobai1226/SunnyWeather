package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldBLeak")
        lateinit var context: Context

        // 填入获取的彩云天气令牌值
        const val TOKEN = "lnKbtghgufEiVlvO"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}