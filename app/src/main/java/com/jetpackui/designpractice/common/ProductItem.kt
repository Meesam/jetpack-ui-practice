package com.jetpackui.designpractice.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ModeComment
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackui.designpractice.R
import com.jetpackui.designpractice.classes.ProductItem

@Composable
fun ProductItemUi(product:ProductItem){
  Surface(color = Color.White,
      shadowElevation = 5.dp,
      shape = RoundedCornerShape(10.dp),
      contentColor = Color.DarkGray) {
     Column(
         modifier = Modifier
             .fillMaxWidth()
             .padding(10.dp)
     ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
        SpacerHeight(10.dp)
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
          Column {
              Text(text = product.title, fontSize = 20.sp, fontWeight = FontWeight.W500)
              SpacerHeight(8.dp)
              Text(text = "$" + product.price, fontSize = 18.sp, fontWeight = FontWeight.W500)
          }
          Column {
            Row {
                for(i in 1..5){
                   Icon(
                       imageVector = Icons.Default.Star,
                       contentDescription = "rating",
                       tint = Color.Yellow
                   )
                }
            }
            SpacerHeight(8.dp)
            Row(horizontalArrangement = Arrangement.End) {
                Text(text = "2k", fontSize = 18.sp, fontWeight = FontWeight.W500)
                SpacerWidth()
                Icon(
                    imageVector = Icons.Default.ModeComment,
                    contentDescription = "rating",
                    tint = Color.DarkGray
                )
            }

          }
        }

     }
  }
}

@Composable
@Preview(showBackground = true)
fun ProductItemPreview(){
   // ProductItemUi()
}