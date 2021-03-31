package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tdee.*

class Tdee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tdee)

        var Result = intent.getStringExtra("v3")
        var dumb1 = Result.toString()
        var dumb = dumb1.toString().toDouble()

        btn1.setOnClickListener {
            var tdeefinal = dumb *1.2
            val intent = Intent(this,Tdeeresult::class.java)
            intent.putExtra("v4",tdeefinal.toString())
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var tdeefinal = dumb *1.3
            val intent = Intent(this,Tdeeresult::class.java)
            intent.putExtra("v4",tdeefinal.toString())
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var tdeefinal = dumb *1.5
            val intent = Intent(this,Tdeeresult::class.java)
            intent.putExtra("v4",tdeefinal.toString())
            startActivity(intent)
        }
        btn4.setOnClickListener {
            var tdeefinal = dumb *1.7
            val intent = Intent(this,Tdeeresult::class.java)
            intent.putExtra("v4",tdeefinal.toString())
            startActivity(intent)
        }
        btn5.setOnClickListener {
            var tdeefinal = dumb *1.9
            val intent = Intent(this,Tdeeresult::class.java)
            intent.putExtra("v4",tdeefinal.toString())
            startActivity(intent)
        }
    }
}