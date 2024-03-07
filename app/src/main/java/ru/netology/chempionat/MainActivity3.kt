package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        //переход на следующую страницу
        val btn = findViewById<View>(R.id.button2) as Button
        btn.setOnClickListener {
            startActivity(Intent(
                    this@MainActivity3,
                    MainActivity4::class.java
                )
            )
        }
        //переход на страницу регистрации
        val btnr = findViewById<View>(R.id.button) as Button
        btnr.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity3,
                    MainActivity4::class.java
                )
            )
        }
    }
}