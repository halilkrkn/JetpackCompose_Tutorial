package com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.util

sealed class AuthScreen(val route: String) {
    object Login: AuthScreen(route = "LOGIN")
    object SignUp: AuthScreen(route = "SIGN_UP")
    object Forgot: AuthScreen(route = "FORGOT")
}
