package io.dz.librarydb.service;


import io.dz.librarydb.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book save(Book book);

    Book getById(String id);

    Book update(Book book);

    void delete(Book book);

    List<String> borrowBook(String memberId,List<String> bookIds);

    Book returnBook(String bookId,String memberId);
}
