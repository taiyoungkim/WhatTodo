package com.tydev.feature.todo.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.tydev.feature.todo.TodoRoute

const val todoNavigationRoute = "todo_route"

fun NavController.navigateToTodo(navOptions: NavOptions? = null) {
    this.navigate(todoNavigationRoute, navOptions)
}

fun NavGraphBuilder.todoScreen() {
    composable(route = todoNavigationRoute) {
        TodoRoute()
    }
}
