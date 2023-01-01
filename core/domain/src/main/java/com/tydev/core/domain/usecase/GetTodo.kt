package com.tydev.core.domain.usecase

import com.tydev.core.domain.repository.TodoRepository

class GetTodo(
    private val repository: TodoRepository
) {

    suspend operator fun invoke(id: Int) {
        repository.getTodoById(id)
    }
}
