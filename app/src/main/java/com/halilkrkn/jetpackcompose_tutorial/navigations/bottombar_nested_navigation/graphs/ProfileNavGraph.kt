package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.profile.FavouriteScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.profile.UserProfileScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.UserProfileScreen


fun NavGraphBuilder.profileNavGraph(
    navController: NavHostController,
) {
    navigation(
        startDestination = UserProfileScreen.UserUserProfile.route,
        route = Graph.USER_PROFILE
    ) {
        composable(
            route = UserProfileScreen.UserUserProfile.route
        ) {
            UserProfileScreen(navController = navController)
        }

        composable(
            route = UserProfileScreen.FAVOURITE.route
        ) {
            FavouriteScreen(navController = navController)
        }
    }
}