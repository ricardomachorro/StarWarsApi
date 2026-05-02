package com.example.starwarsapp.elements.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.tooling.ComposeToolingApi
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.starwarsapp.elements.navigation.NavigationComponent


@Composable
fun AppComponent(){

    val navController = rememberNavController()
    Scaffold(
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                NavigationComponent(navController)
            }
        }
    )

}