package com.teerap.codelab.daggersampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences
import android.util.Log
import com.teerap.codelab.daggersampleapp.dagger.UserPreference
import javax.inject.Inject



class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var mSharedPreferences: SharedPreferences


    @Inject
    lateinit var mPreference : UserPreference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        (application as MainApplication).utilComponent!!.inject(this)



       // mSharedPreferences?.edit()?.putString("Key", "save in xml")?.apply()

        //Log.e("fsdf",mSharedPreferences?.getString("Key",""))

    }
}


