package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.details.InformationScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.details.OverviewScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.DetailsScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.HomeScreen

fun NavGraphBuilder.detailsNavGraph(
    navController: NavHostController,
) {
    navigation(
        startDestination = DetailsScreen.Information.route,
        route = Graph.DETAILS
    ) {
        composable(
            route = DetailsScreen.Information.route
        ) {
            InformationScreen(navController = navController)
        }

        composable(
            route = DetailsScreen.Overview.route
        ) {
            OverviewScreen(navController = navController)
        }
    }
}