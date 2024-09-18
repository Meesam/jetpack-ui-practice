package com.jetpackui.designpractice.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalPostOffice
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PostAdd
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppHeader(){
    var searchText by remember {
        mutableStateOf("")
    }
    Row(
     verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier
          .fillMaxWidth()
          .padding(top = 40.dp)
    ) {
    Row(verticalAlignment = Alignment.CenterVertically,
        ) {
        Icon(imageVector = Icons.Default.Person, contentDescription = "user")
        SpacerWidth(10.dp)
        OutlinedTextField(
            value = searchText,
            onValueChange = {
               searchText = it
            },
            placeholder = {
                Text(text = "Search", fontSize = 14.sp)
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Search , contentDescription = "Search")
            },
            shape = RoundedCornerShape(10.dp),
        )
    }

    Row {
        Icon(imageVector = Icons.Default.PostAdd, contentDescription = "user")
        SpacerWidth(10.dp)
        Icon(imageVector = Icons.Default.LocalPostOffice, contentDescription = "user")
    }
  }
}

@Composable
@Preview(showBackground = true)
fun AppHeaderPreview(){
    AppHeader()
}