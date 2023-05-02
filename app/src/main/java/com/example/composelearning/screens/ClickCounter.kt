package com.example.composelearning.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.composelearning.data.EvenOdd

@Composable
fun ClickCounterScreen(
    isUppercase: Boolean,
    countValue: Int,
    onCounterClick: () -> Unit
) {
    //val evenOdd = remember { EvenOdd() }
    val evenOdd = remember(isUppercase) { EvenOdd(isUppercase) }

    Text(
        text = "Clicks = $countValue is ${evenOdd.check(countValue)}",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )

    Log.d("AAA", "EvenOdd object hash = ${evenOdd.hashCode()}")
}