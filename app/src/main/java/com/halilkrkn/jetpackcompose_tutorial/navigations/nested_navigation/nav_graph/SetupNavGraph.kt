package com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.HOME_ROUTE
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.ROOT_ROUTE

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}

