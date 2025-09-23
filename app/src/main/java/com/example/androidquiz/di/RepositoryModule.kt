package com.example.androidquiz.di

import com.example.androidquiz.data.QuizDataSource
import com.example.androidquiz.data.QuizLocalDataSource
import com.example.androidquiz.repository.QuizRepository
import com.example.androidquiz.repository.QuizRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // To make the binding available at the application level
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindQuizDataSource(
        quizLocalDataSource: QuizLocalDataSource
    ): QuizDataSource

    @Binds
    @Singleton // QuizRepositoryImpl is already @Singleton, this makes the binding consistent
    abstract fun bindQuizRepository(
        quizRepositoryImpl: QuizRepositoryImpl
    ): QuizRepository
}
