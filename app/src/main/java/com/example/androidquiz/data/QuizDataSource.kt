package com.example.androidquiz.data

import kotlinx.coroutines.flow.Flow

interface QuizDataSource {
    fun getQuestions(): Flow<List<QuizQuestion>>
}