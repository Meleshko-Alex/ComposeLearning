package com.example.composelearning.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Text(
        text = "Home Screen",
        fontSize = 32.sp,
        color = Color.Green
    )
    //Text("123456789")
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}