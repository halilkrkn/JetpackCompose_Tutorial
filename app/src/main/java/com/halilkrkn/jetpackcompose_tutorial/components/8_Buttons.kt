package com.halilkrkn.jetpackcompose_tutorial.components

import android.util.Log
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.R
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.Pink80
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.Purple40
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.Shapes

@Composable
@Preview(showBackground = true)
fun Buttons() {

    JetpackCompose_TutorialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GoogleButton(
                onClick = {
                    Log.d("Google", "Clicked")
                }
            )
            GradientButton(
                text = "Button",
                textColor = Color.White,
                gradient = Brush.horizontalGradient(
                    colors = listOf(
                        Purple40,
                        Pink80
                    )
                )
            )
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoogleButton(
    text: String = "Sign In with Google",
    loadingText: String = "Signing Up...",
    icon: Painter = painterResource(id = R.drawable.ic_google_logo),
    shape: CornerBasedShape = Shapes.medium,
    borderColor: Color = Color.Green,
    onClick: () -> Unit = {},
) {
    var clicked by remember { mutableStateOf(false) }

    Surface(
        onClick = {
            clicked = !clicked
        },
        shape = shape,
        border = BorderStroke(
            width = 2.dp,
            color = borderColor
        ),
        color = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 12.dp,
                    bottom = 12.dp
                )
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = FastOutSlowInEasing
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .size(48.dp, 48.dp),
                painter = icon,
                contentDescription = "Google Button",
                tint = Color.Unspecified
            )
            Spacer(
                modifier = Modifier
                    .width(8.dp)
            )
            Text(text = if (clicked) loadingText else text)
            if (clicked) {
                Spacer(modifier = Modifier.width(8.dp))
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(24.dp)
                        .width(24.dp),
                    strokeWidth = 2.dp,
                    color = Color.Red
                )
                onClick()
            }
        }
    }
}


@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit = {},
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() },
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .background(gradient),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = textColor,
                fontSize = MaterialTheme.typography.headlineLarge.fontSize
            )
        }
    }
}

