package com.jetpackui.designpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jetpackui.designpractice.classes.NavItem
import com.jetpackui.designpractice.screens.HomeScreen
import com.jetpackui.designpractice.screens.ProfileScreen
import com.jetpackui.designpractice.screens.SettingScreen
import com.jetpackui.designpractice.ui.theme.DesignPracticeTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DesignPracticeTheme {
                val navItems = listOf(
                    NavItem(title = "Home", Icons.Default.Home),
                    NavItem(title = "Completed", Icons.Default.Person),
                    NavItem(title = "Setting", Icons.Default.Settings)
                )
                var selectedItem by remember {
                    mutableIntStateOf(0)
                }
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        NavigationBar(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor =  Color.White,
                            tonalElevation = 5.dp,
                            modifier = Modifier
                                .padding(top = 10.dp)

                        ) {
                            navItems.forEachIndexed { index, navItem ->
                                NavigationBarItem(
                                    selected = selectedItem == index,
                                    onClick = {
                                        selectedItem = index
                                    },
                                    icon = {
                                        navItem.icon?.let { Icon(imageVector = it, contentDescription = "Icon") }
                                    },
                                    label = {
                                        Text(text = navItem.title)
                                    }
                                )
                            }
                        }
                    }
                ) { innerPadding ->
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding))
                    ContentScreen(selectedItem)
                }
            }
        }
    }
}


@Composable
fun ContentScreen(selectedIndex:Int){
    when(selectedIndex){
        0 -> HomeScreen()
        1 -> ProfileScreen()
        2 -> SettingScreen()
    }
}

