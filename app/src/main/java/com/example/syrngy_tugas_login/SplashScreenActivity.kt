package com.example.syrngy_tugas_login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val sharedPreferences = getSharedPreferences(userdata.SP_NAME, Context.MODE_PRIVATE)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {}

        val handler = Handler()

        handler.postDelayed({

            val contains = sharedPreferences.contains(userdata.FIELD_LOGIN)

            Log.d("hasil", contains.toString())

            if (contains) {
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
            }
            finish()
        },2000)

    }
}