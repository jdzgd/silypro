package com.gk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gk.repository")
@SpringBootApplication()
public class SilySysWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SilySysWebApplication.class, args);
    }
}
