package com.jetpackui.designpractice.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalPostOffice
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PostAdd
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppHeader(){
    Row(
     verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier
          .fillMaxWidth()
          .padding(top = 40.dp)
    ) {
    Row(verticalAlignment = Alignment.CenterVertically,
        ) {
        AppIcon(Icons.Default.Person, "user")
        SpacerWidth(10.dp)
        Text(text = "Application", fontSize = 24.sp, fontWeight = FontWeight.W500, color = Color.DarkGray)
    }

    Row {
        AppIcon(Icons.Default.PostAdd, "post")
        SpacerWidth(10.dp)
        AppIcon(Icons.Default.LocalPostOffice, "message")
    }
  }
}

@Composable
@Preview(showBackground = true)
fun AppHeaderPreview(){
    AppHeader()
}