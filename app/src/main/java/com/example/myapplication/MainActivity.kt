package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Business_card(

                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun Business_card(modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxSize().background(color = Color(0xFFD2E8D4)), verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
            painter = painterResource(R.drawable.android_studio_logo_2023_51ae),
            contentDescription = null,
            modifier = Modifier
                .size(size=120.dp)
                ,
        )


        Text(
            text ="George Raief",
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(5.dp)
                , fontWeight = FontWeight.Bold,
            color = Color(0xFF000000)
        )
        Text(
            text="Android Developer"
            ,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF006837),
            fontWeight = FontWeight.Bold
            ,    modifier = Modifier
                .padding(5.dp)
                .align(alignment = Alignment.CenterHorizontally)

        )
        Spacer(modifier = Modifier.padding(bottom = 300.dp))
        Column {
            Row(modifier = Modifier.padding(bottom = 20.dp)) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null,
                    tint = Color(0xFF006837),
                    modifier = Modifier.padding(end = 8.dp)

                )
                Text(
                    text = "+201027445506",
                    color = Color(0xFF000000)

                )
            }
            Row(modifier = Modifier.padding(bottom = 20.dp)) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    tint = Color(0xFF006837),
                    modifier = Modifier.padding(end = 8.dp)

                )
                Text(
                    text = "george.raief@gmail.com",
                    color = Color(0xFF000000)

                )
            }
            Row(modifier = Modifier) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = Color(0xFF006837),
                    modifier = Modifier.padding(end = 8.dp)

                )
                Text(
                    text = "Fayoum, Egypt",
                    color = Color(0xFF000000)

                )
            }
        }
    }
}
@Preview( showBackground = true, showSystemUi = true)
@Composable
fun Business_cardPreview() {
    MyApplicationTheme {
       Business_card()
    }
}


