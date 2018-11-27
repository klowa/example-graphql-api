package com.example.demo.model;

import com.example.demo.types.RegistBookResponse;
import org.springframework.stereotype.Component;

@Component
public class RegistBookFactory {

    /**
     * create authorId, name for RegistBookResponse
     * @param authorId authorId
     * @param name name
     * @param regist regist
     * @param error error
     * @return RegistBookResponse
     */
    public RegistBookResponse create(int authorId, String name, boolean regist, String error) {
        return RegistBookResponse.builder().authorId(authorId).name(name).regist(regist).errorMessage(error).build();
    }
}
