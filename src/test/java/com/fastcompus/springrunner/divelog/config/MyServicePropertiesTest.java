package com.fastcompus.springrunner.divelog.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
class MyServicePropertiesTest {

    @Test
    void test(@Autowired MyServiceProperties properties) {
        assertAll(
                () -> assertThat(properties.isEnabled()).isFalse(),
                () -> assertThat(properties.getSecurity().getUsername()).isEqualTo("juhyun"),
                () -> assertThat(properties.getSecurity().getPassword()).isEqualTo("1234")
        );
    }

}