package com.example.activityintent
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPhone: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var checkBoxTerms: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPhone = findViewById(R.id.editTextPhone)
        editTextPassword = findViewById(R.id.editTextPassword)
        checkBoxTerms = findViewById(R.id.checkBoxTerms)

        val buttonRegister = findViewById<Button>(R.id.buttonRegister)
        buttonRegister.setOnClickListener {
            if (checkBoxTerms.isChecked) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("username", editTextUsername.text.toString())
                intent.putExtra("email", editTextEmail.text.toString())
                intent.putExtra("phone", editTextPhone.text.toString())
                intent.putExtra("password", editTextPassword.text.toString())
                startActivity(intent)

            }
        }
    }
}
