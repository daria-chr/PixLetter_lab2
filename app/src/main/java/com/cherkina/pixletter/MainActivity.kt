package com.cherkina.pixletter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cherkina.pixletter.ui.theme.PixLetterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            PixLetterTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
            PixLetterTheme {
                GreetingText("Royal Decree!\nDear Daria,\nHis Majesty the King\nInvites you to a great feast!\nCome to the castle before sunset,\notherwise, you risk losing your head!",from="From King Arthur", modifier = Modifier.padding(8.dp))

            }
            }
        }
    }


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Surface (color = Color.Green){
//        Text(
//            text = "Hello, my name is $name!",
//            modifier = modifier.padding(24.dp)
//        )
//    }
//}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier= Modifier){
    Column(verticalArrangement = Arrangement.Center, modifier=modifier) {
        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier=Modifier.padding(16.dp).align(alignment = Alignment.End)
        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
//    PixLetterTheme {
//        Greeting("Daria")
//    }
    GreetingText("Royal Decree!\nDear Daria,\nHis Majesty the King\nInvites you to a great feast!\nCome to the castle before sunset,\notherwise, you risk losing your head!",from="From King Arthur")

}