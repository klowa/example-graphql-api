package com.example.demo.model;

import com.example.demo.model.value.AuthorId;
import com.example.demo.model.value.Name;
import com.example.demo.types.RegistBook;
import java.util.List;
import com.example.demo.types.Book;

public interface BookRepository {
    List<Book> getBooksByAuthorId(AuthorId authorId);
    RegistBook registBook(AuthorId authorId, Name name);
}
