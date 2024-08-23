package com.example.firstcompose

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
//import com.example.firstcompose.ui.theme.BlogCategory
//import com.example.firstcompose.ui.theme.FirstComposeTheme
//import com.example.firstcompose.ui.theme.PreviewFunction
//import com.example.firstcompose.ui.theme.getCategoryList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotificationScreen()
        }
    }
}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction() {
    

//    Text(text = "Abbas Ahmed",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.ExtraBold,
//        color = Color.Red,
//        fontSize = 36.sp,
//        textAlign = TextAlign.Center

//    Image(
//        painter = painterResource(id = R.drawable.ic_car),
//        contentDescription = "Dummy Image",
//        colorFilter = ColorFilter.tint(Color.Green),
//        contentScale = ContentScale.Crop
//        )

//    Button(onClick = { /*TODO*/ }) {
//
//    }

//    TextField(value = , onValueChange = )
//}
//
//@Composable
//fun TextInput(){
//    val state = remember { mutableStateOf("") }
//    TextField(
//        value = state.value,
//        onValueChange = {
//            state.value = it
//        },
//        label = { Text(text = "Enter Message")}
//    )
//}
