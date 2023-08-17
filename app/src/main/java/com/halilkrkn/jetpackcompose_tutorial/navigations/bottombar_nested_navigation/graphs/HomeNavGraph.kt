package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.details.InformationScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.home.HomeScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.home.MainScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.HomeScreen


fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController,
) {
    navigation(
        startDestination = HomeScreen.Home.route,
        route = Graph.HOME
    ) {
        composable(
            route = HomeScreen.Home.route
        ) {
            MainScreen()
        }
    }
}