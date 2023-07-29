package com.halilkrkn.jetpackcompose_tutorial.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Composable
@Preview(showBackground = true)
fun SuperScriptText() {
    JetpackCompose_TutorialTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
        ){
            SuperScriptTextCustomization(
                normalText = "Hello World!",
                superScriptText = "TM",
            )
            Spacer(modifier = Modifier.padding(6.dp))
            SuperScriptTextCustomization(
                normalText = "Hello World!",
                subScriptText = "TM",
            )
        }
    }
}

@Composable
fun SuperScriptTextCustomization(
    normalText: String,
    normalFontSize: TextUnit = MaterialTheme.typography.bodyLarge.fontSize,
    superScriptText: String = "",
    subScriptText: String = "",
    textFontSize: TextUnit = MaterialTheme.typography.bodySmall.fontSize,
    textFontWeight: FontWeight = FontWeight.Normal,
) {
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = normalFontSize
            )
        ) {
            append(normalText)
        }

        withStyle(
            style = SpanStyle(
                fontWeight = textFontWeight,
                fontSize = textFontSize,
                baselineShift = BaselineShift.Superscript,
                )
        ) {
            append(superScriptText)
        }

        withStyle(
            style = SpanStyle(
                fontWeight = textFontWeight,
                fontSize = textFontSize,
                baselineShift = BaselineShift.Subscript,
            )
        ) {
            append(subScriptText)
        }
    })

}