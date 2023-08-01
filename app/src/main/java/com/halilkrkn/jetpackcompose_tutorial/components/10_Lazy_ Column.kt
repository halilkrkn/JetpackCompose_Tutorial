package com.halilkrkn.jetpackcompose_tutorial.components

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.model.Person
import com.halilkrkn.jetpackcompose_tutorial.repository.PersonRepository
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview(showBackground = true)
fun LazyColumnCustomization() {
    JetpackCompose_TutorialTheme {
        val personRepository = PersonRepository()
        val getAllData = personRepository.getAllData()

        val section = listOf("A", "B", "C", "D", "E", "F", "G")

        LazyColumn(
            contentPadding = PaddingValues(all = 12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
//                items(getAllData.size) { index ->
//                    CustomItem(getAllData[index])
//                }

//            itemsIndexed(
//                items = getAllData,
//                key = { index, person -> person.id }
//            ) { index, person ->
//                Log.d("LazyColumn", index.toString())
//                CustomItem(person)
//            }
            section.forEach { section ->
                stickyHeader {
                     Text(
                        text = "Section $section",
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(
                                width = 2.dp,
                                color = Color.Black,
                                shape = MaterialTheme.shapes.small
                            )
                            .background(color = Color.LightGray)
                            .padding(8.dp),
                        color = Color.Black,
                        fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                }
                items(10) {
                    Text(
                        modifier = Modifier.padding(6.dp),
                        text = "Item $it from the section $section",
                    )
                }

            }

        }


    }
}

@Composable
fun CustomItem(person: Person) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Color.LightGray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = person.lastName,
            color = Color.Black,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Normal
        )

    }
}