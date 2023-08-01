package com.halilkrkn.jetpackcompose_tutorial.repository

import com.halilkrkn.jetpackcompose_tutorial.model.Person

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 1,
                firstName = "Halil",
                lastName = "Karkın",
                age = 27
            ),
            Person(
                id = 2,
                firstName = "John",
                lastName = "Doe",
                age = 35
            ),
            Person(
                id = 3,
                firstName = "Jane",
                lastName = "Doe",
                age = 45
            ),
            Person(
                id = 4,
                firstName = "Foo",
                lastName = "Bar",
                age = 50
            ),
            Person(
                id = 5,
                firstName = "Android",
                lastName = "Studio",
                age = 55
            ),
            Person(
                id = 6,
                firstName = "Jetpack",
                lastName = "Compose",
                age = 65
            ),
            Person(
                id = 7,
                firstName = "Kotlin",
                lastName = "Language",
                age = 60
            ),
            Person(
                id = 8,
                firstName = "Lorem",
                lastName = "Ipsum",
                age = 70
            ),
            Person(
                id = 9,
                firstName = "Aenean",
                lastName = "Condimentum",
                age = 50
            ),
            Person(
                id = 10,
                firstName = "Praesent",
                lastName = "Finibus",
                age = 45
            ),
            Person(
                id = 11,
                firstName = "Vivamus",
                lastName = "Rhoncus",
                age = 40
            ),
            Person(
                id = 12,
                firstName = "Aliquam",
                lastName = "Pulvinar",
                age = 30
            ),
            Person(
                id = 13,
                firstName = "Sed",
                lastName = "Nec",
                age = 35
            ),
            Person(
                id = 14,
                firstName = "Mauris",
                lastName = "Lobortis",
                age = 15
            ),
            Person(
                id = 15,
                firstName = "Suspendisse",
                lastName = "Potenti",
                age = 20
            ),
            Person(
                id = 16,
                firstName = "Nullam",
                lastName = "Purus",
                age = 25
            ),
            Person(
                id = 17,
                firstName = "Nullam",
                lastName = "Purus",
                age = 25
            ),
            Person(
                id = 18,
                firstName = "Nullam",
                lastName = "Purus",
                age = 25
            ), Person(
                id = 19,
                firstName = "Nullam",
                lastName = "Purus",
                age = 25
            ), Person(
                id = 20,
                firstName = "Nullameee",
                lastName = "Purus",
                age = 25
            )
        )
    }
}