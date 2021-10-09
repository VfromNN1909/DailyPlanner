package me.vlasoff.dailyplanner.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.vlasoff.dailyplanner.presentation.navigation.screens.AddTaskScreen
import me.vlasoff.dailyplanner.presentation.navigation.screens.MainScreen
import me.vlasoff.dailyplanner.presentation.navigation.screens.TaskScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController)
        }
        composable(route = Screen.TaskScreen.route) {
            TaskScreen(navController)
        }
        composable(route = Screen.AddTaskScreen.route) {
            AddTaskScreen(navController)
        }
    }
}