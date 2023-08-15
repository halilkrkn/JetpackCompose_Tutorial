package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.screens.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.AuthScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util.Graph.HOME
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.HOME_ROUTE
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.Screens

@Composable
fun LoginScreen(
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
                    navController.popBackStack()
                    navController.navigate(HOME)
                },
            text = "Login",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = Modifier
                .padding(top = 75.dp)
                .clickable {
                    navController.navigate(AuthScreen.SignUp.route)
                },
            text = "Sign Up",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Medium
        )

        Text(
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    navController.navigate(AuthScreen.Forgot.route)
                },
            text = "Forgot Password",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}