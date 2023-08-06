package com.halilkrkn.jetpackcompose_tutorial.onboarding_screen.util

import androidx.annotation.DrawableRes
import com.halilkrkn.jetpackcompose_tutorial.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){

    object First: OnBoardingPage(
        image = R.drawable.meeting,
        title = "Meeting",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    )

    object Second: OnBoardingPage(
        image = R.drawable.coordination,
        title = "Coordination",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    )

    object Third: OnBoardingPage(
        image = R.drawable.dialog,
        title = "Dialog",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    )

}
