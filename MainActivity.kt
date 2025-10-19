package com.filemind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FileMindApp()
        }
    }
}

@Composable
fun FileMindApp() {
    var moved by remember { mutableStateOf(false) }
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text("File Mind", style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(20.dp))
            Button(onClick = { moved = !moved }) {
                Text("Simulate File Move")
            }
            if (moved) {
                Text("File moved successfully ✅", Modifier.padding(16.dp))
            }
        }
    }
}
