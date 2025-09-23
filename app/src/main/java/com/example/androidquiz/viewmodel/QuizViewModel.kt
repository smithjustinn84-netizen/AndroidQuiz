package com.example.androidquiz.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidquiz.data.QuizQuestion
import com.example.androidquiz.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val quizRepository: QuizRepository // Injected repository
) : ViewModel() {

    private val _questions = MutableStateFlow<List<QuizQuestion>>(emptyList())
    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex.asStateFlow()

    init {
        loadRandomQuestions()
    }

    private fun loadRandomQuestions() {
        viewModelScope.launch {
            // Collect questions from the repository
            val allQuestions = quizRepository.getQuizQuestions().first() // Using .first() as it's a one-shot load for now
            val shuffledQuestions = allQuestions.shuffled(Random(System.currentTimeMillis()))
            _questions.value = shuffledQuestions // Take 10 random questions
            _currentQuestionIndex.value = 0 // Reset index when new questions are loaded
        }
    }

    val currentQuestion: StateFlow<QuizQuestion?> = _currentQuestionIndex.map {
        if (_questions.value.isNotEmpty() && it < _questions.value.size) {
            _questions.value[it]
        } else {
            null
        }
    }.stateIn(viewModelScope, SharingStarted.Lazily, null)

    val isQuizFinished: StateFlow<Boolean> = _currentQuestionIndex.map {
        _questions.value.isEmpty() || it >= _questions.value.size
    }.stateIn(viewModelScope, SharingStarted.Lazily, _questions.value.isEmpty())

    val progress: StateFlow<Float> = _currentQuestionIndex.map {
        if (_questions.value.isNotEmpty()) {
            val currentProgress = if (it >= _questions.value.size) 1f else it.toFloat() / _questions.value.size.toFloat()
            currentProgress.coerceAtMost(1f)
        } else {
            0f
        }
    }.stateIn(viewModelScope, SharingStarted.Lazily, 0f)

    fun moveToNextQuestion() {
        if (_currentQuestionIndex.value < _questions.value.size) {
            _currentQuestionIndex.value++
        }
    }

    fun moveToPreviousQuestion() {
        if (_currentQuestionIndex.value > 0) {
            _currentQuestionIndex.value--
        }
    }

    fun restartQuiz() {
        loadRandomQuestions()
    }

    fun canGoPrevious(): Boolean {
        return _currentQuestionIndex.value > 0
    }

    fun getTotalQuestions(): Int {
        return _questions.value.size
    }
}
