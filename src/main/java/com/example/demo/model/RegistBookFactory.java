package com.example.demo.model;

import com.example.demo.types.RegistBook;
import org.springframework.stereotype.Component;

@Component
public class RegistBookFactory {

    /**
     * create authorId, name for RegistBook
     * @param authorId authorId
     * @param name name
     * @param regist regist
     * @param error error
     * @return RegistBook
     */
    public RegistBook create(int authorId, String name, boolean regist, String error) {
        return RegistBook.builder().authorId(authorId).name(name).regist(regist).error(error).build();
    }
}
