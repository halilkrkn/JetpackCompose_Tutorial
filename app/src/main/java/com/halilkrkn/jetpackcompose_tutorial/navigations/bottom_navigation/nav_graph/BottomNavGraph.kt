package com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.BottomBarScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.screens.OrderScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.screens.ProfileScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.screens.SettingsScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.ProfileScreen.route
    ) {
        composable(route = BottomBarScreen.OrderScreen.route){
            OrderScreen()
        }

        composable(route = BottomBarScreen.ProfileScreen.route){
            ProfileScreen()
        }

        composable(route = BottomBarScreen.SettingsScreen.route){
            SettingsScreen()
        }



    }
    
}