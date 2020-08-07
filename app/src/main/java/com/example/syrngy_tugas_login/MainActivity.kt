package com.example.syrngy_tugas_login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences(userdata.SP_NAME, Context.MODE_PRIVATE)

        val userNameInSP = sharedPreferences.getString(userdata.FIELD_USERNAME, "Belum Ada Data")

        tvUsername.setText(userNameInSP)
    }
}