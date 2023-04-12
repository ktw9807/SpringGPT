package com.example.SpringGPT;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MessageDto {
    private String role;
    private String content;

    public MessageDto(String content) {
        this.role = "user";
        this.content = content;
    }
}
