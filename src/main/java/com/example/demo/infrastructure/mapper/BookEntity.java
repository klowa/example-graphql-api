package com.example.demo.infrastructure.mapper;

import lombok.Data;

@Data
public class BookEntity {
    private int id;
    private String name;
    private String authorId;
    private AuthorEntity authorEntity;
}
