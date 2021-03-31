package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmi.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bmicalbtn.setOnClickListener {
            var result = 0.00
            var weight = weightbmi.text.toString().toDouble()
            var height = heightbmi.text.toString().toDouble() /100
            var heightfinal = height*height
            result = weight.toString().toDouble() / heightfinal.toString().toDouble()
            var resultfinal:Double =  String.format("%.2f", result).toDouble()
            val intent = Intent(this,Bmi::class.java)
            intent.putExtra("v1",resultfinal.toString())
            startActivity(intent)
        }

        BMRP.setOnClickListener {
            val it = Intent(this,Bmr::class.java)
            startActivity(it)
        }

    }
}