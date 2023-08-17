package com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.nav_graph.SetupBottomNavGraph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.util.BottomNavItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = listOf(
                    BottomNavItem(
                        name = "Chat",
                        route = "chat",
                        icon = Icons.Default.Call
                    ),
                    BottomNavItem(
                        name = "Message",
                        route = "message",
                        icon = Icons.Default.Email,
                        badgeCount = 20
                    ),
                    BottomNavItem(
                        name = "Notification",
                        route = "notification",
                        icon = Icons.Default.Notifications,
                        badgeCount = 500
                    ),
                ),
                navController = navController,
                onItemClick = {bottomNavItem ->
                    navController.navigate(bottomNavItem.route)
                }
            )
        }
    ) {
        SetupBottomNavGraph(navController = navController)
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit,
) {
    val bacStackEntry = navController.currentBackStackEntryAsState()

    NavigationBar(
        modifier = modifier
            .clip(RoundedCornerShape(25.dp)),
        containerColor = Color.Black,
        contentColor = Color.Red,
//        windowInsets = WindowInsets(left = 50.dp, top = 50.dp, right = 50.dp, bottom = 50.dp ),
        tonalElevation = 5.dp
    ) {
        items.forEach { bottomNavItem ->
            val selected = bottomNavItem.route == bacStackEntry.value?.destination?.route
            NavigationBarItem(
                selected = selected, // bottomNavItem.route == navController.currentDestination?.route aynıdır.
                onClick = { onItemClick(bottomNavItem) },
                colors = NavigationBarItemDefaults.colors(
                    unselectedIconColor = Color.Magenta,
                    selectedIconColor = Color.Green
                ),
                icon = {
                    Column(
                        horizontalAlignment = CenterHorizontally
                    ) {
                        if (bottomNavItem.badgeCount > 0) {
                            BadgedBox(
                                badge = {
                                    Text(
                                        text = bottomNavItem.badgeCount.toString(),
                                        style = TextStyle(
                                            fontSize = MaterialTheme.typography.bodyLarge.fontSize
                                        )
                                    )
                                }
                            ) {
                                Icon(
                                    imageVector = bottomNavItem.icon,
                                    contentDescription = bottomNavItem.name
                                )
                            }
                        } else {
                            Icon(
                                imageVector = bottomNavItem.icon,
                                contentDescription = bottomNavItem.name
                            )
                        }
                        if (selected) {
                            Text(
                                text = bottomNavItem.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            )
        }
    }
}

