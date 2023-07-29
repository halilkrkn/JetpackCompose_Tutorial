package com.halilkrkn.jetpackcompose_tutorial.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Composable
@Preview(showBackground = true)
fun TextFieldsCustomization() {

    JetpackCompose_TutorialTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextFields()
            Spacer(modifier = Modifier.padding(6.dp))
            OutlinedTextFields()
            Spacer(modifier = Modifier.padding(6.dp))
            BasicTextFields()
        }


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFields() {

    var text by remember { mutableStateOf("Type Here") }

    TextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = { Text("Title") },
        leadingIcon = {
            IconButton(onClick = {
                Log.d("Leading Icon ", "Clicked")
            }) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Email")
            }
        },
        trailingIcon = {
            IconButton(onClick = {
                Log.d("Trailing Icon ", "Clicked")
            }) {
                Icon(imageVector = Icons.Filled.Check, contentDescription = "Check")
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword,
            imeAction = ImeAction.Send
        ),
        keyboardActions = KeyboardActions(
            onSend = {
                Log.d("Keyboard ", "Send")
            }
        ),

//                maxLines = 2,
//                singleLine = true,
//                enabled = false,
//                readOnly = true,
    )

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextFields() {

    var text by remember { mutableStateOf("Type Here") }

    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = { Text("Title") },
        leadingIcon = {
            IconButton(onClick = {
                Log.d("Leading Icon ", "Clicked")
            }) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Email")
            }
        },
        trailingIcon = {
            IconButton(onClick = {
                Log.d("Trailing Icon ", "Clicked")
            }) {
                Icon(imageVector = Icons.Filled.Check, contentDescription = "Check")
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword,
            imeAction = ImeAction.Send
        ),
        keyboardActions = KeyboardActions(
            onSend = {
                Log.d("Keyboard ", "Send")
            }
        ),

//                maxLines = 2,
//                singleLine = true,
//                enabled = false,
//                readOnly = true,
    )
}

@Composable
fun BasicTextFields() {

    var text by remember { mutableStateOf("Type Here") }

    BasicTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },

        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword,
            imeAction = ImeAction.Send
        ),
        keyboardActions = KeyboardActions(
            onSend = {
                Log.d("Keyboard ", "Send")
            }
        ),
    )
}