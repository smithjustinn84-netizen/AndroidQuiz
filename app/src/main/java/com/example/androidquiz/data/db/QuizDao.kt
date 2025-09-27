package com.example.androidquiz.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(quizData: QuizData)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(quizDataList: List<QuizData>)

    @Query("SELECT * FROM quiz_data ORDER BY RANDOM() LIMIT :count")
    fun getRandomNQuestions(count: Int): Flow<List<QuizData>>

    @Query("SELECT * FROM quiz_data WHERE category = :category ORDER BY RANDOM() LIMIT :count")
    fun getByCategory(category: String, count: Int): Flow<List<QuizData>>

    @Query("DELETE FROM quiz_data")
    suspend fun deleteAll()
}
