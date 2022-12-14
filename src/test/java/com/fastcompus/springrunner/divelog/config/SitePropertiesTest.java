package com.fastcompus.springrunner.divelog.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SitePropertiesTest {

    @Test
    void test(@Autowired SiteProperties properties) {
        assertThat(properties.getAuthorName()).isEqualTo("JuHyun-local");
        assertThat(properties.getAuthorEmail()).isEqualTo("a.local@a.com");
    }

}