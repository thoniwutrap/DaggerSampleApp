package com.teerap.codelab.daggersampleapp


import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, UtilModule::class])
interface UtilComponent {
    fun inject(activity: MainActivity)
}