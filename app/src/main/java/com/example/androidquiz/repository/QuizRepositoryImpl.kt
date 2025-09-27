package com.example.androidquiz.repository

import com.example.androidquiz.data.QuizQuestion
import com.example.androidquiz.data.db.QuizDao
import com.example.androidquiz.data.toQuizQuestions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizRepositoryImpl @Inject constructor(private val quizDao: QuizDao) : QuizRepository {

    override fun getQuestions(limit: Int?): Flow<List<QuizQuestion>> {
        return quizDao.getRandomNQuestions(limit ?: 10).map { it.toQuizQuestions() }
    }

//    override fun getQuestionsByCategory(
//        category: QuizCategory,
//        limit: Int?
//    ): Flow<List<QuizQuestion>> {
//        return quizDao.getByCategory(category.name, limit ?: 10).map { it.toQuizQuestions() }
//    }
}
