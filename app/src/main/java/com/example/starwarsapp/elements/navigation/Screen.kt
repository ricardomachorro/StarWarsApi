package com.example.starwarsapp.elements.navigation

sealed class Screen(val route:String) {

    object Main:Screen("main_screen")
    object Creature:Screen ("creatures_screen")
    object Character:Screen("character_screen")
    object Droid:Screen("droid_screen")
    object Location:Screen("location_screen")
    object Organization:Screen("organization_screen")
    object Species:Screen("species_screen")
    object Vehicle:Screen("vehicle_screen")

}