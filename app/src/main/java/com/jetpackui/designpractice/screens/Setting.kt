package com.jetpackui.designpractice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SweepGradient
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackui.designpractice.common.gradiantBackground

@Composable
fun SettingScreen(){
    val colorList = listOf(
            Color(0XFFFFFFFF),
            Color(0XFFFBFCF8),
            Color(0XFFFEF9F3),
            Color(0XFFF5FEFD),
            Color(0XFFFDF6E4),
            Color(0XFFFFFADA),
            Color(0XFFFFF9E3),
            Color(0XFFE7DECC)
        )
    Box(modifier = Modifier
        .fillMaxSize()
        .background(brush = gradiantBackground(true,colorList))
    ){
        Text("Setting Screen")
    }
}

@Composable
@Preview
fun SettingScreenPreview(){
    SettingScreen()
}