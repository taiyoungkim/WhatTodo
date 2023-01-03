package com.tydev.core.domain.usecase

import com.tydev.core.domain.model.Todo
import com.tydev.core.domain.repository.TodoRepository
import javax.inject.Inject

class DeleteTodoUserCase @Inject constructor(
    private val repository: TodoRepository
) {

    suspend operator fun invoke(todo: Todo) {
        repository.deleteTodo(todo)
    }
}
