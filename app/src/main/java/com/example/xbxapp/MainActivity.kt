package com.example.xbxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xbxapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bFrag2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.place_holder, BlankFragment2.newInstance())
                .commit()
        }

        supportFragmentManager
            .beginTransaction() // запуск фрагмента
            .replace(R.id.place_holder, MainFragment.newInstance()) // заменяет фрагмент если он уже есть
            .commit() // активирует всё чтоб заработало
    }
}