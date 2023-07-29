package com.halilkrkn.jetpackcompose_tutorial.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.Shapes

@Composable
@Preview(showBackground = true)
fun ExpandableCards() {

    JetpackCompose_TutorialTheme {
        ExpandableCardCustomization(
            title = "Title",
            description = ""
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpandableCardCustomization(
    title: String,
    titleFontSize: TextUnit = MaterialTheme.typography.headlineMedium.fontSize,
    titleFontWeight: FontWeight = FontWeight.Bold,
    description: String,
    descriptionFontSize: TextUnit = MaterialTheme.typography.bodyLarge.fontSize,
    descriptionMaxLines: Int = 3,
    shape: CornerBasedShape = Shapes.medium,
    padding: Dp = 12.dp

    ) {
    var expandableState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(
        targetValue = if (expandableState) 180f else 0f
    )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding)
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 200,
                        easing = LinearOutSlowInEasing
                    )
                ),
            shape = shape,
            onClick = {
                expandableState = !expandableState
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier.weight(6f),
                        text = title,
                        fontSize = titleFontSize,
                        fontWeight = titleFontWeight,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    IconButton(
                        modifier = Modifier
                            .weight(1f)
                            .rotate(rotationState),
                        onClick = {
                            expandableState = !expandableState
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = "Drop-Down Arrow"
                        )
                    }
                }
                if (expandableState) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = padding)
                            .alpha(0.5f),
                        text = description,
                        maxLines = descriptionMaxLines,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = descriptionFontSize

                    )
                }
            }
        }
    }

