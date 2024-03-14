package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        //переход на следующую страницу
        val btn = findViewById<View>(R.id.button1) as Button
        btn.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity4,
                    MainActivity5::class.java
                )
            )
        }
    }
    //переход на страницу входа
    fun onClickText(view: View) {
        startActivity(
            Intent(
                this@MainActivity4,
                MainActivity6::class.java
            )
        )
    }
}