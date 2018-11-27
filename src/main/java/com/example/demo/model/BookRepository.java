package com.example.demo.model;

import com.example.demo.model.value.AuthorId;
import com.example.demo.model.value.Name;
import com.example.demo.types.RegistBookResponse;
import java.util.List;
import com.example.demo.types.Book;

public interface BookRepository {
    List<Book> getBooksByAuthorId(AuthorId authorId);
    RegistBookResponse registBook(AuthorId authorId, Name name);
}
