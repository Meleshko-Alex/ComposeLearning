package com.example.composelearning.screens

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier

@Composable
fun StateScreen(count: State<Int>, onCounterClick: () -> Unit) {
    val counterValue = count.value

    Text(
        text = "Count = $counterValue",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )
}