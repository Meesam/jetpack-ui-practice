package com.jetpackui.designpractice.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryPill(title:String = "Test"){
  Surface(
      color = Color.White,
      shadowElevation = 5.dp,
      shape = RoundedCornerShape(50.dp),
      contentColor = Color.DarkGray
  ) {
      Box(
          contentAlignment = Alignment.Center,
          modifier = Modifier
              .padding(10.dp)
      ){
          Text(text = title)
      }
  }
}

@Composable
@Preview(showBackground = true)
fun CategoryPillPreview(){
    CategoryPill()
}