package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone.R

@Preview
@Composable
fun HomeAppBar(){
    Box(modifier =  Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp), elevation = 6.dp) {
            Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)){
                Icon(Icons.Default.Menu, "menu")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Search in emails", modifier = Modifier.weight(2.0f))
                Image(painter = painterResource(id = R.drawable.ic_baseline_mail_24), contentDescription = "user icon",
                modifier = Modifier.size(30.dp))
            }

        }
    }
}

