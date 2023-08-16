package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util

sealed class UserProfileScreen(val route: String) {
    object UserUserProfile: UserProfileScreen("USER_PROFILE")
    object FAVOURITE: UserProfileScreen("FAVOURITE")
}
