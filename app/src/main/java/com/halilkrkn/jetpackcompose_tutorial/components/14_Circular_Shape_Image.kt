package com.halilkrkn.jetpackcompose_tutorial.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.R
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Preview
@Composable
fun CircularShapeImage() {
    JetpackCompose_TutorialTheme {
        CircularShape()
    }
}

@Composable
fun CircularShape() {

    Image(
        modifier = Modifier
            .background(Color.Transparent)
            .size(width = 300.dp, height = 300.dp)
            .clip(CircleShape)
//            .clip(RoundedCornerShape(size = 50.dp))
            .border(
                width = 3.dp,
                color = Color.Cyan,
//                shape = RoundedCornerShape(50.dp),
                shape = CircleShape,

            ),
        painter = painterResource(id = R.drawable.stones),
        contentDescription = "Circular Image"
    )
    
}