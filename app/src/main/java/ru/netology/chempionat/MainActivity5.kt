package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
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
        startActivity(
            Intent(
                this@MainActivity5,
                MainActivity10::class.java
            )
        )
    }
}