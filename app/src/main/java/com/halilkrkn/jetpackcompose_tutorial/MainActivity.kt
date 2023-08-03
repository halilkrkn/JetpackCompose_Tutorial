package com.halilkrkn.jetpackcompose_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.halilkrkn.jetpackcompose_tutorial.components.SetupNavGraph
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.nav_graph.NavGraph
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

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
//                    SetupNavGraph(navController = navController)
                    NavGraph(navController = navController)

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