package com.stu71563.lab1_71563.Components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Button(backGroundColor: Color, strokeColor: Color, textColor: Color, text: String){


    androidx.compose.material3.Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(backGroundColor),

        modifier = Modifier
            .fillMaxWidth()
            .size(70.dp)
            .border(2.dp, strokeColor, shape = RoundedCornerShape(6.dp)),

        shape = RoundedCornerShape(6.dp),
    ) {
        Text(
            text = text,
            color = textColor,
            fontWeight = FontWeight.ExtraBold
        )
    }
}