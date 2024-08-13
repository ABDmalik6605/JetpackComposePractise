package com.example.myapplicationfirst.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplicationfirst.ui.theme.MyApplicationFirstTheme



@Composable
fun CustomButton(
    backgroundColor: Color,
    text: String,
    textColor: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor
        )
    ) {
        Text(
            text = text,
            color = textColor,
        )
    }
}

@Preview
@Composable
fun PreviewCustomButton() {
    MyApplicationFirstTheme {
        CustomButton(
            backgroundColor = Color.Red,
            text = "Press Me",
            textColor = Color.Black,
            modifier = Modifier.padding(8.dp),
        ) {
            print("I am clicked")
        }
    }
}