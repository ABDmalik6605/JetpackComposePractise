package com.example.myapplicationfirst.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationfirst.ui.theme.MyApplicationFirstTheme

//@Composable
//fun CustomTextField(
//    backgroundColor: Color,
//    text: String,
//    textColor: Color,
//    fontSize: TextUnit,
//    modifier: Modifier = Modifier,
//    alignment: Alignment.Horizontal = Alignment.CenterHorizontally, // Added alignment parameter
//    onValueChange: (String) -> Unit
//) {
//    var textState by remember { mutableStateOf(text) }
//
//    Column(
//        modifier = modifier
//            .background(backgroundColor)
//            .fillMaxWidth(),
//        horizontalAlignment = alignment // Applying alignment here
//    ) {
//        OutlinedTextField(
//            value = textState,
//            onValueChange = { newText ->
//                textState = newText
//                onValueChange(newText) // Notify the parent composable of the text change
//            },
//            modifier = Modifier
//                .fillMaxWidth(0.9f) // Adjusted for alignment within Column
//                .padding(8.dp),
//            textStyle = androidx.compose.ui.text.TextStyle(
//                color = textColor,
//                fontSize = fontSize,
//                textAlign = when (alignment) {
//                    Alignment.Start -> TextAlign.Start
//                    Alignment.End -> TextAlign.End
//                    else -> TextAlign.Center
//                } // Set text alignment based on parameter
//            )
//        )
//    }
//}

@Composable
fun CustomTextField(
    backgroundColor: Color,
    text: String,
    placeholder: String, // Added placeholder parameter
    textColor: Color,
    fontSize: TextUnit,
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    onValueChange: (String) -> Unit
) {
    var textState by remember { mutableStateOf(text) }

    Column(
        modifier = modifier
            .background(backgroundColor)
            .fillMaxWidth(),
        horizontalAlignment = alignment
    ) {
        OutlinedTextField(
            value = textState,
            onValueChange = { newText ->
                textState = newText
                onValueChange(newText)
            },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(8.dp),
            textStyle = androidx.compose.ui.text.TextStyle(
                color = textColor,
                fontSize = fontSize,
                textAlign = when (alignment) {
                    Alignment.Start -> TextAlign.Start
                    Alignment.End -> TextAlign.End
                    else -> TextAlign.Center
                }
            ),
            singleLine = true,
            placeholder = {
                Text(
                    text = placeholder,
                    color = Color.Gray, // Placeholder text color
                    fontSize = fontSize
                )
            }

        )
    }
}


@Preview
@Composable
fun PreviewCustomTextField() {
    MyApplicationFirstTheme {
        CustomTextField(
            backgroundColor = Color.LightGray,
            text = "",
            placeholder = "Enter text", // Placeholder text
            textColor = Color.Black,
            fontSize = 18.sp,
            alignment = Alignment.CenterHorizontally,
            onValueChange = { /* Handle text change */ }
        )
    }
}