package com.example.composeapp

import android.app.ActivityManager.TaskDescription
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Card(name: String, description: String, image: Painter, modifier: Modifier = Modifier) {
    Row (verticalAlignment = Alignment.CenterVertically, modifier = modifier){
        Image(painter = image, contentDescription = "avatar", modifier = Modifier.size(40.dp).clip(CircleShape))
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = name, color = Color.White)
            Text(text = description, color = Color.White)
        }
    }
}