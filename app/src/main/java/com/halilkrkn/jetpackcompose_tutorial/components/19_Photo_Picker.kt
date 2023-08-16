package com.halilkrkn.jetpackcompose_tutorial.components

import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.halilkrkn.jetpackcompose_tutorial.R

@Preview
@Composable
fun PhotoPicker() {
    PhotoPickerCustom()
}

@Composable
fun PhotoPickerCustom() {
    val context = LocalContext.current
    var imageUri: Any? by remember {
        mutableStateOf(R.drawable.baseline_add_photo_alternate_24)
    }
    val photoPicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickVisualMedia()
    ) { uri ->
        if (uri != null) {
            Log.d("PhotoPicker", "Selected URI: $uri")
            imageUri = uri
        } else {
            Log.d("PhotoPicker", "No Selected Media")
        }
    }
    
    val multiplePhotoPicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickMultipleVisualMedia(maxItems = 2)
    ) {}

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            modifier = Modifier
                .size(250.dp)
                .clickable {
                    photoPicker.launch(
                        PickVisualMediaRequest(
                            ActivityResultContracts.PickVisualMedia.ImageOnly
                        )
                    )
                },
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageUri)
                .crossfade(enable = true)
                .build(),
            contentDescription = "Avatar Image",
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = {
                Toast.makeText(
                    context,
                    ActivityResultContracts.PickVisualMedia.isPhotoPickerAvailable(context).toString(),
                    Toast.LENGTH_LONG
                ).show()
            }) {
            Text("Availability")
        }
    }
}