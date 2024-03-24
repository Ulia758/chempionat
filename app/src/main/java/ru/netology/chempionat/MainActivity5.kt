package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity5 : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpButton: Button
    private lateinit var signInButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        emailEditText=findViewById(R.id.editTextTextEmailAddress)
        passwordEditText=findViewById(R.id.editTextTextPassword)
        signUpButton=findViewById(R.id.button)
        signInButton=findViewById(R.id.textView11)
    }
    fun onClickText(view: View) {
        startActivity(
            Intent(
                this@MainActivity5,
                MainActivity6::class.java
            )
        )
    }
    fun onClickButton(view: View) {
        val email = emailEditText.text
        val password = passwordEditText.text
//        SupabaseAuthViewModel().signUp(applicationContext,email,password)

        startActivity(
            Intent(
                this@MainActivity5,
                MainActivity10::class.java
            )
        )
    }
}