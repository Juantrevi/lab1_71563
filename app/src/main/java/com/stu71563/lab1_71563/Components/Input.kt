package com.stu71563.lab1_71563.Components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Input(backGroundColor: Color, strokeColor: Color, textColor: Color, text: String){

    TextField(
        value = text,
        onValueChange = {},

        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = backGroundColor,
            unfocusedTextColor = textColor),

        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(6.dp))
            .border(2.dp, strokeColor, RoundedCornerShape(6.dp))
            .height(60.dp)
    )
}