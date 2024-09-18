package com.jetpackui.designpractice.common

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
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
    Surface(
        shape = RoundedCornerShape(50.dp),
        shadowElevation = 10.dp,
        tonalElevation = 10.dp,
        color = Color.White
    ) {
        Box(
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
                    if(searchText != ""){
                        IconButton(onClick = {
                            searchText = ""
                        }) {
                            Icon(
                                imageVector = Icons.Default.Cancel,
                                contentDescription = "clear",
                                tint = Color.LightGray
                            )
                        }
                    }
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.LightGray
                    )
                },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(color = Color.White, width = 10.dp),

            )
        }
    }

}

@Composable
@Preview(showBackground = true)
fun AppSearchbarPreview(){
    AppSearchbar()
}
