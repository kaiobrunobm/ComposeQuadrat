package com.example.composequadrat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrat.ui.theme.ComposeQuadratTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadratTheme {
                Column (
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Row (modifier = Modifier.weight(1f)){
                        QuadrantComposable(
                            "Text composable",
                            "Displays text and follows the recommended Material Design guidelines.",
                            0xFFEADDFF,
                            modifier = Modifier.weight(1f)
                        )
                        QuadrantComposable(
                            "Image composable",
                            "Creates a composable that lays out and draws a given Painter class object",
                            0xFFD0BCFF,
                            modifier = Modifier.weight(1f)
                        )
                    }
                    Row (modifier = Modifier.weight(1f)){
                        QuadrantComposable(
                            "Row composable",
                            "A layout composable that places its children in a horizontal sequence.",
                            0xFFB69DF8,
                            modifier = Modifier.weight(1f)
                        )
                        QuadrantComposable(
                            "Column composable",
                            "A layout composable that places its children in a vertical sequence.",
                            0xFFF6EDFF,
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun QuadrantComposable(composableTitle: String, composableContent: String, color: Long, modifier: Modifier = Modifier) {
    Column(
        modifier.background(Color(color)).padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = composableTitle,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = composableContent,
            textAlign = TextAlign.Justify,
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadratTheme {

    }
}