package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.example.composelearning.screens.BackgroundScreen
import com.example.composelearning.screens.ClickCounterScreen
import com.example.composelearning.screens.ImageAndIconScreen
import com.example.composelearning.screens.StateScreen
import com.example.composelearning.ui.theme.HomeScreen
import com.example.composelearning.ui.theme.ListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val counter = mutableStateOf(0)
        val checked = mutableStateOf(true)
        val text = mutableStateOf("hint")

        setContent {
            //HomeScreen()
            //ListScreen(listOf())
            //BackgroundScreen()
            //ImageAndIconScreen()

            /*StateScreen(
                count = counter,
                onCounterClick = { counter.value++ },
                checked = checked,
                onCheckedChange = { newCheckedValue -> checked.value = newCheckedValue },
                text = text,
                onTextChange = { newText -> text.value = newText })*/

            ClickCounterScreen(countValue = counter.value, onCounterClick = { counter.value++ })
        }
    }
}
