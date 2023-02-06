package com.example.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.Random

class SecondActivity : AppCompatActivity() {
    private val messages = listOf("Life seems to be shining down on you!", "Money in some form is to come your way...", "The love of your life may be right next to you today!", "A promotion is in the works for you soon.")
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