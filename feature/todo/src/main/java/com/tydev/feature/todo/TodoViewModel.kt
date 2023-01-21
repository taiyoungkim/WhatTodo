package com.tydev.feature.todo

import androidx.lifecycle.ViewModel
import com.tydev.core.domain.usecase.GetTodosUserCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodoViewModel @Inject constructor(
    getTodos: GetTodosUserCase
) : ViewModel() {

}