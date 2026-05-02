package com.example.starwarsapp.elements.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
            Text(
                text= "Star Wars App",
                fontSize = 30.sp)
    }

}


@Preview
@Composable
fun TestMainScreen(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ){
        MainScreen()
    }

}