package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.auth.ForgotScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.auth.LoginScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.auth.SignUpScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.AuthScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph.AUTHENTICATION


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = AuthScreen.Login.route,
        route = AUTHENTICATION
    ) {
        composable(
            route = AuthScreen.Login.route
        ) {
            LoginScreen(navController = navController)
        }

        composable(
            route = AuthScreen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }

        composable(
            route = AuthScreen.Forgot.route
        ) {
            ForgotScreen(navController = navController)
        }
    }
}