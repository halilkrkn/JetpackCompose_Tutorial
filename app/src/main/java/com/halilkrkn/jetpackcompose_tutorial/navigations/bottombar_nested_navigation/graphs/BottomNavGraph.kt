package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.home.HomeScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.home.ProfileScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.home.SettingsScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.BottomBarScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph.DETAILS

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.HomeScreen.route,
        route = Graph.HOME
    ) {
        composable(route = BottomBarScreen.HomeScreen.route){
            HomeScreen(
                navController = navController
            )
        }
        composable(route = BottomBarScreen.ProfileScreen.route){
            ProfileScreen(navController = navController)
        }

        composable(route = BottomBarScreen.SettingsScreen.route){
            SettingsScreen()
        }
        detailsNavGraph(navController = navController)
        profileNavGraph(navController = navController)
    }
}