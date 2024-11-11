package com.example.roominvalidschemaaboutviews

import android.app.Application

class MyApplication : Application() {
    companion object {
        lateinit var database: MyDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = MyDatabase.getDatabase(this)
    }
}