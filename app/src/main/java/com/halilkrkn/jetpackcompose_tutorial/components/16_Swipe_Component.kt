package com.halilkrkn.jetpackcompose_tutorial.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.R
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox

@Preview
@Composable
fun SwipeComponent() {

    val archive = SwipeAction(
        onSwipe = {
            Log.d("Swipe", "Archive")
        },
        icon = {
            Icon(
                modifier = Modifier
                    .padding(16.dp),
                painter = painterResource(id = R.drawable.baseline_archive_black_24),
                contentDescription = "Archive",
                tint = Color.White
            )
        },
        background = Green
    )

    val email = SwipeAction(
        onSwipe = {
            Log.d("Swipe", "Email")
        },
        icon = {
            Icon(
                modifier = Modifier
                    .padding(16.dp),
                painter = painterResource(id = R.drawable.baseline_email_24),
                contentDescription = "Email",
                tint = Color.White
            )
        },
        background = Blue,
    )

    val delete = SwipeAction(
        onSwipe = {
            Log.d("Swipe", "Delete")
        },
        icon = {
            Icon(
                modifier = Modifier
                    .padding(16.dp),
                painter = painterResource(id = R.drawable.baseline_delete_24),
                contentDescription = "Delete",
                tint = Color.White
            )
        },
        background = Red,
    )

    SwipeableActionsBox(
        startActions = listOf(archive),
        endActions = listOf(email,delete),
    ) {
        Swipe()
    }

}


@Composable
fun Swipe() {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .padding(horizontal = 16.dp)
            .padding(vertical = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(size = 50.dp))
                .background(MaterialTheme.colors.primary)
                .size(50.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier
                .weight(weight = 7f)
        ) {
            Text(
                text = "Title",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = "Some random text.")
        }
    }
}