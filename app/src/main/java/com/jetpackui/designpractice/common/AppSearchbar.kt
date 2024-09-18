package com.jetpackui.designpractice.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun AppSearchbar(){
  var searchText by remember {
      mutableStateOf("")
  }
    Box(
      contentAlignment = Alignment.Center,
      modifier = Modifier
          .fillMaxWidth()
  ) {
      OutlinedTextField(
          value = searchText,
          onValueChange = {searchText = it},
          placeholder = {
              Text("Search")
          },
          trailingIcon = {
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(
                      imageVector = Icons.Default.Cancel,
                      contentDescription = "clear",
                      tint = Color.DarkGray
                  )
              }
          },
          leadingIcon = {
              Icon(
                  imageVector = Icons.Default.Search,
                  contentDescription = "search",
                  tint = Color.DarkGray
              )
          },
          shape = RoundedCornerShape(50.dp)
      )
  }
}

@Composable
@Preview(showBackground = true)
fun AppSearchbarPreview(){
    AppSearchbar()
}
