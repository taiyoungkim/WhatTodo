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
    val startDate: Long, // 시작 일자
    val endDate: Long?, // 종료 일자
    val pined: Boolean?, // 고정
//    val targetDays: HashMap<String, Boolean> =
//        hashMapOf("Mon" to false,
//            "The" to false,
//            "Wed" to false,
//            "Thu" to false,
//            "Fri" to false,
//            "Sat" to false,
//            "Sun" to false), // 일주일
    @ColumnInfo(defaultValue = "CURRENT_TIMESTAMP")
    var created: Long,
    @ColumnInfo(defaultValue = "CURRENT_TIMESTAMP")
    var modified: Long,
)
