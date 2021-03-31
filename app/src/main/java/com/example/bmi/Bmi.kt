package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmi.*

class Bmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        var Result = intent.getStringExtra("v1")

        resulttext.setText(Result.toString())

        tobmrbtn.setOnClickListener {
            val it = Intent(this,Bmr::class.java)
            startActivity(it)
        }
    }

}