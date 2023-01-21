package com.tydev.core.data

import com.tydev.core.data.datasource.local.TodoDao
import com.tydev.core.data.datasource.local.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {
    @Provides
    fun providesTodoDao(
        database: TodoDatabase,
    ): TodoDao = database.todoDao()
}
