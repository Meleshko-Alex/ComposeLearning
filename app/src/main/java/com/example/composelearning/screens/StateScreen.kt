package com.example.composelearning.screens

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StateScreen(count: Int, onCounterClick: () -> Unit) {
    Text(
        text = "Count = $count",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )
}