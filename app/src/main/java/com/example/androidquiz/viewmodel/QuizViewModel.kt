package com.example.androidquiz.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidquiz.data.QuizQuestion
import com.example.androidquiz.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val quizRepository: QuizRepository
) : ViewModel() {

    // Change refreshTrigger to a Boolean
    private val refreshTrigger = MutableStateFlow(true)

    @OptIn(ExperimentalCoroutinesApi::class)
    val pagedQuestions: Flow<List<QuizQuestion>> =
        refreshTrigger.flatMapLatest { _ ->
            quizRepository
                .getQuestions(10)
                .flowOn(Dispatchers.IO)
        }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = emptyList()
            )

    fun refreshQuestions() {
        viewModelScope.launch {
            refreshTrigger.value = !refreshTrigger.value
        }
    }
}
