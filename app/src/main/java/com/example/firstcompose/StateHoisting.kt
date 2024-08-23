package com.example.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun NotificationScreen(){
    var count: MutableState<Int> = rememberSaveable {mutableStateOf(0)}
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.White)
        ){
        NotificationCounter(count.value) { count.value++ }
        MessageBar(count.value)
    }
}

@Composable
fun MessageBar(count: Int) {
    Card (elevation = CardDefaults.cardElevation(4.dp)){
        Row (modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically){
            Image(painter = painterResource(id = R.drawable.ic_msg), contentDescription = "",
                modifier = Modifier.padding(4.dp))
            Text(text = "You sent notification $count times.")
        }
    }
}

@Composable
fun NotificationCounter(count: Int, increment: () -> Unit) {

    Column {
        Text(text = "You pressed the button $count times.")
        Button(onClick = {increment()}) {
            Text(text = "Send Notification")
        }
    }
}