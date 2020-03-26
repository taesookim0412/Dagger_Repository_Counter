package com.example.dagger_repository_counter.ui.main

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(
        private val counterRepository: CounterRepository
){
        fun incrementCounter(){
                counterRepository.counter++;
                Log.d("Counter is now: ", counterRepository.counter.toString())
        }

}