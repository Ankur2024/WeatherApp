package com.example.weatherapp.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import com.example.weatherapp.data.remote.WeatherDataDto

@Composable
fun WeatherDataDisplay(
    value: Int,
    unit: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(),
    iconTint: Color = Color.White,
    textColor: Color = Color.White
){
    Row (
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
    ){

    }
}