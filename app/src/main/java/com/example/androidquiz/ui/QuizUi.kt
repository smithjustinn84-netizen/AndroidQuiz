package com.example.androidquiz.ui

import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidquiz.R
import com.example.androidquiz.data.QuizQuestion
import com.example.androidquiz.repository.QuizRepository
import com.example.androidquiz.ui.screens.QuizFinishedScreen
import com.example.androidquiz.ui.screens.QuizQuestionScreen
import com.example.androidquiz.ui.theme.AndroidQuizTheme
import com.example.androidquiz.viewmodel.QuizViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(viewModel: QuizViewModel) {
    val currentQuestion by viewModel.currentQuestion.collectAsState()
    val currentQuestionIndex by viewModel.currentQuestionIndex.collectAsState()
    val isQuizFinished by viewModel.isQuizFinished.collectAsState()
    val progress by viewModel.progress.collectAsState()
    val totalQuestions = viewModel.getTotalQuestions()
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(stringResource(R.string.android_quiz)) })
        }
    ) { innerPadding ->
        val contentModifier = Modifier
            .fillMaxSize()
            .padding(innerPadding) // Apply padding from Scaffold
            .padding(16.dp) // Apply general screen padding

        if (totalQuestions == 0) {
            Column(
                modifier = contentModifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Display a specific message if no questions are loaded, or a loading state
                if (viewModel.currentQuestion.collectAsState().value == null && !isQuizFinished) {
                    Text(stringResource(R.string.loading_question))
                } else {
                    Text(stringResource(R.string.no_questions_available))
                }
            }
        } else if (isQuizFinished) {
            QuizFinishedScreen(
                modifier = contentModifier,
                totalQuestions = totalQuestions,
                onRestartQuiz = { viewModel.restartQuiz() }
            )
        } else if (currentQuestion != null) {
            QuizQuestionScreen(
                contentModifier,
                progress,
                currentQuestionIndex,
                totalQuestions,
                currentQuestion,
                viewModel
            )
        } else {
            // This state might occur briefly while questions are loading or if there's an issue
            Column(
                modifier = contentModifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(stringResource(R.string.loading_question))
            }
        }
    }
}

// Define a fake repository for preview purposes
class FakeQuizRepositoryPreview : QuizRepository {
    override fun getQuizQuestions(): Flow<List<QuizQuestion>> {
        return flowOf(
            listOf(
                QuizQuestion(
                    1,
                    "Preview Question 1: What is an Activity?",
                    "An Activity is a single screen."
                ),
                QuizQuestion(
                    2,
                    "Preview Question 2: What is Compose?",
                    "Compose is a modern UI toolkit."
                ),
                QuizQuestion(
                    3,
                    "Preview Question 3: What is a ViewModel?",
                    "ViewModel stores UI-related data."
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuizScreenPreview() {
    AndroidQuizTheme {
        // Provide the fake repository to the ViewModel for the preview
        QuizScreen(viewModel = QuizViewModel(FakeQuizRepositoryPreview()))
    }
}
