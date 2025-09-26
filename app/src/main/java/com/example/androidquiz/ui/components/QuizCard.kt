package com.example.androidquiz.ui.components

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidquiz.R
import com.example.androidquiz.data.QuizCategory
import com.example.androidquiz.data.QuizQuestion
import com.example.androidquiz.ui.theme.AndroidQuizTheme
import kotlinx.coroutines.launch

@Composable
fun QuizCard(
    question: QuizQuestion,
    onNextClicked: () -> Unit,
    onPreviousClicked: () -> Unit,
    canGoPrevious: Boolean,
    modifier: Modifier = Modifier
) {
    var showAnswer by rememberSaveable { mutableStateOf(false) }
    val offsetX = remember { Animatable(0f) }
    val textToSpeak = if (showAnswer) question.answerText else question.questionText

    val scope = rememberCoroutineScope()
    val density = LocalDensity.current

    LaunchedEffect(question) {
        showAnswer = false
    }

    BoxWithConstraints(
        modifier = modifier
            .padding(16.dp) // Inner padding for the card content
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        val screenWidthPx = with(density) { maxWidth.toPx() }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .pointerInput(question) { // Re-key when question changes to reset drag state
                    detectDragGestures(
                        onDragEnd = {
                            scope.launch {
                                val targetOffsetX = when {
                                    offsetX.value < -screenWidthPx / 4 -> -screenWidthPx
                                    offsetX.value > screenWidthPx / 4 -> screenWidthPx
                                    else -> 0f
                                }
                                offsetX.animateTo(targetOffsetX, animationSpec = tween(300))
                                if (targetOffsetX != 0f) {
                                    if (targetOffsetX >= 0) onNextClicked() else onPreviousClicked()
                                    offsetX.snapTo(0f)
                                }
                            }
                        },
                        onDrag = { change, dragAmount ->
                            scope.launch {
                                change.consume()
                                offsetX.snapTo(offsetX.value + dragAmount.x)
                            }
                        }
                    )
                },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(
                modifier = Modifier
                    .offset { IntOffset(offsetX.value.toInt(), 0) }
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onTap = {
                                scope.launch {
                                    showAnswer = !showAnswer
                                }
                            }
                        )
                    }
                    .weight(1f) // Takes available vertical space, pushing buttons down
                    .fillMaxWidth()
            ) {
                Column(Modifier
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())) {
                    Crossfade(showAnswer, animationSpec = tween(300)) { isVisible ->
                        when (isVisible) {
                            true -> Text(
                                text = question.answerText,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth()
                            )

                            false -> Text(
                                text = question.questionText,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom
            ) {
                Button(
                    modifier = Modifier.weight(1f),
                    enabled = canGoPrevious,
                    onClick = {
                        scope.launch {
                            showAnswer = false
                            offsetX.animateTo(-screenWidthPx, animationSpec = tween(300))
                            onPreviousClicked()
                        }
                    }
                ) {
                    Text(stringResource(R.string.previous))
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = {
                        scope.launch {
                            showAnswer = false
                            offsetX.animateTo(screenWidthPx, animationSpec = tween(300))
                            onNextClicked()
                        }
                    }) {
                    Text(stringResource(R.string.next))
                }
                Spacer(modifier = Modifier.width(16.dp))
                TextToSpeechButton(
                    modifier = Modifier.weight(.45f),
                    textToSpeak = textToSpeak
                )
            }
        }
    }
}

@Preview(name = "Question Shown", showBackground = true)
@Composable
fun QuizCardPreview_QuestionShown() {
    AndroidQuizTheme {
        Box(modifier = Modifier.height(400.dp)) {
            QuizCard(
                question = QuizQuestion(
                    1,
                    "What is an Activity in Android?",
                    "An Activity represents a single screen with a user interface (UI) in an Android app. It's the primary way users interact with your application.",
                    category = QuizCategory.AndroidFundamentals
                ),
                onNextClicked = {},
                onPreviousClicked = {},
                canGoPrevious = true
            )
        }
    }
}

@Preview(name = "Answer Shown", showBackground = true)
@Composable
fun QuizCardPreview_AnswerShown() {
    AndroidQuizTheme {
        Box(modifier = Modifier.height(400.dp)) {
            QuizCard(
                question = QuizQuestion(
                    1,
                    "What is Jetpack Compose?",
                    "Jetpack Compose is Android's modern toolkit for building native UIs. It simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs. It allows you to build your UI by defining a set of composable functions that describe how your UI should look given the current state.",
                    category = QuizCategory.JetpackComponents
                ),
                onNextClicked = {},
                onPreviousClicked = {},
                canGoPrevious = true
            )
        }
    }
}

@Preview(
    name = "Wide Screen - Question Shown",
    showBackground = true,
    widthDp = 800,
    heightDp = 400
)
@Composable
fun QuizCardPreview_Wide_QuestionShown() {
    AndroidQuizTheme {
        QuizCard(
            question = QuizQuestion(
                1,
                "What is the purpose of the AndroidManifest.xml file?",
                "The AndroidManifest.xml file is a crucial part of every Android app. It describes essential information about your app to the Android build tools, the Android operating system, and Google Play.",
                category = QuizCategory.AndroidFundamentals
            ),
            onNextClicked = {},
            onPreviousClicked = {},
            canGoPrevious = false
        )
    }
}

@Preview(name = "Wide Screen - Answer Shown", showBackground = true, widthDp = 800, heightDp = 400)
@Composable
fun QuizCardPreview_Wide_AnswerShown() {
    AndroidQuizTheme {
        QuizCard(
            question = QuizQuestion(
                1,
                "What is a ViewModel in Android?",
                "A ViewModel is a class that is responsible for preparing and managing the data for an Activity or a Fragment. It also handles the communication of the Activity/Fragment with the rest of the application.",
                category = QuizCategory.JetpackComponents
            ),
            onNextClicked = {},
            onPreviousClicked = {},
            canGoPrevious = true
        )
    }
}
