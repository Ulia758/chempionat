package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }

    fun onClickText(view: View) {
        startActivity(
            Intent(
                this@MainActivity6,
                MainActivity5::class.java
            )
        )
    }
    fun onClickText2Forgot(view: View) {
        startActivity(
            Intent(
                this@MainActivity6,
                MainActivity7::class.java
            )
        )
    }
    fun onClickButton(view: View) {
        startActivity(
            Intent(
                this@MainActivity6,
                MainActivity10::class.java
            )
        )
    }
}