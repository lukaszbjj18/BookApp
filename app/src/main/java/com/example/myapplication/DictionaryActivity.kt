package com.example.myapplication

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DictionaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary)

        var listView = findViewById<ListView>(R.id.DictionaryList)
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@DictionaryActivity, "Klika sobie", Toast.LENGTH_LONG)
        }

    }
}
