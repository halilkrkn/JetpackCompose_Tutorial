package com.halilkrkn.jetpackcompose_tutorial.onboarding_screen

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.navigation.SetupNavGraph
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.ui.theme.JetpackCompose_TutorialTheme
import com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.viewmodel.SplashViewModel
import com.halilkrkn.jetpackcompose_tutorial.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingMainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    @Inject
    lateinit var splashViewModel: SplashViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition {
            !splashViewModel.isLoading.value
        }

        setContent {
            JetpackCompose_TutorialTheme {
                // A surface container using the 'background' color from the theme
                navController = rememberNavController()
                val startDestination by splashViewModel.startDestination
                val navController = rememberNavController()
                SetupNavGraph(
                    navController = navController,
                    startDestination = startDestination
                )
            }
        }
    }
}
