package com.example.demo.model;

import com.example.demo.types.RegistAuthor;
import org.springframework.stereotype.Component;

@Component
public class RegistAuthorFactory {

    /**
     * create name for RegistAuthor
     * @param name name
     * @return RegistAuthor
     */
    public RegistAuthor create(String name, boolean regist, String error) {
        return RegistAuthor.builder().name(name).regist(regist).error(error).build();
    }
}
