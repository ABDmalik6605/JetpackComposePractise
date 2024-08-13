package com.example.myapplicationfirst.ui.screens.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationfirst.R
import com.example.myapplicationfirst.ui.components.*
import com.example.myapplicationfirst.ui.theme.MyApplicationFirstTheme

@Composable
fun WelcomeScreen() {
    WelcomeScreenContent()
}

@Composable
private fun WelcomeScreenContent() {
    var buttonText by remember { mutableStateOf("Press Me") }
    var entered by remember { mutableStateOf("") }
    var textFieldValue by remember { mutableStateOf("") }
    var imageValue by remember { mutableStateOf<Int?>(null) } // Start with null

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(top = 20.dp)
    ) {
        CustomText(
            backgroundColor = Color.Black,
            text = "Buttons",
            textColor = Color.Blue,
            fontSize = 36.sp,
            modifier = Modifier.padding(2.dp).fillMaxWidth()
        )

        CustomButton(
            backgroundColor = Color.Red,
            text = buttonText,
            textColor = Color.Black
        ) {
            buttonText = "KAMEHAMEHA"
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(top = 20.dp)
                .align(Alignment.CenterHorizontally),
        ) {
            CustomTextField(
                backgroundColor = Color.LightGray,
                text = "",
                placeholder = "Enter text",
                textColor = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(0.dp)
                    .fillMaxWidth(1f),
                alignment = Alignment.CenterHorizontally,
            ) {
                textFieldValue = it
            }
        }

        CustomButton(
            backgroundColor = Color.Green,
            text = "Submit",
            textColor = Color.Black
        ) {
            entered = textFieldValue
            imageValue = R.drawable.img
        }

        CustomText(
            backgroundColor = Color.Black,
            text = entered,
            textColor = Color.Blue,
            fontSize = 36.sp,
            modifier = Modifier.padding(2.dp).fillMaxWidth()
        )

        imageValue?.let {
            CustomImage(
                width = 450.dp,
                height = 150.dp,
                imagePath = it,
                contentScale = ContentScale.Fit
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            items(5) { index ->
                CustomText(
                    backgroundColor = Color.Magenta,
                    text = "Item ${index+1}",
                    textColor = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier.padding(vertical = 4.dp).fillMaxWidth()
                )
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            items(11) { index ->
                CustomText(
                    backgroundColor = Color.DarkGray,
                    text = "Grid Item ${index+1}",
                    textColor = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {
            items(6) { index ->
                CustomText(
                    backgroundColor = when (index) {
                        0 -> Color.Red
                        1 -> Color.Green
                        2 -> Color.Blue
                        3 -> Color.Black
                        4 -> Color.Gray
                        5 -> Color.Magenta
                        else -> Color.LightGray
                    },
                    text = "Staggered Item ${index + 1}",
                    textColor = Color.White,
                    fontSize = when (index) {
                        0 -> 20.sp
                        1 -> 16.sp
                        2 -> 18.sp
                        3 -> 22.sp
                        4 -> 14.sp
                        5 -> 24.sp
                        else -> 16.sp
                    },
                    modifier = Modifier
                        .padding(4.dp)
                        .height(when (index) {
                            0 -> 100.dp
                            1 -> 120.dp
                            2 -> 80.dp
                            3 -> 150.dp
                            4 -> 90.dp
                            5 -> 130.dp
                            else -> 100.dp
                        })
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewWelcomeScreenContent() {
    MyApplicationFirstTheme {
        WelcomeScreenContent()
    }
}
