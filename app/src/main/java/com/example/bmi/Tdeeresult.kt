package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tdeeresult.*

class Tdeeresult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tdeeresult)

        var Result = intent.getStringExtra("v4")
        var res = Result.toString()
        textResult.setText(res.toString())
    }
}