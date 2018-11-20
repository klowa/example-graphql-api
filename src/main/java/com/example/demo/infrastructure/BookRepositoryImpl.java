package com.example.demo.infrastructure;

import com.example.demo.infrastructure.mapper.BookMapper;
import com.example.demo.model.BookFactory;
import com.example.demo.model.BookRepository;
import com.example.demo.model.value.AuthorId;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.demo.types.Book;

@Component
@AllArgsConstructor
@Slf4j
public class BookRepositoryImpl implements BookRepository {
    private final BookFactory bookFactory;
    private final BookMapper bookMapper;

    @Override
    public List<Book> getBooksByAuthorId(AuthorId authorId) {
        return bookFactory.create(bookMapper.getBooksByAuthorId(authorId.getValue()));
    }
}
