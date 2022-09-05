package com.fastcompus.springrunner.divelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트 탐색지점 & 자동구성 활성화
public class DiveLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiveLogApplication.class, args); // 스프링 부트 애플리케이션 구동지점
    }

}
