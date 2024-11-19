package com.plcoding.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.plcoding.book.presentation.book_list.BookListScreenRoot
import com.plcoding.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot(
        onBookClick = {},
        viewModel = remember {
            BookListViewModel()
        },
    )

}