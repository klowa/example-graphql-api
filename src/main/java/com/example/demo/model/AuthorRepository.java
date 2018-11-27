package com.example.demo.model;

import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Author;
import com.example.demo.types.RegistAuthorResponse;

public interface AuthorRepository {
    Author getAuthorById(Id id);
    RegistAuthorResponse registAuthor(Name name);
}
