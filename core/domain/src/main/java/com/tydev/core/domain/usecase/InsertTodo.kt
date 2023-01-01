package com.tydev.core.domain.usecase

import com.tydev.core.domain.model.Todo
import com.tydev.core.domain.repository.TodoRepository

class InsertTodo(
    private val repository: TodoRepository
) {

    suspend operator fun invoke(todo: Todo) {
        repository.insertTodo(todo)
    }
}
