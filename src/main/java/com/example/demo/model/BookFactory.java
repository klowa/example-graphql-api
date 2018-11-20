package com.example.demo.model;

import com.example.demo.infrastructure.mapper.BookEntity;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import com.example.demo.types.Book;

@Component
@AllArgsConstructor
public class BookFactory {

    /**
     * create Books for BookEntities
     * @param bookEntities bookEntities
     * @return Books
     */
    public List<Book> create(List<BookEntity> bookEntities) {
        List<Book> books = new ArrayList<>();
        for (BookEntity bookEntity : bookEntities) {
            Book book = Book.builder().id(bookEntity.getId()).authorId(bookEntity.getAuthorId()).name(bookEntity.getName()).build();
            books.add(book);
        }

        return books;
    }
}
