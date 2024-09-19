package com.jetpackui.designpractice.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jetpackui.designpractice.common.SpacerHeight

@Composable
fun ProfileScreen(){
    var isBoxVisible by remember {
        mutableStateOf(true)
    }

    Box(modifier = Modifier.padding(40.dp)) {
        Button(
            onClick = {
                isBoxVisible = !isBoxVisible
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )
        ){
            Text(text = "Click here", color = Color.White)
        }
    }

    Box(contentAlignment = Alignment.Center, modifier = Modifier
        .fillMaxSize()){
        AnimatedVisibility(
            visible = isBoxVisible,
            enter =
            slideInHorizontally(animationSpec = tween(durationMillis = 200)) { fullWidth ->
                // Offsets the content by 1/3 of its width to the left, and slide towards right
                // Overwrites the default animation with tween for this slide animation.
                -fullWidth / 3
            } +
                    fadeIn(
                        // Overwrites the default animation with tween
                        animationSpec = tween(durationMillis = 200)
                    ),
            exit =
            slideOutHorizontally(animationSpec = spring(stiffness = Spring.StiffnessHigh)) {
                // Overwrites the ending position of the slide-out to 200 (pixels) to the right
                200
            } + fadeOut()
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .height(240.dp)
                        .width(240.dp)
                        .background(Color.DarkGray)
                        .clip(RoundedCornerShape(20.dp))
                )
                SpacerHeight(20.dp)
            }
        }

    }
}