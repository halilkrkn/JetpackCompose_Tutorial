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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.halilkrkn.jetpackcompose_tutorial.components.BlurEffect
import com.halilkrkn.jetpackcompose_tutorial.components.SetupNavGraph
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.bottom_bar_with_badges.screens.HomeScreen
import com.halilkrkn.jetpackcompose_tutorial.components.HyperlinkTextCustom
import com.halilkrkn.jetpackcompose_tutorial.components.PhotoPicker
import com.halilkrkn.jetpackcompose_tutorial.components.SearchBarMainScreen
import com.halilkrkn.jetpackcompose_tutorial.components.SelectableItemAnimated
import com.halilkrkn.jetpackcompose_tutorial.components.SwipeComponent
import com.halilkrkn.jetpackcompose_tutorial.components.TopBarCustom
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottom_navigation.screens.MainScreen
import com.halilkrkn.jetpackcompose_tutorial.navigations.bottombar_nested_navigation.graphs.RootNavigationGraph
import com.halilkrkn.jetpackcompose_tutorial.navigations.nested_navigation.nav_graph.NavGraph
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.navigation.SetupNavGraph
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.viewmodel.SplashViewModel
import com.halilkrkn.jetpackcompose_tutorial.splash_screen.navigation.SplashNavGraph
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme
import com.halilkrkn.jetpackcompose_tutorial.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.nav_graph.SetupNavGraph

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    private val mainViewModel: MainViewModel by viewModels()

//Onboarding Screen İçin
//    @Inject
//    lateinit var splashViewModel: SplashViewModel

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//Onboarding Screen İçin
//        installSplashScreen().setKeepOnScreenCondition {
//            !splashViewModel.isLoading.value
//        }

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

//                    MainScreen()
                      Home
//                    MainScreen() // Bottom Navigation için
//                    SearchBarMainScreen(mainViewModel = mainViewModel) // Search Bar için
//                    SplashNavGraph(navController = navController)

                    //Onboarding Screen İçin
//                    val startDestination by splashViewModel.startDestination
//                    val navController = rememberNavController()
//                   SetupNavGraph(
//                        navController = navController,
//                        startDestination = startDestination
//                    )
                }
//                SwipeComponent() // Swipe Component
//                SelectableItemAnimated() // Selectable Item Animated
//                SetupNavGraph(navController = navController) // Pass a Parcelable Object with Navigation Different Between Screens
//                HyperlinkTextCustom()
//                RootNavigationGraph(navController = navController) // Nested Navigation BottomBar
//                  PhotoPicker() // Photo Picker
//                TopBarCustom() // TopBar Component
                BlurEffect() // Blur Effect Component
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