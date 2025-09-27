package com.example.androidquiz.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.androidquiz.data.db.AppDatabase
import com.example.androidquiz.data.db.QuizDao
import com.example.androidquiz.data.db.QuizData
import com.example.androidquiz.data.db.defaultQuestions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Provider
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context,
        quizDaoProvider: Provider<QuizDao>
    ): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "quiz_database"
        )
            .fallbackToDestructiveMigration(false)
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    // Use a coroutine to insert data on a background thread
                    // Get the DAO instance via the provider to avoid circular dependency
                    CoroutineScope(Dispatchers.IO).launch {
                        val quizDao = quizDaoProvider.get()
                        val quizDataList = defaultQuestions.map {
                            QuizData(
                                id = 0, // Let Room auto-generate IDs
                                questionText = it.questionText,
                                answerText = it.answerText,
                                category = it.category
                            )
                        }
                        quizDao.insertAll(quizDataList)
                    }
                }
            })
            .build()
    }

    @Provides
    @Singleton
    fun provideQuizDao(appDatabase: AppDatabase): QuizDao {
        return appDatabase.quizDao()
    }
}
