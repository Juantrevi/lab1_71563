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
import com.stu71563.lab1_71563.Constants.Constants.FontBlack
import com.stu71563.lab1_71563.Constants.Constants.FontWhite
import com.stu71563.lab1_71563.Constants.Constants.LightBlack
import com.stu71563.lab1_71563.Constants.Constants.LightGrey
import com.stu71563.lab1_71563.Constants.Constants.StrokeDark
import com.stu71563.lab1_71563.Constants.Constants.StrokeWhite
import com.stu71563.lab1_71563.Constants.Constants.WelcomeBack
import com.stu71563.lab1_71563.Constants.Constants.White
import com.stu71563.lab1_71563.Groups.LoginInputs
import com.stu71563.lab1_71563.Groups.Logo
import com.stu71563.lab1_71563.Groups.SocialLogin

@Composable
fun bLogin(isDark: Boolean){
    val backgroundColour: Color
    val strokeColor: Color
    val fontColor: Color
    val inputColor: Color

    if (isDark){
        backgroundColour = Black
        strokeColor = StrokeDark
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
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(36.dp)
        )
        {
            Spacer(modifier = Modifier.padding(50.dp))
            Logo()
            LoginInputs(backGroundColor = inputColor, strokeColor = strokeColor, fontColor = fontColor, message = WelcomeBack)
            SocialLogin(backGroundColor = inputColor, strokeColor = strokeColor, fontColor = fontColor)


        }
    }
}