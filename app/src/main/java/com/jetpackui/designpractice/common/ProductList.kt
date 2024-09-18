package com.jetpackui.designpractice.common

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackui.designpractice.classes.ProductItem

@Composable
fun ProductList(){
    val itemList = listOf(
        ProductItem(title = "title-1", rating = 1, price = 230),
        ProductItem(title = "title-2", rating = 1, price = 230),
        ProductItem(title = "title-3", rating = 1, price = 230),
        ProductItem(title = "title-4", rating = 1, price = 230),
        ProductItem(title = "title-5", rating = 1, price = 230),
        ProductItem(title = "title-6", rating = 1, price = 230),
        ProductItem(title = "title-7", rating = 1, price = 230),
        ProductItem(title = "title-8", rating = 1, price = 230),
        ProductItem(title = "title-9", rating = 1, price = 230),
        ProductItem(title = "title-10", rating = 1, price = 230),
        ProductItem(title = "title-11", rating = 1, price = 230),
        ProductItem(title = "title-12", rating = 1, price = 230),
        ProductItem(title = "title-14", rating = 1, price = 230),
        ProductItem(title = "title-15", rating = 1, price = 230),
        ProductItem(title = "title-16", rating = 1, price = 230),
        ProductItem(title = "title-17", rating = 1, price = 230),
        ProductItem(title = "title-18", rating = 1, price = 230),
        ProductItem(title = "title-19", rating = 1, price = 230)
    )
    LazyColumn(contentPadding = PaddingValues(top = 5.dp,bottom = 100.dp)) {
        items(itemList){
            ProductItemUi(it)
            SpacerHeight(10.dp)
        }
    }
}

@Composable
@Preview
fun ProductListPreview(){
    ProductList()
}