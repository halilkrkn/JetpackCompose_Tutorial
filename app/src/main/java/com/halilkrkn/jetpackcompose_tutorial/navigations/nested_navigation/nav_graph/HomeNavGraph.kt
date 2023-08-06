package com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.DETAIL_ARGUMENT_ID
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.DETAIL_ARGUMENT_NAME
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.HOME_ROUTE
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.Screens
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.screens.FavouriteScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.screens.HomeScreen


fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController,
) {
    navigation(
        startDestination = Screens.HomeScreen.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screens.HomeScreen.route
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screens.FavouriteScreen.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_ID) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_NAME) {
                    type = NavType.StringType
                }
            )
        ) {
            FavouriteScreen(navController = navController)
        }
    }


}