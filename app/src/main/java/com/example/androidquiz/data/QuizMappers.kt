package com.example.androidquiz.data

import com.example.androidquiz.data.db.QuizData

fun QuizData.toQuizQuestion(): QuizQuestion {
    return QuizQuestion(
        id = this.id,
        questionText = this.questionText,
        answerText = this.answerText,
        category = this.category
    )
}

fun List<QuizData>.toQuizQuestions(): List<QuizQuestion> {
    return this.map { it.toQuizQuestion() }
}
