package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeView()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Magenta.copy(alpha = 0.3f)), contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $name!",
            color = Color.Black,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        HomeView()
    }
}

@Composable
fun HomeView(){

    val modifier = Modifier
        .clip(
            RoundedCornerShape(4.dp)
        )
        .background(Color.Blue)
        .clickable { }
        .padding(5.dp)
        .fillMaxWidth()

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(5.dp)) {
        Column {
            Card(name = "name", description = "description", image = painterResource(id = R.drawable.avatar),
                modifier)
            Card(name = "tesst23", description = "description", image = painterResource(id = R.drawable.avatar),
                modifier)
            Card(name = "tesst1", description = "description", image = painterResource(id = R.drawable.avatar),
                modifier)
        }

    }
}