package com.example.demo.model.value;

import lombok.Value;

@Value(staticConstructor = "of")
public class AuthorId {
    private int value;

    public String toString() {
        return String.valueOf(value);
    }
}
