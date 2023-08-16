package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.details.InformationScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.home.MainScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph


@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        authNavGraph(navController = navController)
        homeNavGraph(navController = navController)
    }
}