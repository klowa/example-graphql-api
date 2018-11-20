package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.infrastructure.AuthorRepositoryImpl;

import com.example.demo.model.value.Id;
import com.example.demo.types.Author;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class AuthorQueryResolver implements GraphQLQueryResolver {
    private final AuthorRepositoryImpl authorRepositoryImpl;

    public Author getAuthorById(int id) {
        Id idValue = Id.of(id);
        return authorRepositoryImpl.getAuthorById(idValue);
    }
}
