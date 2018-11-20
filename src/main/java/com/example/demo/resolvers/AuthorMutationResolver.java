package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.infrastructure.AuthorRepositoryImpl;
import com.example.demo.model.value.Name;
import com.example.demo.types.RegistAuthor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class AuthorMutationResolver implements GraphQLMutationResolver {
    private final AuthorRepositoryImpl authorRepositoryImpl;

    public RegistAuthor registAuthor(String name) {
        Name nameValue = Name.of(name);
        return authorRepositoryImpl.registAuthor(nameValue);
    }
}
