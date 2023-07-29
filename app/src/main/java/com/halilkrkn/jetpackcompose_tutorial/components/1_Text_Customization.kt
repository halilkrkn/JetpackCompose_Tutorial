package com.halilkrkn.jetpackcompose_tutorial.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Composable
@Preview(showBackground = true)
fun TextCustomization(){

    JetpackCompose_TutorialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello World",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(18.dp)
                    .width(200.dp),
                color = Color.White,
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End

            )
            Spacer(modifier = Modifier.padding(10.dp))

            Text(
                buildAnnotatedString {
                    withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ){
                            append("A")
                        }
                        append("B")
                        append("C")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ){
                            append("D")
                        }
                    }
                }, modifier = Modifier.width(200.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))

            Text(text = "Hello World".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
    }
}