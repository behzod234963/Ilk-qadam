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

        val b_Zikrlar=findViewById<Button>(R.id.b_main_zikrlar)
        val bNamoz=findViewById<Button>(R.id.b_Namoz_Main)

        b_Zikrlar.setOnClickListener {

            openZikrlar()

        }

        bNamoz.setOnClickListener {

            openNamoz()

        }

    }
    fun openZikrlar(){

        val zikrlaractivity=Intent(this,ZikrlarActivity::class.java)
        startActivity(zikrlaractivity)

    }

    fun openNamoz(){

        val openNamoz=Intent(this,NamozActivity::class.java)
        startActivity(openNamoz)

    }

}