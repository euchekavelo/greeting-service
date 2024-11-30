package ru.mephi.greetingservice.service.impl;

import org.springframework.stereotype.Service;
import ru.mephi.greetingservice.dto.ResponseDto;
import ru.mephi.greetingservice.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public ResponseDto greet() {
        return ResponseDto.builder()
                .message("Hello world!")
                .result(true)
                .build();
    }
}
