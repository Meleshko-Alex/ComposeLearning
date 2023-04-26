package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composelearning.screens.BackgroundScreen
import com.example.composelearning.screens.ImageAndIconScreen
import com.example.composelearning.ui.theme.HomeScreen
import com.example.composelearning.ui.theme.ListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //HomeScreen()
            //ListScreen(listOf())
            //BackgroundScreen()
            ImageAndIconScreen()
        }
    }
}
