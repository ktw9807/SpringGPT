package com.example.SpringGPT;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Usage {
    private int prompt_tokens;
    private int completion_tokens;
    private int total_tokens;
}
