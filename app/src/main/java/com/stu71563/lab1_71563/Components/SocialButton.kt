package com.stu71563.lab1_71563.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun SocialButton(backGroundColor: Color, strokeColor: Color, image: Painter) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(backGroundColor, shape = RoundedCornerShape(10.dp))

            .border(2.dp, strokeColor, RoundedCornerShape(10.dp))
            .padding(5.dp)
    ) {
        Image(
            painter = image,
            contentDescription = "Social Login Button",
            modifier = Modifier
                .size(40.dp)
                .align(Alignment.Center)
        )
    }
}

