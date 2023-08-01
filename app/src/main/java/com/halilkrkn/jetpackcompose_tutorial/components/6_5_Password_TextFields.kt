package com.halilkrkn.jetpackcompose_tutorial.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halilkrkn.jetpackcompose_tutorial.R
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Composable
@Preview(showBackground = true)
fun PasswordTextFieldsCustomization() {

    JetpackCompose_TutorialTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            PasswordTextField()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField() {
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember {
        mutableStateOf(false)
    }

    val icon = if (passwordVisibility) {
        painterResource(id = R.drawable.baseline_visibility_24)
    } else {
        painterResource(id = R.drawable.baseline_visibility_off_24)
    }

    OutlinedTextField(
        value = password,
        onValueChange = { text ->
            password = text
        },
        placeholder = { Text("Password") },
        label = { Text("Password") },
        trailingIcon = {
            IconButton(onClick = {
               passwordVisibility = !passwordVisibility
            }) {
                Icon(
                    painter = icon,
                    contentDescription = "Visibility",
                )
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        visualTransformation = if (passwordVisibility) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
    )
}






























