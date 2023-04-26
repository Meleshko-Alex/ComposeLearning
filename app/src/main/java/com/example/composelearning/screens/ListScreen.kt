package com.example.composelearning.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.composelearning.R

@Composable
fun ListScreen(list: List<String>) {
    if (list.isEmpty()) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Text(
                text = stringResource(id = R.string.empty_string),
                fontSize = 30.sp
            )
        }
    } else {
        Column {
            for (s in list) {
                Text(text = s)
            }
        }
    }
}