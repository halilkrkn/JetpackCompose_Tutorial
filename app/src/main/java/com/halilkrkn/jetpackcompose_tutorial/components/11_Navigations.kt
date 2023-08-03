package com.halilkrkn.jetpackcompose_tutorial.components

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
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument


// HomeScreen sayfası oluşturuldu
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
                    // Navigation ile HomeScreen'den DetailScreen'e veri gönderdik.
                    val route = Screen.Detail.passNameAndId(
                        id = 11,
                        name = "Helloooğğğğ"
                    )
                    navController.navigate(route = route)
                },
            text = "Home",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

// DetailScreen sayfası oluşturuldu
@Composable
fun DetailScreen(
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
                    navController.navigate(route = Screen.Home.route) {
                        popUpTo(Screen.Home.route) {
                            inclusive = true
                        }
                    }

//                    navController.popBackStack() // Geri HomeScreen'e geldikten sonra geri tuşu ile doğrudan uygulamadan çıkıyor.
                },
            text = "Detail",
            color = MaterialTheme.colorScheme.secondary,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

const val DETAIL_ARGUMENT_ID_KEY = "id"
const val DETAIL_ARGUMENT_Name_KEY = "name"

// Ekranları tanımladık.
sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")

    // HomeScreen'den DetailScreen'e veri gönderebilmek için DETAIL_ARGUMENT_KEY ile gönderilecek veriyi tanımladık.
    object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_ID_KEY}/{$DETAIL_ARGUMENT_Name_KEY}") {

//        fun passId(id: Int): String {
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }

        fun passNameAndId(
            id: Int = 0,
            name: String = "Halilkrkn",
        ): String {
            return "detail_screen/$id/$name"
//            return "detail_screen?id=$id&name=$name" // Bu şekilde de verilebilir. Ama yukarıdaki route detail_screen?id={$DETAIL_ARGUMENT_ID_KEY}&name={$DETAIL_ARGUMENT_Name_KEY} şeklinde olmalıdır.
        }
    }
}

// Sayfalar arası yönlendirme işlemlerinin setup'ını yaptık.
@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            // Burada HomeScreen'den DetailScreen'e veri gönderebilmek için arguments içerisinde tanımlamış olduğumuz DETAIL_ARGUMENT_KEY'i verdik ve içerisinde type olarak DETAIL_ARGUMENT_KEY'in tipini verdik.
            arguments = listOf(

                navArgument(DETAIL_ARGUMENT_ID_KEY) {
                    type = NavType.IntType
                },
                navArgument(DETAIL_ARGUMENT_Name_KEY) {
                    type = NavType.StringType
                }
            )
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_ID_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_Name_KEY).toString())
            DetailScreen(navController)
        }
    }
}










