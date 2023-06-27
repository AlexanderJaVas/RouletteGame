package com.avvaapps.roulettegame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.avvaapps.roulettegame.roulettescreen.MainScreen
import com.avvaapps.roulettegame.ui.theme.GreenBackground
import com.avvaapps.roulettegame.ui.theme.RouletteGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RouletteGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenBackground
                ) {
                    MainScreen()
                }
            }
        }
    }
}