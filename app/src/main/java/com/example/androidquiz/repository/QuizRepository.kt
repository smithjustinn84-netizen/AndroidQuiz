package com.example.androidquiz.repository

import com.example.androidquiz.data.QuizQuestion
import kotlinx.coroutines.flow.Flow

interface QuizRepository {
    fun getQuizQuestions(): Flow<List<QuizQuestion>>
}
