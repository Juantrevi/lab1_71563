package com.stu71563.lab1_71563.Groups

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.stu71563.lab1_71563.R

@Composable
fun Logo(){

    val logo = painterResource(id = R.drawable.lock_open_512)

    Image(
        modifier = Modifier.size(100.dp),
        painter = logo, contentDescription = "Logo of the App")

}