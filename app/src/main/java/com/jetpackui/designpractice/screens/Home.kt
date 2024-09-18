package com.jetpackui.designpractice.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackui.designpractice.common.AppHeader
import com.jetpackui.designpractice.common.AppSearchbar
import com.jetpackui.designpractice.common.CategoryList
import com.jetpackui.designpractice.common.SpacerHeight

@Composable
fun HomeScreen(){
  Box(modifier = Modifier
      .fillMaxSize()
      .padding(10.dp)
  ){
      Column(modifier = Modifier
          .fillMaxSize()) {
        AppHeader()
        SpacerHeight(20.dp)
        AppSearchbar()
        SpacerHeight(20.dp)
        CategoryList()
      }

  }    
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen()
}