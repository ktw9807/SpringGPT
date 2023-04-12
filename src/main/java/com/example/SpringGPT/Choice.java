package com.example.SpringGPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Choice implements Serializable {

    private List<MessageDto> message = new ArrayList<>();
    private Integer index;
    @JsonProperty("finish_reason")
    private String finishReason;

    @Builder
    public Choice(List<MessageDto> message, Integer index, String finishReason) {
        this.message = message;
        this.index = index;
        this.finishReason = finishReason;
    }
}
