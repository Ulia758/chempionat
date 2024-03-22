package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        //переход на следующую страницу с задержкой
        Handler().postDelayed({
            startActivity(
                Intent(this@MainActivity10, MainActivity11::class.java)
            )
            finish()
        },500)
    }
}