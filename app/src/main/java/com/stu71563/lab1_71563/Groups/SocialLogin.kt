package com.stu71563.lab1_71563.Groups

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.stu71563.lab1_71563.Components.SocialButton
import com.stu71563.lab1_71563.Constants.Constants.StrokeDark
import com.stu71563.lab1_71563.Constants.Constants.StrokeWhite
import com.stu71563.lab1_71563.R

@Composable
fun SocialLogin(backGroundColor: Color, strokeColor: Color, fontColor: Color){

    Text(
        text = "Or Continue with",
        color = fontColor)
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,


    ) {
        val googleLogo = painterResource(id = R.drawable.google__g__logo_svg)
        val appleLogo: Painter

        if (strokeColor == StrokeWhite){
            appleLogo = painterResource(id = R.drawable.apple_black_logo_png_transparent)
        }else {
            appleLogo = painterResource(id = R.drawable.apple_logo_grey_svg)
        }

        SocialButton(backGroundColor = backGroundColor, strokeColor = strokeColor, image = googleLogo)
        Spacer(modifier = Modifier.padding(12.dp))
        SocialButton(backGroundColor = backGroundColor, strokeColor = strokeColor, image = appleLogo)

    }
    Row {
        Text(
            text = "Not a member? ",
            color = fontColor
        )
        Text(
            text = "Register now",
            color = fontColor,
            fontWeight = FontWeight.Bold
        )
    }
    Spacer(modifier = Modifier.padding(12.dp))

}
