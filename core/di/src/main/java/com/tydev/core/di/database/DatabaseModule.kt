package com.tydev.core.di.database

import android.content.Context
import androidx.room.Room
import com.tydev.core.data.datasource.local.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun providesDatabase(
        @ApplicationContext context: Context,
    ): TodoDatabase = Room.databaseBuilder(
        context,
        TodoDatabase::class.java,
        "todos_db"
    ).build()
}
