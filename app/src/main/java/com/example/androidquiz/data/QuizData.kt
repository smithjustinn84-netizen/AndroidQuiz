package com.example.androidquiz.data

sealed class QuizCategory(val name: String) {
    object AndroidAdvancedTopics : QuizCategory("Android Advanced Topics")
    object AndroidFundamentals : QuizCategory("Android Fundamentals")
    object AndroidUI : QuizCategory("Android UI")
    object BuildAndTools : QuizCategory("Build and Tools")
    object Coroutines : QuizCategory("Coroutines")
    object JetpackComponents : QuizCategory("Jetpack Components")
    object JetpackCompose : QuizCategory("Jetpack Compose")
    object Kotlin : QuizCategory("Kotlin")
    object SolidPrinciples : QuizCategory("SOLID Principles")
    object Security : QuizCategory("Security")
    object Testing : QuizCategory("Testing")
    companion object
}

data class QuizQuestion(
    val id: Int,
    val questionText: String,
    val answerText: String,
    val category: QuizCategory
)
