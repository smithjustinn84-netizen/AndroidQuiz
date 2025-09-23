package com.example.androidquiz.ui.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidquiz.R
import com.example.androidquiz.ui.theme.AndroidQuizTheme

@Composable
fun QuizFinishedScreen(
    modifier: Modifier = Modifier,
    totalQuestions: Int,
    onRestartQuiz: () -> Unit
) {
    val scale = remember { Animatable(0.5f) }
    LaunchedEffect(Unit) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.quiz_finished),
            fontSize = 24.sp,
            modifier = Modifier.scale(scale.value)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(stringResource(R.string.you_ve_completed_all_questions, totalQuestions))
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onRestartQuiz) {
            Text(stringResource(R.string.restart_quiz))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizFinishedScreenPreview() {
    AndroidQuizTheme {
        QuizFinishedScreen(
            totalQuestions = 10,
            onRestartQuiz = {}
        )
    }
}
