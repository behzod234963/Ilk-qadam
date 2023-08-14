package com.example.tasbeh

import android.graphics.Color
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class TahoratolishActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahoratolish)

        initViews()

    }
    private fun initViews() {

        val webView: WebView =findViewById(R.id.wv_TahoratOlish)
        val swrSwipeToRefresh: SwipeRefreshLayout =findViewById(R.id.swr_SwipeToRefrsh)
        swrSwipeToRefresh.setColorSchemeColors(Color.BLACK)

        swrSwipeToRefresh.setOnRefreshListener {

            val text="Yangilandi"
            webView.loadUrl("https://namoz.islom.uz/")
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            swrSwipeToRefresh.isRefreshing=false

        }

        webView.loadUrl("https://namoz.islom.uz/")


    }

}