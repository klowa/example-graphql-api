package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.infrastructure.BookRepositoryImpl;
import com.example.demo.model.value.AuthorId;
import com.example.demo.types.Author;
import com.example.demo.types.Book;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class BookResolver implements GraphQLResolver<Author> {
    private final BookRepositoryImpl bookRepositoryImpl;

    public List<Book> books(Author author) {
        AuthorId authorId = AuthorId.of(author.getId());
        return bookRepositoryImpl.getBooksByAuthorId(authorId);
    }
}
