package com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.util

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int = 0
)
