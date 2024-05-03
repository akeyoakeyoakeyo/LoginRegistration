package com.rebiro.myfirstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rebiro.myfirstapplication.ui.theme.MyfirstapplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyfirstapplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    // Greeting("Android")
                    Home()

                }
            }
        }
    }
}

@Composable
fun Home() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text(text = "Rebiro's App",
            color = Color.Cyan,
            fontSize = 28.sp,
            fontFamily = FontFamily.Cursive)
        Image(painter = painterResource(id = R.drawable.cat1) ,
            contentDescription = "wallpaper" )

        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Welcome to my Android App", color = Color.Magenta, fontSize = 24.sp, fontFamily = FontFamily.Cursive)
        Image(painter = painterResource(id = R.drawable.cat2), contentDescription = "ginger")


    }


}

    @Preview
    @Composable
    private fun Homeprev() {
        Home()
    }


