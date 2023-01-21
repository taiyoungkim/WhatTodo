package com.tydev.core.data

import com.tydev.core.data.repository.TodoRepositoryImpl
import com.tydev.core.domain.repository.TodoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class BindsModule {
    @Binds
    abstract fun providesTodoRepository(impl: TodoRepositoryImpl): TodoRepository
}
