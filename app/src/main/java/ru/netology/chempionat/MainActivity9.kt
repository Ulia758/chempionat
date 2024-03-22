package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

    }
    fun onClickButton(view: View) {
        startActivity(
            Intent(
                this@MainActivity9,
                MainActivity10::class.java
            )
        )
    }
}