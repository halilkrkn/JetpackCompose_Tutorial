package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {

    object HomeScreen : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Check
    )

    object ProfileScreen : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object SettingsScreen : BottomBarScreen(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )

}
