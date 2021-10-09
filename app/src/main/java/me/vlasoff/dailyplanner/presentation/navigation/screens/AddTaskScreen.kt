package me.vlasoff.dailyplanner.presentation.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import me.vlasoff.dailyplanner.presentation.navigation.Screen

@Composable
fun AddTaskScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Add Task Screen"
        )
        Button(onClick = { navController.navigate(Screen.MainScreen.route) }) {
            Text(text = "Click")
        }
    }
}