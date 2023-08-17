package com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.util

sealed class Screen(val route: String) {
    object Chat: Screen("chat")
    object Message: Screen("message")
    object Notification: Screen("notification")
}
