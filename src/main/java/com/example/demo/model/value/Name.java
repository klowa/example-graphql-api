package com.example.demo.model.value;

import lombok.Value;

@Value(staticConstructor = "of")
public class Name {
    private String value;

    public String toString() {
        return value;
    }
}
