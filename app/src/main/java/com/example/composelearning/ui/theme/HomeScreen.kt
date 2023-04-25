package com.example.composelearning.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()
    ) {
        Text(text = "Title", fontSize = 32.sp)
        Text(
            text = "Description",
            fontSize = 20.sp,
            modifier = Modifier.align(Start)
        )
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Name", fontSize = 20.sp)
        Spacer(modifier = Modifier.width(8.dp))
        //Spacer(modifier = Modifier.weight(1f))
        Text(text = "Surname", fontSize = 20.sp)
    }
    Box(modifier = Modifier.padding(20.dp)) {
        Text(text = "N", fontSize = 48.sp)
        Text(text = "ame",
        modifier = Modifier.align(BottomCenter))
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun Text() {
    Text(
        text = "Home Screen",
        fontSize = 32.sp,
        color = Color.Green,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}