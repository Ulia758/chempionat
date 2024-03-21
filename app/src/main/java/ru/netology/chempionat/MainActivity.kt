package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //переход на следующую страницу с задержкой
        Handler().postDelayed({
            startActivity(
                Intent(this@MainActivity, MainActivity2::class.java))
            finish()
        },2000)

    }
}