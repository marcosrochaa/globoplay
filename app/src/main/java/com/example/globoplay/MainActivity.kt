package com.example.globoplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.globoplay.ui.components.Home2
import com.example.globoplay.ui.theme.GloboplayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GloboplayTheme {
                Surface {
                    APP()
                }
            }
        }
    }
}

@Composable
fun APP () {
    GloboplayTheme {
        Home2()
    }
}