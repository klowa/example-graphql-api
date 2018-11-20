package com.example.demo.model;

import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Author;
import com.example.demo.types.RegistAuthor;

public interface AuthorRepository {
    Author getAuthorById(Id id);
    RegistAuthor registAuthor(Name name);
}
