package com.example.androidquiz.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidquiz.data.QuizCategory
import com.example.androidquiz.data.QuizQuestion
import com.example.androidquiz.repository.QuizRepository
import com.example.androidquiz.ui.components.QuizCard
import com.example.androidquiz.ui.theme.AndroidQuizTheme
import com.example.androidquiz.viewmodel.QuizViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

@Composable
fun QuizQuestionScreen(
    modifier: Modifier = Modifier,
    progress: Float,
    currentQuestionIndex: Int,
    totalQuestions: Int,
    currentQuestion: QuizQuestion?,
    viewModel: QuizViewModel
) {
    Column(
        modifier = modifier.fillMaxSize(), // Outer column fills the whole screen area passed to it
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LinearProgressIndicator(
            progress = { progress },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
        Text(
            text = "Question ${currentQuestionIndex + 1} of $totalQuestions",
            modifier = Modifier.padding(bottom = 8.dp)
        )

        if (currentQuestion != null) {
            QuizCard(
                question = currentQuestion,
                onNextClicked = { viewModel.moveToNextQuestion() },
                onPreviousClicked = { viewModel.moveToPreviousQuestion() },
                canGoPrevious = viewModel.canGoPrevious(),
                modifier = Modifier
                    .weight(1f)
            )
        } else {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("No question to display")
            }
        }
    }
}

// Define a fake repository for preview purposes
class FakeQuizRepositoryPreview : QuizRepository {
    private val questions = listOf(
        QuizQuestion(
            101,
            "Preview Question 1 (Screen): What is Jetpack Compose?",
            "Jetpack Compose is Android\'s modern toolkit for building native UIs.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            102,
            "Preview Question 2 (Screen): What is an Activity?",
            "An Activity is a single, focused thing that the user can do.",
            category = QuizCategory.AndroidFundamentals
        )
    )

    override fun getQuizQuestions(): Flow<List<QuizQuestion>> {
        return flowOf(questions)
    }

    // Helper to get a specific question for the preview, if needed directly
    fun getFirstQuestionForPreview(): QuizQuestion? = questions.firstOrNull()
    fun getQuestionCountForPreview(): Int = questions.size
}

@Preview(showBackground = true)
@Composable
fun QuizQuestionScreenPreview() {
    AndroidQuizTheme {
        val fakeRepo = FakeQuizRepositoryPreview()
        val firstQuestion =
            fakeRepo.getFirstQuestionForPreview() ?: QuizQuestion(0, "Error", "Error", QuizCategory.AndroidFundamentals)
        val totalFakeQuestions = fakeRepo.getQuestionCountForPreview()

        QuizQuestionScreen(
            modifier = Modifier.fillMaxSize(),
            progress = 0f, // Progress for the first question (index 0)
            currentQuestionIndex = 0,
            totalQuestions = totalFakeQuestions, // Total questions from the fake repository
            currentQuestion = firstQuestion, // Display the first question from fake data
            viewModel = QuizViewModel(fakeRepo) // ViewModel initialized with the fake repository
        )
    }
}
