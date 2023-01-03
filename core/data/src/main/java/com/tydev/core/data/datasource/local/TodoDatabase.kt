package com.tydev.core.data.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tydev.core.domain.model.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase : RoomDatabase() {

    abstract fun todoDao(): TodoDao
}
