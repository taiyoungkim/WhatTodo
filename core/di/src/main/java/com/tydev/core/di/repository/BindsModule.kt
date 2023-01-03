package com.tydev.core.di.repository

import com.tydev.core.data.repository.TodoRepositoryImpl
import com.tydev.core.domain.repository.TodoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BindsModule {
    @Binds
    abstract fun providesTodoRepository(impl: TodoRepositoryImpl): TodoRepository
}
