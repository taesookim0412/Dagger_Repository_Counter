package com.example.dagger_repository_counter.ui.main

import javax.inject.Inject


class CounterRepository @Inject constructor(){
    var counter:Int
    init{
        counter = 0
    }
}