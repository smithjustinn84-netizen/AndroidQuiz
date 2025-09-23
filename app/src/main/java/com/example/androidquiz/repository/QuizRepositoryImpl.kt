package com.example.androidquiz.repository

import com.example.androidquiz.data.QuizDataSource
import com.example.androidquiz.data.QuizQuestion
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton // Good practice to make repositories singletons
class QuizRepositoryImpl @Inject constructor(
    private val quizDataSource: QuizDataSource
) : QuizRepository {
    override fun getQuizQuestions(): Flow<List<QuizQuestion>> {
        // In a real app, this might come from a database, network, or other data source.
        // For now, we'll just return the sample data wrapped in a Flow.
        return quizDataSource.getQuestions()
    }
}
