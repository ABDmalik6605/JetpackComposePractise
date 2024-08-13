package com.example.myapplicationfirst.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.myapplicationfirst.R
import com.example.myapplicationfirst.ui.theme.MyApplicationFirstTheme

@Composable
fun CustomImage(
    width: Dp = 100.dp, // Default width
    height: Dp = 100.dp, // Default height
    imagePath: Int?, // Image resource ID
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit // Change this line to use different content scales
) {
    imagePath?.let { // Only display if imagePath is not null
        Image(
            painter = painterResource(id = it),
            contentDescription = null,
            contentScale = contentScale,
            modifier = modifier
                .width(width)
                .height(height)
        )
    }
}

@Preview
@Composable
fun PreviewCustomImage() {
    MyApplicationFirstTheme {
        CustomImage(
            width = 200.dp,
            height = 100.dp,
            imagePath = R.drawable.img,
            contentScale = ContentScale.Fit // Change this to FillBounds if needed
        )
    }
}
