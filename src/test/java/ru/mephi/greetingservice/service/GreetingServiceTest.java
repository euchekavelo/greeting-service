package ru.mephi.greetingservice.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GreetingServiceTest {

	@Autowired
	private GreetingService greetingService;

	@Test
	void checkMessageResponseIsNotNullTest() {
		assertThat(greetingService.greet().getMessage()).isNotNull();
	}

	@Test
	void checkMessageResponseContainsStringValueTest() {
		assertThat(greetingService.greet().getMessage()).contains("Hello2, world!");
	}

	@Test
	void checkMessageResponseResultValueTest() {
		assertThat(greetingService.greet().isResult()).isTrue();
	}
}
