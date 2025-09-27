package com.example.androidquiz

import app.cash.turbine.test
import com.example.androidquiz.data.QuizCategory
import com.example.androidquiz.data.QuizQuestion
import com.example.androidquiz.repository.QuizRepository
import com.example.androidquiz.viewmodel.QuizViewModel
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

@ExperimentalCoroutinesApi
class QuizViewModelTest {

    @Test
    fun `pagedQuestions emits questions from repository on refresh`() = runBlocking {
        val repo = mockk<QuizRepository>(relaxed = true)
        val expectedQuestionsList = listOf(
            QuizQuestion(1, "Question 1", "Answer 1", QuizCategory.Kotlin),
            QuizQuestion(2, "Question 2", "Answer 2", QuizCategory.JetpackComponents)
        )
        coEvery { repo.getQuestions(10) } returns flowOf(expectedQuestionsList)
        val viewModel = QuizViewModel(repo)

        viewModel.pagedQuestions.test {
            // 1. Assert the initial emptyList emission from stateIn
            assertEquals(emptyList<QuizQuestion>(), awaitItem())
            // 2. Trigger a refresh
            viewModel.refreshQuestions()
            // 3. Assert the emission of the questions from the repository
            assertEquals(expectedQuestionsList, awaitItem())
            // 4. Cancel collection as StateFlow won't complete by itself
            cancelAndConsumeRemainingEvents()
        }
    }

    @Test
    fun `refreshQuestions triggers repository refresh`() = runBlocking {
        val repo = mockk<QuizRepository>(relaxed = true)
        val expectedQuestionsList1 = listOf(
            QuizQuestion(1, "Question 1", "Answer 1", QuizCategory.Kotlin),
            QuizQuestion(2, "Question 2", "Answer 2", QuizCategory.JetpackComponents)
        )
        val expectedQuestionsList2 = listOf(
            QuizQuestion(3, "Question 3", "Answer 3", QuizCategory.Kotlin),
            QuizQuestion(4, "Question 4", "Answer 4", QuizCategory.JetpackComponents)
        )
        coEvery { repo.getQuestions(10) } returns flowOf(expectedQuestionsList1, expectedQuestionsList2)
        val viewModel = QuizViewModel(repo)

        viewModel.pagedQuestions.test {
            // 1. Assert the initial emptyList emission from stateIn
            assertEquals(emptyList<QuizQuestion>(), awaitItem())
            // 2. Trigger a refresh
            viewModel.refreshQuestions()
            // 3. Assert the emission of the questions from the repository
            assertEquals(expectedQuestionsList1, awaitItem())
            // 4. Cancel collection as StateFlow won't complete by itself
            viewModel.refreshQuestions()

            assertEquals(expectedQuestionsList2, awaitItem())

            cancelAndConsumeRemainingEvents()
        }
    }
}
