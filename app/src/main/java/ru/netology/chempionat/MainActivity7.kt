package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
    }

    fun onClickText(view: View) {
        startActivity(
            Intent(
                this@MainActivity7,
                MainActivity6::class.java
            )
        )
    }
}