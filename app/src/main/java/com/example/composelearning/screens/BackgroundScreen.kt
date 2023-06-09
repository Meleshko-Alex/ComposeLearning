package com.example.composelearning.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BackgroundScreen() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .width(160.dp)
                .height(120.dp)
                .background(color = Color.Cyan, shape = RoundedCornerShape(16.dp))
        )

        Box(
            modifier = Modifier
                .width(160.dp)
                .height(120.dp)
                .align(Alignment.BottomCenter)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Yellow,
                            Color.Green
                        )
                    ),
                    shape = RoundedCornerShape(16.dp),
                    alpha = .6f
                )
        )
        Box(modifier = Modifier
            .width(160.dp).height(120.dp)
            .align(Alignment.TopCenter)
            .border(width = 2.dp, color = Color.Green, shape = RoundedCornerShape(16.dp))
        )
    }
}

@Preview
@Composable
fun BackgroundScreenPreview() {
    BackgroundScreen()
}