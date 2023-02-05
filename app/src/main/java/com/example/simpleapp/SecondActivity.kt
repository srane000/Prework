package com.example.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.Random

class SecondActivity : AppCompatActivity() {
    private val messages = listOf("Work today for a better tomorrow", "It seems like you may run into a little fortune today", "It seems like the weather is a bit chilly", "Hope you are having a good day")
    private val random = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prompt_file)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val randMessage = messages[random.nextInt(messages.size)]
            Toast.makeText(this, randMessage, Toast.LENGTH_SHORT).show()
        }
    }
}