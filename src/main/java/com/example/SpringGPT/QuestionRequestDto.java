package com.example.SpringGPT;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class QuestionRequestDto implements Serializable {
    private String userRequest;
    private String question;
}
