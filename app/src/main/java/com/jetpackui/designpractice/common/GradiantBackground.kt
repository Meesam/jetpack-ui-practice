package com.jetpackui.designpractice.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun gradiantBackground(
    isVertical:Boolean,
    colors:List<Color>
): Brush {


    val endOffset = if(isVertical){
         Offset(0f, Float.POSITIVE_INFINITY)
    }else{
        Offset(Float.POSITIVE_INFINITY,0f)
    }
    return Brush.linearGradient(
        colors,
        start = Offset.Zero,
        end = endOffset
    )
}