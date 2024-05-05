package com.example.appaulainicial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appaulainicial.ui.theme.AppAulaInicialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppAulaInicialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Red),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "App Noticias - Fatec",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 30.sp
            )
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.White),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Vestibular")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "O vestibular da FATEC acontece no próximo domingo dia 24/04")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Titulo da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Conteúdo Curto da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Titulo da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Conteúdo Curto da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ },
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Titulo da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Conteúdo Curto da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Titulo da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Conteúdo Curto da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Titulo da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Conteúdo Curto da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Titulo da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Conteúdo Curto da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Titulo da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Conteúdo Curto da Notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
    }
}

@Preview
@Composable
fun AppPreview(){
    AppAulaInicialTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}