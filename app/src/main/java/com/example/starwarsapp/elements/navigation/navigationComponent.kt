package com.example.starwarsapp.elements.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun navigationComponent(){

    val navController = rememberNavController()

    NavHost(navController= navController, startDestination = Screen.Main) {

        composable(Screen.Main.route) {
            //Main screen
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