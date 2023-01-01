package com.tydev.core.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String, // 제목
    val description: String, // 상세
    val isDone: Boolean = false, // 완료 여부
    val alarmDate: Long?, // 알림 일자
    @ColumnInfo(defaultValue = "CURRENT_TIMESTAMP")
    var created: Long,
    @ColumnInfo(defaultValue = "CURRENT_TIMESTAMP")
    var modified: Long,
)
