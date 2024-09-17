package com.example.globoplay.ui.components

//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.globoplay.R
import com.example.globoplay.ui.theme.GloboplayTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DataHome() {
    Scaffold(
        topBar = { TopBar() }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Novelas",
                fontSize = 54.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            SectionNovels()

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Séries",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            SectionSeries()

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Filmes",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            SectionMovies()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    Box {
        TopAppBar(
            title = {
                Text(text = "GLOBOPLAY", color = Color.Blue)
            },
            Modifier.background(Color.Black),
            actions = {
                IconButton(onClick = { /* TODO: Implementar ação de pesquisa */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.orgulhoepaixao),
                        contentDescription = "Pesquisar",
                        tint = Color.Blue
                    )
                }
                IconButton(onClick = { /* TODO: Implementar ação de perfil */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "Perfil",
                        tint = Color.Blue
                    )
                }
            }
        )

    }

}

@Composable
fun SectionNovels() {
    Box(
        modifier = Modifier
            .size(150.dp, 200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.orgulhoepaixao),
            contentDescription = "Filme",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun SectionSeries() {
    Box(
        modifier = Modifier
            .size(150.dp, 200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.series),
            contentDescription = "Filme",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

}

@Composable
fun SectionMovies() {
    Box(
        modifier = Modifier
            .size(150.dp, 200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.filme),
            contentDescription = "Filme",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStreamingHome() {
    DataHome()
}


@Preview(showSystemUi = true)
@Composable
fun HomeItemPreview() {
    GloboplayTheme {
        Surface {

            Home2()
        }
    }
}