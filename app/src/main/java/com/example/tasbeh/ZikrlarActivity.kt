package com.example.tasbeh

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ZikrlarActivity: AppCompatActivity(){
    lateinit var ibVolume:ImageButton
    lateinit var tvMode:TextView
    lateinit var ibReset:ImageButton
    lateinit var tvStatus:TextView
    lateinit var bClick:Button
    lateinit var llMode:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zikrlar)

        initViews()

    }

    fun initViews(){

        var count33=0
        var count99=0
        var mode=33

        ibVolume=findViewById(R.id.ib_volume)
        tvMode=findViewById(R.id.tv_Mode)
        ibReset=findViewById(R.id.ib_reset)
        tvStatus=findViewById(R.id.tv_status)
        bClick=findViewById(R.id.b_click)
        llMode=findViewById(R.id.ll_Mode)

        bClick.setOnClickListener {

            if (mode==33){

                count33++
                bClick.text="$count33"
                tvStatus.text="$count33/33"
                if (count33==33){

                    count33=0
                    bClick.text="0"
                    tvStatus.text="0/33"

                }

            }
            if (mode==99){

                count99++
                bClick.text="$count99"
                tvStatus.text="$count99/99"
                if (count99==99){

                    count99=0
                    bClick.text="0"
                    tvStatus.text="0/99"

                }

            }

        }

        ibReset.setOnClickListener {

            count33=0
            count99=0
            mode=33
            tvMode.text="33"
            tvStatus.text="0/33"
            bClick.text="0"

        }

        llMode.setOnClickListener {

            mode=99
            tvMode.text="99"
            tvStatus.text="0/99"
            bClick.text="0"


        }


    }

}