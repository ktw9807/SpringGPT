package com.example.SpringGPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Data
@NoArgsConstructor
public class Choice {
    private MessageDto message;
    private String finish_reason;
    private int index;

    // 생성자, getter, setter 등 생략

    // Inner class for MessageDto

}
