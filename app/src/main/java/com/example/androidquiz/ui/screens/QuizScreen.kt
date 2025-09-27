package com.example.androidquiz.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.androidquiz.ui.components.QuestionPage
import com.example.androidquiz.ui.components.QuizFinishedCard
import com.example.androidquiz.viewmodel.QuizViewModel
import kotlinx.coroutines.launch

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    viewModel: QuizViewModel = hiltViewModel(),
) {
    val questions by viewModel.pagedQuestions.collectAsStateWithLifecycle(emptyList()) // Default emptyList is good if ViewModel provides it
    val scope = rememberCoroutineScope()

    Scaffold { paddingValues ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            val pagerState = rememberPagerState(
                initialPage = 0,
                pageCount = { questions.size + 1 }
            )

            Column(modifier = Modifier.fillMaxSize()) { // Added a column to hold button and pager content
                if (questions.isEmpty()) {
                    Text(
                        "No questions available. Try fetching new ones.",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                } else {

                    // Progress Indicator
                    if (pagerState.pageCount > 1) { // Ensure there's more than just the results page
                        val progress = if (pagerState.currentPage < questions.size) {
                            (pagerState.currentPage + 1).toFloat() / questions.size
                        } else {
                            1f
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 8.dp),
                        ) {
                            LinearProgressIndicator(
                                progress = { progress },
                                modifier = Modifier.fillMaxWidth()
                            )
                            Text("${(pagerState.currentPage + 1).coerceAtMost(questions.size)}/${questions.size}")
                        }
                    }

                    // HorizontalPager for questions and results
                    HorizontalPager(
                        state = pagerState,
                        modifier = Modifier.weight(1f),
                    ) { pageIndex ->
                        if (pageIndex < questions.size) {
                            val question = questions[pageIndex]
                            QuestionPage(
                                question = question,
                            )
                        } else {
                            QuizFinishedCard(
                                totalQuestions = questions.size,
                                onRestartQuiz = {
                                    viewModel.refreshQuestions()
                                    scope.launch {
                                        pagerState.requestScrollToPage(0)
                                    }
                                }
                            )
                        }
                    }
                }
            }


        }
    }
}


