package com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.screen.details

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.viewmodel.SharedViewModel

@Composable
fun DetailsScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val getPerson = sharedViewModel.person
    LaunchedEffect(key1 = getPerson) {
        if (getPerson != null) {
            Log.d("DetailsScreen", getPerson.id.toString())
            Log.d("DetailsScreen", getPerson.firstName)
            Log.d("DetailsScreen", getPerson.lastName)
        }
    }



    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable { },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Details Screen",
            style = TextStyle(
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        )
    }
}