package com.example.myapplicationfirst.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationfirst.ui.theme.MyApplicationFirstTheme

@Composable
fun CustomText(
    backgroundColor: Color,
    text: String,
    textColor: Color,
    fontSize: TextUnit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = fontSize
        )
    }
}

@Preview
@Composable
fun PreviewCustomText() {
    MyApplicationFirstTheme {
        CustomText(
            backgroundColor = Color.Green,
            text = "Buttons",
            textColor = Color.Black ,
            fontSize = 26.sp,
            modifier = Modifier.padding(2.dp).fillMaxWidth(0.7f)
        )
    }
}