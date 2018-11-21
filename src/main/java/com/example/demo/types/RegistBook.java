package com.example.demo.types;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegistBook {
    private int authorId;
    private String name;
    private String error;
    private boolean regist;
}
