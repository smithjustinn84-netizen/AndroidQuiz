package com.example.androidquiz.ui.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.animation.core.tween // Kept for potential future use
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androidquiz.data.QuizQuestion

@Composable
fun QuestionPage(
    question: QuizQuestion,
    modifier: Modifier = Modifier,
) {
    var isAnswerRevealed by remember { mutableStateOf(false) }

    Box( // Use Box for layering and alignment
        modifier =
            modifier
                .fillMaxSize()
                .pointerInput(Unit) {
                    detectTapGestures(
                        onTap = {
                            isAnswerRevealed = !isAnswerRevealed
                        }
                    )
                }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize() // Column takes full size within the Box
                .verticalScroll(rememberScrollState()), // Enable vertical scrolling
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AnimatedContent(
                targetState = isAnswerRevealed,
                transitionSpec = {
                    // Enter: slide in from bottom + fade in
                    (slideInVertically(animationSpec = tween(durationMillis = 500)) { height -> height } +
                        fadeIn(animationSpec = tween(durationMillis = 500)))
                        .togetherWith(
                            // Exit: fade out
                            slideOutVertically() + shrinkVertically() + fadeOut() + scaleOut(targetScale = 1.2f)
                        )
                },
                label = "QuestionAnswerAnimation"
            ) { isRevealed ->
                if (isRevealed) {
                    Text(
                        textAlign = TextAlign.Center,
                        text = question.answerText,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                else {
                    Text(
                        textAlign = TextAlign.Center,
                        text = question.questionText,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        TextToSpeechButton(
            textToSpeak = if (isAnswerRevealed) question.answerText else question.questionText,
            modifier = Modifier
                .align(Alignment.BottomEnd) // Align to the bottom end of the Box
                .padding(16.dp)
        )
    }
}
