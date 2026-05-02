package com.example.starwarsapp.elements.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.starwarsapp.elements.screens.MainScreen


@Composable
fun NavigationComponent(navController : NavHostController){

    NavHost(navController= navController, startDestination = Screen.Main) {

        composable(Screen.Main.route) {
            MainScreen()
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