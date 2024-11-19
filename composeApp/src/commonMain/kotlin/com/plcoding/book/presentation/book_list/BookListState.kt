package com.plcoding.book.presentation.book_list

import com.plcoding.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
 val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "htttps://test.com",
        authors = listOf("Calebe Tadeu"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67854,
        ratingCount = 5,
        numEditions = 3,
        numPages = 100
    )
}
