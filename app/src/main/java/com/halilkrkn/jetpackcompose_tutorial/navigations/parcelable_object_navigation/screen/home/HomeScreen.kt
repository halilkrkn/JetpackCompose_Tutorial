package com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.data.Person
import com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.util.Screen
import com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.viewmodel.SharedViewModel

@Composable
fun HomeScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                val person = Person(
                    id = 1,
                    firstName = "Halil",
                    lastName = "Karkın"
                )
                sharedViewModel.addPerson(newPerson = person)

//                navController.currentBackStackEntry?.savedStateHandle?.set(
//                    key = "person",
//                    value = person
//                )
                navController.navigate(route = Screen.Details.route)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Home Screen",
            style = TextStyle(
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        )
    }
}