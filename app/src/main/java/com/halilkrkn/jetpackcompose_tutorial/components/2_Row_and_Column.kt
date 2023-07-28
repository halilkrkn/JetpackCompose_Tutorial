package com.halilkrkn.jetpackcompose_tutorial.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Composable
@Preview(showBackground = true)
fun Column() {
    JetpackCompose_TutorialTheme {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.error)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CustomColumnItem(weight = 3f, color = MaterialTheme.colorScheme.secondary)
            CustomColumnItem(weight = 1f)
        }
    }
}

@Composable
fun ColumnScope.CustomColumnItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        color = color
    ) {}
}

@Composable
@Preview(showBackground = true)
fun Rows() {
    JetpackCompose_TutorialTheme {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.secondary),
            horizontalArrangement = Arrangement.Center
        ) {
            CustomRowItem(weight = 2f)
            CustomRowItem(weight = 2f, color = MaterialTheme.colorScheme.error)
            CustomRowItem(weight = 2f, color = MaterialTheme.colorScheme.background)
        }
    }
}

@Composable
fun RowScope.CustomRowItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}
}