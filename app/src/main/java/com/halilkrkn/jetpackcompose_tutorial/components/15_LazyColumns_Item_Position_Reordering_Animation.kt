package com.halilkrkn.jetpackcompose_tutorial.components

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Preview(showBackground = true)
@Composable
fun LazyColumnsReorderingAnimation() {
    JetpackCompose_TutorialTheme {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            ReorderingAnimation()
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReorderingAnimation() {
    var items by remember {
        mutableStateOf(
            listOf(
                "Kotlin",
                "Java",
                "Python",
                "Go",
                "C++"
            )
        )
    }

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        items(items = items, key = {it}) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray.copy(alpha = 0.5f))
                    .padding(12.dp)
                    .animateItemPlacement(
                        animationSpec = tween(
                            durationMillis = 600
                        )
                    ),
                text = "I love $it",
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
        item {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                onClick = { items = items.shuffled() }
            ) {
                Text(text = "Shuffle")
            }
        }
    }

}