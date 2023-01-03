package com.tydev.core.domain.usecase

import com.tydev.core.domain.repository.TodoRepository
import javax.inject.Inject

class GetTodosUserCase @Inject constructor(
    private val repository: TodoRepository
) {

    operator fun invoke() {
        repository.getTodos()
    }
}
