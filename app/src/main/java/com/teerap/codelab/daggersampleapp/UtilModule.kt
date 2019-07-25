package com.teerap.codelab.daggersampleapp

import android.app.Application
import dagger.Module
import android.preference.PreferenceManager
import android.content.SharedPreferences
import dagger.Provides
import javax.inject.Singleton

@Module
internal class UtilModule {

    @Provides
    @Singleton
    fun providesSharedPreferences(application: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }
}