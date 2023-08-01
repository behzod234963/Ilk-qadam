package com.example.tasbeh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation()

    }

    fun navigation(){

        var b_Zikrlar=findViewById<Button>(R.id.b_main_zikrlar)
        val zikrlaractivity=Intent(this,Zikrlaractivity::class.java)

        b_Zikrlar.setOnClickListener {

            startActivity(zikrlaractivity)

        }

    }

}