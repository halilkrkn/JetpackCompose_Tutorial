package com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.util

sealed class Screen(val route: String) {
    object Home: Screen("home_screen")
    object Details: Screen(route = "details_screen")



}
