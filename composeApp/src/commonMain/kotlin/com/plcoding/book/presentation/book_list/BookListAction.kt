package com.plcoding.book.presentation.book_list

import com.plcoding.book.domain.Book

sealed class BookListAction {
    data class OnSearchQueryChange(val query: String) : BookListAction()
    data class OnBookClick(val book: Book) : BookListAction()
    data class OnTabSelected(val index: Int) : BookListAction()

}