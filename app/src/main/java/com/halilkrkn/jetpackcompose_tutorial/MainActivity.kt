package com.halilkrkn.jetpackcompose_tutorial

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.halilkrkn.jetpackcompose_tutorial.components.SearchBarMainScreen
import com.halilkrkn.jetpackcompose_tutorial.components.SetupNavGraph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.screens.MainScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.nav_graph.NavGraph
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme
import com.halilkrkn.jetpackcompose_tutorial.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    private val mainViewModel: MainViewModel by viewModels()

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_TutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")


                    // Navigation - Sayfalar, Ekranlar arası geçiş için MainActivity'de Host olarak kurduk.
                    navController = rememberNavController()
//                    SetupNavGraph(navController = navController) // 11_Navigations için
//                    NavGraph(navController = navController)  // nested navigation için
//                    MainScreen() // Bottom Navigation için
//                    SearchBarMainScreen(mainViewModel = mainViewModel) // Search Bar için


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompose_TutorialTheme {
        Greeting("Android")
    }
}