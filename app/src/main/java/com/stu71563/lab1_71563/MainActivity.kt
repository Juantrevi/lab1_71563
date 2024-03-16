package com.stu71563.lab1_71563

//import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stu71563.lab1_71563.Components.Input
import com.stu71563.lab1_71563.Components.SocialButton
import com.stu71563.lab1_71563.Constants.Constants.LightGrey
import com.stu71563.lab1_71563.Constants.Constants.Login
import com.stu71563.lab1_71563.Constants.Constants.WelcomeBack
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
