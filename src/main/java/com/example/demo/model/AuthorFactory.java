package com.example.demo.model;

import com.example.demo.infrastructure.mapper.AuthorEntity;
import org.springframework.stereotype.Component;
import com.example.demo.types.Author;

@Component
public class AuthorFactory {

    /**
     * create Author for AuthorEntity
     * @param authorEntity authorEntity
     * @return Author
     */
    public Author create(AuthorEntity authorEntity) {
        return Author.builder().id(authorEntity.getId()).name(authorEntity.getName()).build();
    }
}
