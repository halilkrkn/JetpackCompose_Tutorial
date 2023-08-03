package com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.AUTHENTICATION_ROUTE
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.Screens
import com.halilkrkn.jetpackcompose_tutorial.navigations.screens.LoginScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screens.LoginScreen.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(
            route = Screens.LoginScreen.route
        ) {
            LoginScreen(navController = navController)
        }

        composable(
            route = Screens.SignUpScreen.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}