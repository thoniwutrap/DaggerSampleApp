package com.teerap.codelab.daggersampleapp

import android.app.Application

class MainApplication : Application() {

    var utilComponent: UtilComponent? = null


    override fun onCreate() {

        super.onCreate()

        utilComponent = DaggerUtilComponent.builder()
            .appModule(
                AppModule(this)
            )
            .utilModule(
                UtilModule()
            )
            .build()
    }
}