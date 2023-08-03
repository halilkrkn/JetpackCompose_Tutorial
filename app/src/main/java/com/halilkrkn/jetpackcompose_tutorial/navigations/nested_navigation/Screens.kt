package com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation


const val DETAIL_ARGUMENT_ID = "id"
const val DETAIL_ARGUMENT_NAME = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"


sealed class Screens(val route: String) {

    object HomeScreen : Screens(route = "home_screen")
    object FavouriteScreen : Screens(route = "favourite_screen?id={id}&name={name}") {
        fun passNameAndId(
            id: Int = 0,
            name: String = "Hiiii",
        ): String {
            return "favourite_screen?id=$id&name=$name"
        }
    }

    object LoginScreen : Screens(route = "login_screen")
    object SignUpScreen : Screens(route = "signUp_screen")
}
