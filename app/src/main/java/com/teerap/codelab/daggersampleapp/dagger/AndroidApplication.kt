package com.teerap.codelab.daggersampleapp.dagger

import android.app.Application

class AndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }
}