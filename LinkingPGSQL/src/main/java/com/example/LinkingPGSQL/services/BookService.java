package com.example.LinkingPGSQL.services;

import com.example.LinkingPGSQL.domain.entities.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {
    BookEntity save(String isbn, BookEntity book);

    List<BookEntity> findAll();
    Optional<BookEntity> findOne(String isbn);

    BookEntity partialUpdate(String isbn, BookEntity bookEntity);
    void delete(String isbn);
}
