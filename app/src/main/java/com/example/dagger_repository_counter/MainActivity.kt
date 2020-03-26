package com.example.dagger_repository_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_repository_counter.ui.main.MainFragment
import com.example.dagger_repository_counter.ui.main.MainRepository
import com.example.dagger_repository_counter.ui.main.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var mainRepository: MainRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
        mainRepository.incrementCounter()



    }
}
