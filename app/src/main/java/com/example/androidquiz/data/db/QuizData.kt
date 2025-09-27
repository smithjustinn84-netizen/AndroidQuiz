package com.example.androidquiz.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.androidquiz.data.QuizCategory

@Entity(tableName = "quiz_data")
data class QuizData(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val questionText: String,
    val answerText: String,
    val category: QuizCategory
)
