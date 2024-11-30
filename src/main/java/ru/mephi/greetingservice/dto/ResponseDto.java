package ru.mephi.greetingservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {

    public String message;
    public boolean result;
}
