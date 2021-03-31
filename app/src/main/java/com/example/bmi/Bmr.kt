package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmr.*
import kotlinx.android.synthetic.main.activity_main.*

class Bmr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmr)

        bmrcal1btn.setOnClickListener {
            var result = 0.00
            var weight = weightbmr.text.toString().toDouble() * 13.7
            var height = heightbmr.text.toString().toDouble() *5
            var age =  agebmr.text.toString().toDouble()*6.8
            result = 66.0 + weight + height - age

            val intent = Intent(this,resultbmr::class.java)
            intent.putExtra("v2",result.toString())
            startActivity(intent)
        }

        bmrcal2btn.setOnClickListener {
            var result = 0.00
            var weight = weightbmr.text.toString().toDouble() * 9.6
            var height = heightbmr.text.toString().toDouble() * 1.8
            var age =  agebmr.text.toString().toDouble()* 4.7
            result = 665.0 + weight + height - age

            val intent = Intent(this,resultbmr::class.java)
            intent.putExtra("v2",result.toString())
            startActivity(intent)
        }
    }
}