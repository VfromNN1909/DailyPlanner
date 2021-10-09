package me.vlasoff.dailyplanner.presentation.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object TaskScreen : Screen("task_screen")
    object AddTaskScreen : Screen("add_task_screen")
}
