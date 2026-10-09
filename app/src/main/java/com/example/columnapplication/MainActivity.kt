package com.example.columnapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.columnapplication.ui.theme.ColumnApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            app()
        }
    }
}

@Preview
@Composable
fun app() {
    var counter by rememberSaveable { mutableStateOf(0)}
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {
        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.gato),
                contentDescription = "Es un gato"
            )
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_favorite),
                    contentDescription = "Like",
                    modifier = Modifier.clickable{ counter++ }
                )
                Text(text = counter.toString(), color = Color.White, modifier = Modifier.padding(start = 14.dp))
            }
            Text(
                text = "Karina LB",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "TIID 4-2", color = Color.White)
            Text(text = "Hola!!", color = Color.White)
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                item {
                    Text(text = "C++", color = Color.White)
                    Text(text = "Kotlin", color = Color.White)
                    Text(text = "Java", color = Color.White)
                    Text(text = "Gato", color = Color.White)
                    Text(text = "Cat", color = Color.White)
                    Text(text = "Gato", color = Color.White)
                    Text(text = "Cat", color = Color.White)
                    Text(text = "Gato", color = Color.White)
                    Text(text = "Cat", color = Color.White)
                    Text(text = "Gato", color = Color.White)
                    Text(text = "Cat", color = Color.White)
                    Text(text = "Gato", color = Color.White)
                    Text(text = "Cat", color = Color.White)
                    Text(text = "Gato", color = Color.White)
                    Text(text = "Hola!", color = Color.White)
                }
            }
        }
    }
}