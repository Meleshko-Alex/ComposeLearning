package com.example.composelearning.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun StateScreen(
    count: State<Int>,
    onCounterClick: () -> Unit,
    checked: State<Boolean>,
    onCheckedChange: (Boolean) -> Unit
) {

    Column {
        Text(
            text = "Count = ${count.value}",
            modifier = Modifier.clickable(onClick = onCounterClick)
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = checked.value, onCheckedChange = onCheckedChange)
            Text(
                text = "Some checkbox text",
                fontSize = 18.sp,
                modifier = Modifier.clickable(onClick = {onCheckedChange(!checked.value)})
            )
        }
    }
}