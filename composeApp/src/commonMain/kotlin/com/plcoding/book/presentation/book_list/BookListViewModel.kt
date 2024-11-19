package com.plcoding.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class BookListViewModel : ViewModel() {
    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()

    fun onAction(action: BookListAction) {
        when (action) {
            is BookListAction.OnBookClick -> {
            }

            is BookListAction.OnSearchQueryChange -> {
                _state.value = _state.value.copy(searchQuery = action.query)
            }

            is BookListAction.OnTabSelected -> {
                _state.value = _state.value.copy(selectedTabIndex = action.index)

            }
        }
    }
}