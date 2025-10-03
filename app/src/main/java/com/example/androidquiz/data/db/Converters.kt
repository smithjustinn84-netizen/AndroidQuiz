package com.example.androidquiz.data.db

import androidx.room.TypeConverter
import com.example.androidquiz.data.QuizCategory

class Converters {
    @TypeConverter
    fun fromQuizCategory(category: QuizCategory): String {
        return category.name
    }

    @TypeConverter
    fun toQuizCategory(name: String): QuizCategory {
        return QuizCategory.valueOf(name)
    }
}

fun QuizCategory.Companion.valueOf(name: String): QuizCategory {
    return when (name) {
        "Android Advanced Topics" -> QuizCategory.AndroidAdvancedTopics
        "Android Fundamentals" -> QuizCategory.AndroidFundamentals
        "Android UI" -> QuizCategory.AndroidUI
        "Build and Tools" -> QuizCategory.BuildAndTools
        "Coroutines" -> QuizCategory.Coroutines
        "Jetpack Components" -> QuizCategory.JetpackComponents
        "Kotlin" -> QuizCategory.Kotlin
        "SOLID Principles" -> QuizCategory.SolidPrinciples
        "Security" -> QuizCategory.Security
        "Testing" -> QuizCategory.Testing
        else -> throw IllegalArgumentException("Invalid QuizCategory name: $name")
    }
}
