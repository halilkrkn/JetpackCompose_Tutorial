package com.halilkrkn.jetpackcompose_tutorial.splash_screen.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.halilkrkn.jetpackcompose_tutorial.splash_screen.AnimatedSplashScreen
import com.halilkrkn.jetpackcompose_tutorial.splash_screen.HomeScreen
import com.halilkrkn.jetpackcompose_tutorial.splash_screen.Screen

@Composable
fun SplashNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(
            route = Screen.SplashScreen.route
        ) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController = navController)
        }
    }

}