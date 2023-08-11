package com.example.tasbeh

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class NamozActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_namoz)

        initViews()

    }

    private fun initViews() {

        val bTahorat=findViewById<Button>(R.id.b_Tahorat_Namoz)
        val bNamoz=findViewById<Button>(R.id.b_Namoz_Namoz)

        bTahorat.setOnClickListener {

            openTahoratActivity()

        }

    }
    private fun openTahoratActivity(){

        val openTahorat= Intent(this,TahoratolishActivity::class.java)
        startActivity(openTahorat)

    }
}