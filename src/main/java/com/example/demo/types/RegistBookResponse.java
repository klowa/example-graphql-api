package com.example.demo.types;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegistBookResponse {
    private int authorId;
    private String name;
    private String errorMessage;
    private boolean regist;
}
