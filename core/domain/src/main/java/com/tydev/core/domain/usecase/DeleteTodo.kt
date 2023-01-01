package com.tydev.core.domain.usecase

import com.tydev.core.domain.model.Todo
import com.tydev.core.domain.repository.TodoRepository

class DeleteTodo(
    private val repository: TodoRepository
) {

    suspend operator fun invoke(todo: Todo) {
        repository.deleteTodo(todo)
    }
}
