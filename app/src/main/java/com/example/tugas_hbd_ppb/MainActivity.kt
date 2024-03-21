package com.example.tugas_hbd_ppb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_hbd_ppb.ui.theme.TugashbdppbTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugashbdppbTheme {
                HBD("Subejo")
            }
        }
    }
}

@Composable
fun HBD(name: String) {
    Image(painter = painterResource(id = R.drawable.bg),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
       Column(
           modifier = Modifier.padding(5.dp),
           horizontalAlignment = Alignment.End
       ) {
           Text(
               text = "Happy Birthday $name!",
               fontSize = 55.sp,
               fontWeight = FontWeight.Bold,
               textAlign = TextAlign.Center,
               letterSpacing = 10.sp,
               lineHeight = 75.sp,
               color = Color.DarkGray,
               fontFamily = FontFamily.Monospace
           )
           Spacer(modifier = Modifier.height(25.dp))
           Text(text = "*From Mael",
                textAlign = TextAlign.Center,
                fontSize = 45.sp)
       } 
    }
}