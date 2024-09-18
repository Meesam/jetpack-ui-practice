package com.jetpackui.designpractice.classes

import androidx.compose.ui.graphics.vector.ImageVector

data class ProductItem(
    val title:String = "",
    val description:String = "",
    val imageVector: ImageVector? = null,
    val rating:Int = 0,
    val price:Int = 0
)
