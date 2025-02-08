package com.example.moblile_bootcamp_practise_010225

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moblile_bootcamp_practise_010225.ui.theme.Moblile_bootcamp_practise_010225Theme
import com.example.moblile_bootcamp_practise_010225.ui.theme.assets.SampleData

class MainActivity : ComponentActivity() {
    val API = BuildConfig.MAPS_API //Secrets gradle plugin usage example
    val days = SampleData.dayWeatherSample // Sample values usage example
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Moblile_bootcamp_practise_010225Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (modifier = Modifier.fillMaxSize()){
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Button(onClick = {}) {
            Text(
                text = "Button"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Moblile_bootcamp_practise_010225Theme {
        Greeting("Android")
    }
}