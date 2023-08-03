package com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.halilkrkn.jetpackcompose_tutorial.components.Screen
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.AUTHENTICATION_ROUTE
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.Screens

@Composable
fun HomeScreen(
    navController: NavController,
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .clickable {
                    val route = Screens.FavouriteScreen.passNameAndId(
                        id = 11,
                        name = "Helloooğğğğ"
                    )
                    navController.navigate(route = route)
                    },
            text = "Home",
            color = MaterialTheme.colorScheme.secondary,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )


        Text(
            modifier = Modifier
                .padding(top= 150.dp)
                .clickable {
                    navController.navigate(AUTHENTICATION_ROUTE)
                },
            text = "Login/Sign UP",
            color = MaterialTheme.colorScheme.secondary,
            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
            fontWeight = FontWeight.Medium
        )


    }
}
