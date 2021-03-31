package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmi.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultbmr.*
import kotlinx.android.synthetic.main.activity_resultbmr.TEDP

class resultbmr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultbmr)

        var Result = intent.getStringExtra("v2")
        var total = Result.toString().toDouble()
        textView.setText(Result.toString())


        TEDP.setOnClickListener {
            val intent = Intent(this,Tdee::class.java)
            intent.putExtra("v3",total.toString())
            startActivity(intent)
        }
    }
}