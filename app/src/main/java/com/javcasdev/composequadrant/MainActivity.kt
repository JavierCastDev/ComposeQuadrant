package com.javcasdev.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javcasdev.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Quadrant()
            }
        }
    }
}


@Composable
fun Quadrant() {
    Column {
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .background(color = Color(0xFFEADDFF))
                    .weight(1f)
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    Text(
                        text = stringResource(R.string.text_composable),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(stringResource(R.string.first_text), textAlign = TextAlign.Justify)
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color(0xFFD0BCFF))
                    .weight(1f)
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    Text(
                        text = stringResource(R.string.image_composable),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(stringResource(R.string.second_text), textAlign = TextAlign.Justify)
                }
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .background(color = Color(0xFFB69DF8))
                    .weight(1f)
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    Text(
                        text = stringResource(R.string.row_composable),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(stringResource(R.string.third_text), textAlign = TextAlign.Justify)
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color(0xFFF6EDFF))
                    .weight(1f)
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    Text(
                        text = stringResource(R.string.column_composable),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(stringResource(R.string.fourth_text), textAlign = TextAlign.Justify)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}