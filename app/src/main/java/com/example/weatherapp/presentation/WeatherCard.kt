package com.example.weatherapp.presentation

import android.os.Build
import android.widget.Space
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun WeatherCard(
    state: WeatherState,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Card(
        colors = CardDefaults.cardColors(backgroundColor),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        state.weatherInfo?.currentWeatherData?.let { data->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Today ${data.time.format
                    (DateTimeFormatter.ofPattern("HH:mm")
                            )
                }",
                    modifier = Modifier.align(Alignment.End),
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(painter = painterResource(id = data.weatherType.iconRes),
                    contentDescription = "weather icons",
                    modifier = Modifier.width(200.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "${data.temperatureCelsius}°C",
                    fontSize = 50.sp,
                    color = Color.White
                )
                Spacer(modifier = modifier.height(16.dp))
                Text(text = data.weatherType.weatherDesc,
                    fontSize = 20.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(32.dp))
            }
        }

    }
}