package com.jetpackui.designpractice.common

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackui.designpractice.classes.CategoryItem

@Composable
fun CategoryList(){
   val categoryList = listOf(
       CategoryItem("Latest trend"),
       CategoryItem("Kids"),
       CategoryItem("Men"),
       CategoryItem("WeMen"),
       CategoryItem("Boys"),
       CategoryItem("Toys"),
       CategoryItem("Shoes"),
       CategoryItem("Jeans"),
       CategoryItem("Latest trend"),
       CategoryItem("Kids"),
       CategoryItem("Men"),
       CategoryItem("WeMen"),
       CategoryItem("Boys"),
       CategoryItem("Toys"),
       CategoryItem("Shoes"),
       CategoryItem("Jeans")
   )
    LazyRow(
        contentPadding = PaddingValues(horizontal = 2.dp)
    ) {
        items(categoryList){
            CategoryPill(it.title)
            SpacerWidth(10.dp)
        }
    }
}

@Composable
@Preview
fun CategoryListPreview(){
    CategoryList()
}