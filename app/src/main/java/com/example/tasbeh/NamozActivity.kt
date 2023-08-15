package com.example.tasbeh

import android.content.Intent
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class NamozActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_namoz)

        initViews()

    }

    private fun initViews() {

        val wvTutorial:WebView=findViewById(R.id.wv_TutoriaL)
        val swrSwipeRefresh:SwipeRefreshLayout=findViewById(R.id.swr_SwipeToRefrsh)

        wvTutorial.settings.javaScriptEnabled

        wvTutorial.webViewClient=object :WebViewClient(){

            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

                if (url != null){

                    view?.loadUrl(url)

                }
                return true
            }

        }

    }
}