package com.example.graphql2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.graphql2.domain.GetBootstrapUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ModulesViewModel @Inject constructor(
    private val getModuleIdUseCase: GetBootstrapUseCase
): ViewModel(){

    private val _state = MutableStateFlow(ModulesState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true)
            _state.value = _state.value.copy(moduleId = getModuleIdUseCase.execute(), isLoading = false)
        }
    }

    data class ModulesState(
        val moduleId: String? = null,
        val isLoading: Boolean = false,
    )
}