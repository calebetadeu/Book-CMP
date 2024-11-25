package com.plcoding.book.data.repository

import com.plcoding.book.data.mappers.toBook
import com.plcoding.book.data.network.RemoteBookDataSource
import com.plcoding.book.domain.Book
import com.plcoding.book.domain.BookRepository
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import com.plcoding.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map {dto->
                dto.results.map { it.toBook() }
            }
    }

}