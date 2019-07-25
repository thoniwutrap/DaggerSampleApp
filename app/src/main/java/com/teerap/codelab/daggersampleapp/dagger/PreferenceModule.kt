package com.teerap.codelab.daggersampleapp.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PreferenceModule {
    @Singleton
    @Provides
    fun provideUserPreference(application: AndroidApplication) =
        UserPreference(application.applicationContext)

}
