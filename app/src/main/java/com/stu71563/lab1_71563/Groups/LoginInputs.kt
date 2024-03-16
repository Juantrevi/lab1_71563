package com.stu71563.lab1_71563.Groups

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.stu71563.lab1_71563.Components.Button
import com.stu71563.lab1_71563.Components.Input
import com.stu71563.lab1_71563.Constants.Constants.Login

@Composable
fun LoginInputs(backGroundColor: Color, strokeColor: Color, fontColor: Color, message: String){



    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = message,
            color = fontColor,
            modifier = Modifier
                .padding(bottom = 20.dp)
        )

        Input(backGroundColor = backGroundColor, strokeColor = strokeColor, textColor = fontColor, text = "Email")
        Spacer(modifier = Modifier.padding(4.dp))
        Input(backGroundColor = backGroundColor, strokeColor = strokeColor, textColor = fontColor, text = "Password")

        Text(
            text = "Forgot Password?",
            color = fontColor,
            fontWeight = FontWeight(600),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            textAlign = TextAlign.End)
        Spacer(modifier = Modifier.padding(10.dp))
        Button(backGroundColor = backGroundColor, strokeColor = strokeColor, textColor = fontColor, text = Login)

    }
}
