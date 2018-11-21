package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.infrastructure.AuthorRepositoryImpl;
import com.example.demo.infrastructure.BookRepositoryImpl;
import com.example.demo.model.value.AuthorId;
import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Author;
import com.example.demo.types.RegistBook;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class BookMutationResolver implements GraphQLMutationResolver {
    private final BookRepositoryImpl bookRepositoryImpl;
    private final AuthorRepositoryImpl authorRepositoryImpl;

    public RegistBook registBook(String authorId, String name) throws Exception {
        // 存在チェック
        Id id = Id.of(Integer.valueOf(authorId));
        Author author = authorRepositoryImpl.getAuthorById(id);
        if (Objects.isNull(author)) {
            throw new Exception("not find author. authorId:" + authorId);
        }

        AuthorId authorIdValue = AuthorId.of(Integer.valueOf(authorId));
        Name nameValue = Name.of(name);

        return bookRepositoryImpl.registBook(authorIdValue, nameValue);
    }
}
