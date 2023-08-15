package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.profile

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.UserProfileScreen

@Composable
fun UserProfileScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .clickable {
//                    navController.popBackStack()
                    navController.navigate(UserProfileScreen.FAVOURITE.route)
                },
            text = "User Screen",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}