package com.halilkrkn.jetpackcompose_tutorial.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Composable
@Preview(showBackground = true)
fun TextSelection() {

    JetpackCompose_TutorialTheme() {

        SelectionContainer {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "Hello World!")
                DisableSelection {
                    Text(text = "Hello World!")
                }
            }
        }
    }


}