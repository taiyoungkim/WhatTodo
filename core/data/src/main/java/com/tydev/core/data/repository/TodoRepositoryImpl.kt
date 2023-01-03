package com.tydev.core.data.repository

import com.tydev.core.data.datasource.local.TodoDao
import com.tydev.core.domain.model.Todo
import com.tydev.core.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoDao: TodoDao
) : TodoRepository {
    override fun getTodos(): Flow<List<Todo>> {
        return todoDao.getTodos()
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return todoDao.getTodoById(id)
    }

    override suspend fun insertTodo(todo: Todo) {
        return todoDao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        return todoDao.deleteTodo(todo)
    }
}
