package com.example.globoplay.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.globoplay.R
import com.example.globoplay.ui.theme.GloboplayTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardDetails() {
    Column(
        Modifier
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.orgulhoepaixao),
            contentDescription = null,
            Modifier
                .padding(top = 50.dp)
                .height(150.dp)
                .blur(0.dp)
        )


        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Orgulho e Paixao ",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.padding(top = 2.dp))
        Text(
            text = "Novela ",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray
        )
    }
}


@Preview
@Composable
fun ProductItemPreview() {
    GloboplayTheme {
        Surface {
            CardDetails()
        }
    }
}