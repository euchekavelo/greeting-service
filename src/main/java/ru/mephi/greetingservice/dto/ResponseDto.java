package ru.mephi.greetingservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {

    private String message;
    private boolean result;
}
