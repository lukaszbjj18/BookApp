package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Dictionary.setOnClickListener {
            val dictionaryActivity = Intent(applicationContext, DictionaryActivity::class.java)
            startActivity(dictionaryActivity)
        }

        Quotes.setOnClickListener {
            val quotesActivity = Intent(applicationContext, QuotesActivity::class.java)
            startActivity(quotesActivity)
        }
    }
}
