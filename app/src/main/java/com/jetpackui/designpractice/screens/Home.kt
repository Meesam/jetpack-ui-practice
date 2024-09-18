package com.jetpackui.designpractice.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackui.designpractice.common.AppHeader

@Composable
fun HomeScreen(){
  Box(modifier = Modifier
      .fillMaxSize()
      .padding(10.dp)
  ){
      AppHeader()
  }    
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    Box(modifier = Modifier
        .fillMaxSize()){
        AppHeader()
    }
}