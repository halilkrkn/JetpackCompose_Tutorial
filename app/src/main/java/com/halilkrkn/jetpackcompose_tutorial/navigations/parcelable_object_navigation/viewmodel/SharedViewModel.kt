package com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.halilkrkn.jetpackcompose_tutorial.navigations.parcelable_object_navigation.data.Person

class SharedViewModel: ViewModel() {

    var person by mutableStateOf<Person?>(null)
        private set

    fun addPerson(newPerson: Person){
        person = newPerson
    }
}