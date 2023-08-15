package com.example.tasbeh

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class NamozSoatlariActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_namoz_soatlari)

        initViews()

    }

    private fun initViews() {

        val webView:WebView=findViewById(R.id.wv_NamozSoatlari)
        webView.settings.javaScriptEnabled

        webView.webViewClient=object : WebViewClient(){

            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url:String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }

        }

        val swrSwipeToRefresh:SwipeRefreshLayout=findViewById(R.id.swr_SwipeToRefrsh)
        swrSwipeToRefresh.setColorSchemeColors(Color.BLACK)
        swrSwipeToRefresh.setOnRefreshListener {

            webView.loadUrl("https://namozvaqtlari.com/uz/namoz-vaqtlari/17-hiva-bugungi-namoz-vatlari.html")
            val text="Yangilandi"
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            swrSwipeToRefresh.isRefreshing=false

        }

        webView.loadUrl("https://namozvaqtlari.com/uz/namoz-vaqtlari/17-hiva-bugungi-namoz-vatlari.html")


    }
}