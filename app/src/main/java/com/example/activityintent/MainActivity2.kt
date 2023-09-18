package com.example.activityintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val password = intent.getStringExtra("password")

        val resultText = "Welcome $username\n" + "Your Email $email\n has been activated" +
                "your $phone\n has been registered"

        textViewResult.text = resultText
    }
}


