package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util

sealed class HomeScreen(val route: String) {
    object Home: HomeScreen("HOME")
}