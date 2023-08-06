package com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.screen.HomeScreen
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.screen.WelcomeScreen
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.util.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            route = Screen.Welcome.route
        ){
            WelcomeScreen(navController = navController)
        }

        composable(
            route = Screen.Home.route
        ) {
            HomeScreen()
        }
    }

}