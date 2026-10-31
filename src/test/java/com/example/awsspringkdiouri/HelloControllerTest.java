package com.example.awsspringkdiouri;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void hello_shouldReturnGreetingWithProvidedName() {
        String response = controller.hello("Alice");

        assertThat(response).isEqualTo("Hello Alice!");
    }

    @Test
    void hello_shouldReturnGreetingWithDefaultName() {
        String response = controller.hello("World");

        assertThat(response).isEqualTo("Hello World!");
    }
}

