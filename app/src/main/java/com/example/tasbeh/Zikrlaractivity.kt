package com.example.tasbeh

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Zikrlaractivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zikrlar)

        navigation()

    }

    fun initViews(){

        val tvText=findViewById<TextView>(R.id.tv_text)
        val ibVolume=findViewById<ImageButton>(R.id.ib_volume)
        val bMode=findViewById<Button>(R.id.b_mode)
        val ibReset=findViewById<ImageButton>(R.id.ib_reset)
        val ivMosquePic=findViewById<ImageView>(R.id.iv_mosquepic)
        val tvStatus=findViewById<TextView>(R.id.tv_status)
        val bClick=findViewById<Button>(R.id.b_click)
        var count33=0
        var count99=0


    }

    fun navigation(){

        var ibBack=findViewById<ImageButton>(R.id.ib_back)
        val backToMain=Intent(this,MainActivity::class.java)

        ibBack.setOnClickListener {

            startActivity(backToMain)

        }

    }

}