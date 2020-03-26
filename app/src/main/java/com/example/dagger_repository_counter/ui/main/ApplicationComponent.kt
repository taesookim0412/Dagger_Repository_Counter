package com.example.dagger_repository_counter.ui.main

import android.app.Application
import com.example.dagger_repository_counter.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent{
    fun inject(activity: MainActivity)
}

class MyApplication: Application(){
    val appComponent = DaggerApplicationComponent.create()
}