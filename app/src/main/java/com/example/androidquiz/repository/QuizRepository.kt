package com.example.androidquiz.repository

import com.example.androidquiz.data.QuizQuestion
import kotlinx.coroutines.flow.Flow

interface QuizRepository {
    fun getQuestions(limit: Int? = null): Flow<List<QuizQuestion>>
//    fun getQuestionsByCategory(
//        category: QuizCategory,
//        limit: Int? = null
//    ): Flow<List<QuizQuestion>>
}
