package com.stu71563.lab1_71563.Login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.stu71563.lab1_71563.Constants.Constants.Black
import com.stu71563.lab1_71563.Constants.Constants.CreateAccount
import com.stu71563.lab1_71563.Constants.Constants.FontBlack
import com.stu71563.lab1_71563.Constants.Constants.FontWhite
import com.stu71563.lab1_71563.Constants.Constants.LightBlack
import com.stu71563.lab1_71563.Constants.Constants.LightGrey
import com.stu71563.lab1_71563.Constants.Constants.StrokeWhite
import com.stu71563.lab1_71563.Constants.Constants.White
import com.stu71563.lab1_71563.Groups.Logo
import com.stu71563.lab1_71563.Groups.SignUpInputs

@Composable
fun gSignUp(isDark: Boolean){

    val backgroundColour: Color
    val strokeColor: Color
    val fontColor: Color
    val inputColor: Color

    if (isDark){
        backgroundColour = Black
        strokeColor = StrokeWhite
        fontColor = FontWhite
        inputColor = LightBlack
    } else {
        backgroundColour = LightGrey
        strokeColor = StrokeWhite
        fontColor = FontBlack
        inputColor = White
    }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = backgroundColour)
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(36.dp)
        )
        {
            Spacer(modifier = Modifier.padding(8.dp))
            Logo()
            SignUpInputs(backGroundColor = inputColor, strokeColor = strokeColor, fontColor = fontColor, message = CreateAccount)

        }
    }
}