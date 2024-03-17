package com.stu71563.lab1_71563

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stu71563.lab1_71563.Login.BSignUp
import com.stu71563.lab1_71563.Login.bLogin
import com.stu71563.lab1_71563.Login.gLogin
import com.stu71563.lab1_71563.Login.gSignUp
import com.stu71563.lab1_71563.ui.theme.Lab1_71563Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1_71563Theme {
                gLogin(isDark = false)
                //bLogin(isDark = true)
                //gSignUp(isDark = false)
                //BSignUp(isDark = true)

            }
        }
    }
}
