package com.halilkrkn.jetpackcompose_tutorial.splash_screen

sealed class Screen(val route: String) {

    object SplashScreen: Screen("splash_screen")
    object HomeScreen: Screen("home_screen")


}