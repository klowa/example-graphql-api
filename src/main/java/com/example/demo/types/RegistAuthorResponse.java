package com.example.demo.types;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegistAuthorResponse {
    private String name;
    private String errorMessage;
    private boolean regist;
}
