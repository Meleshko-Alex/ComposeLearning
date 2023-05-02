package com.example.composelearning.screens

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composelearning.data.EvenOdd

@Composable
fun ClickCounterScreen(
    countValue: Int,
    onCounterClick: () -> Unit
) {
    val evenOdd = EvenOdd()

    Text(
        text = "Clicks = $countValue is ${evenOdd.check(countValue)}",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )
}