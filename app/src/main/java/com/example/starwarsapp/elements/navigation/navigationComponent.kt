package com.example.starwarsapp.elements.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.starwarsapp.elements.screens.MainScreen


@Composable
fun navigationComponent(){

    val navController = rememberNavController()

    NavHost(navController= navController, startDestination = Screen.Main) {

        composable(Screen.Main.route) {
            MainScreen(navController)
        }

        composable(Screen.Character.route)
        {

        }

        composable(Screen.Droid.route) {

        }

        composable(Screen.Species.route) {

        }

        composable(Screen.Vehicle.route) {

        }

        composable(Screen.Location.route) {

        }

        composable(Screen.Organization.route) {

        }

        composable(Screen.Creature.route) {

        }

    }

}