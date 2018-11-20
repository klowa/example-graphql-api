package com.example.demo.infrastructure.mapper;

import java.util.List;
import lombok.Data;

@Data
public class AuthorEntity {
    private int id;
    private String name;
    private int bookId;
    private List<BookEntity> books;
}
