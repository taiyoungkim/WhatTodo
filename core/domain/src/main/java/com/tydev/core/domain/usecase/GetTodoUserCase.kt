package com.tydev.core.domain.usecase

import com.tydev.core.domain.repository.TodoRepository
import javax.inject.Inject

class GetTodoUserCase @Inject constructor(
    private val repository: TodoRepository
) {

    suspend operator fun invoke(id: Int) {
        repository.getTodoById(id)
    }
}
