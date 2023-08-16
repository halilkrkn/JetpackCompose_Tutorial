package com.halilkrkn.jetpackcompose_tutorial.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import com.halilkrkn.jetpackcompose_tutorial.ui.theme.JetpackCompose_TutorialTheme

@Composable
@Preview(showBackground = true)
fun CoilLibrary() {
    JetpackCompose_TutorialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CoilImage()
        }
    }
}

@Composable
fun CoilImage() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {
        val imageUrl = "https://avatars.githubusercontent.com/u/14994036?v=4"
    // Coil Version = 1.3.0
//        val painter = rememberImagePainter(
//            data = imageUrl,
//            builder = {
//                placeholder(R.drawable.baseline_photo_24)
//                error(R.drawable.baseline_error_24)
//                crossfade(1000)
//                transformations(
//                    GrayscaleTransformation(),
////                    CircleCropTransformation(),
//                    RoundedCornersTransformation(50f),
//                    BlurTransformation(LocalContext.current)
//                )
//            }
//        )
//        val painterState = painter.state
//        Image(
//            painter = painter,
//            contentDescription = "Coil Image",
//            modifier = Modifier
//                .width(200.dp)
//                .height(200.dp)
//                .padding(16.dp),
//
//            )
//        if (painterState is ImagePainter.State.Loading) {
//            CircularProgressIndicator()
//            Text(
//                text = "Coil Library Yükleniyor...",
//                modifier = Modifier.padding(16.dp),
//            )
//        }


//         Coil Version = 2.2.2
        val painter = rememberAsyncImagePainter(
            model = imageUrl
        )
        val painterState = painter.state
        Image(
            painter = painter,
            contentDescription = "Coil Image",
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .padding(16.dp),

            )
        if (painterState is AsyncImagePainter.State.Loading) {
            CircularProgressIndicator()
            Text(
                text = "Coil Library Yükleniyor...",
                modifier = Modifier.padding(16.dp),
            )
        }
        AsyncImage(
            model = "https://avatars.githubusercontent.com/u/14994036?v=4",
            contentDescription = "Coil Image",
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .padding(16.dp),
            onLoading = {
                Log.d("Loading","Loading")
            },
            onSuccess = {
                Log.d("Success","Success")
            },
        )


    }
}