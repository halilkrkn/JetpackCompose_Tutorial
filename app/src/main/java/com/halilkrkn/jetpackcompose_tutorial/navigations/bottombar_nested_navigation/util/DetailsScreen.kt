package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util

sealed class DetailsScreen(val route: String) {
    object Information: DetailsScreen("INFORMATION")
    object Overview: DetailsScreen("OVERVIEW")
}