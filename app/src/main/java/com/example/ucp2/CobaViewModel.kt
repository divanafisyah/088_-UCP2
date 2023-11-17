package com.example.ucp2

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.ucp2.Data.ContactUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CobaViewModel : ViewModel() {
    var namamhs : String by mutableStateOf("")
    private set

    var nim : String by mutableStateOf("")
        private set

    var kons : String by mutableStateOf("")
        private set

    var judul : String by mutableStateOf("")
        private set

    var dospem1 : String by mutableStateOf("")
        private set

    var dospem2 : String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(ContactUIState())
    val uiState: StateFlow<ContactUIState> = _uiState.asStateFlow()

    fun insertData (namamhs: String, nim: String, kons: String, judul: String, dospem1: String, dospem2: String)
    {
        namamhs = nama
    }
}