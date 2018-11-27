package com.example.demo.infrastructure;

import com.example.demo.infrastructure.mapper.AuthorMapper;
import com.example.demo.model.AuthorFactory;
import com.example.demo.model.AuthorRepository;
import com.example.demo.model.RegistAuthorFactory;
import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Author;
import com.example.demo.types.RegistAuthorResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class AuthorRepositoryImpl implements AuthorRepository {
    private final AuthorMapper authorMapper;
    private final AuthorFactory authorFactory;
    private final RegistAuthorFactory registAuthorFactory;

    @Override
    public Author getAuthorById(Id id) {
        return authorFactory.create(authorMapper.getAuthorById(id.getValue()));
    }

    @Override
    public RegistAuthorResponse registAuthor(Name name) {
        boolean isRegist = true;
        String errorMessage = null;
        try {
            authorMapper.registAuthor(name.getValue());
        } catch (Exception ex) {
            isRegist = false;
            errorMessage = ex.getMessage();
        }

        return registAuthorFactory.create(name.getValue(), isRegist, errorMessage);

    }
}
