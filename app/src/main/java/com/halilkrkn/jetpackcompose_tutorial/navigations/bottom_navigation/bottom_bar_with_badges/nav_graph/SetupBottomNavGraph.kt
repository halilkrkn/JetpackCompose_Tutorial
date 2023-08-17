package com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.BottomBarScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.screens.ChatScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.screens.MessageScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.screens.NotificationScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.util.Screen

@Composable
fun SetupBottomNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Chat.route
    ) {
        composable(route = Screen.Chat.route) {
            ChatScreen()
        }

        composable(route = Screen.Message.route) {
            MessageScreen()
        }

        composable(route = Screen.Notification.route) {
            NotificationScreen()
        }
    }

}