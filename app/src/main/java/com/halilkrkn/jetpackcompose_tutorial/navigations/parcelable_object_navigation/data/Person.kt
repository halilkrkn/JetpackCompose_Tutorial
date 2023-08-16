package com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val id: Int,
    val firstName: String,
    val lastName: String,
) : Parcelable
