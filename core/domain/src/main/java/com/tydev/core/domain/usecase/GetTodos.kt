package com.tydev.core.domain.usecase

import com.tydev.core.domain.repository.TodoRepository

class GetTodos(
    private val repository: TodoRepository
) {

    operator fun invoke() {
        repository.getTodos()
    }
}
