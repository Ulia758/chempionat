package ru.netology.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class WhiteScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_white_screen)
        //переход на следующую страницу с задержкой
        Handler().postDelayed({
            startActivity(
                Intent(this@WhiteScreen, MainActivity5::class.java)
            )
            finish()
        },1000)
    }
}