package com.example.globoplay.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.globoplay.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home2() {
    Column(modifier = Modifier.fillMaxSize()) {
        // TopBar substituindo o topBar do Scaffold
        TopAppBar(
            title = {
                Box(modifier = Modifier
                    .fillMaxWidth()
                ) {
                    Text(
                        text = "globoplay",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.Center)

                    )
                }

            },
            colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Black),
            actions = {
                IconButton(onClick = { /* Ação de pesquisa */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.orgulhoepaixao),
                        contentDescription = "Pesquisar",
                        tint = Color.Gray,
                    )
                }
                IconButton(onClick = { /* Ação de perfil */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "Perfil",
                        tint = Color.Green,
                    )
                }
            }
        )

        // Conteúdo principal
        Column(
            modifier = Modifier
                .weight(1f) // Usando .weight(1f) para o conteúdo principal preencher o espaço restante
                .fillMaxSize()
                .padding(6.dp)
        ) {
            Text(
                text = "Novelas",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Novelas()

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Séries",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Series()

            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Filmes",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Filmes()
        }

        // BottomBar substituindo o bottomBar do Scaffold
        BottomAppBar(
            Modifier.background(Color.Blue)
        ) {
            Text(
                text = "Bottom Bar",
                modifier = Modifier.padding(16.dp),
                color = Color.Blue
            )
        }
    }
}

@Composable
fun Novelas() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(10) {
            SectionNovels()
        }
    }
}

@Composable
fun Series() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(10) {
            SectionSeries()
        }
    }
}

@Composable
fun Filmes () {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(10) {
            SectionMovies()
        }
    }
}

@Composable
fun CardItem() {
    Box(
        modifier = Modifier
            .size(150.dp, 200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Filme",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewCustomHomeWithoutScaffold() {
    Home2()

}
