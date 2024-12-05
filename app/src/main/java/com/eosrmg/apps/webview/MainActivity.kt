package com.eosrmg.apps.webview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.eosrmg.apps.webview.ui.theme.WebViewTheme
import com.eosrmg.apps.webview.ui.view.WebView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WebViewTheme {

                WebView()
            }
        }
    }
}

