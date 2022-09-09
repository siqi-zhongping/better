package com.discipline.better;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(" com.discipline.better.mapper")
public class BetterApplication {
	public static void main(String[] args) {
		SpringApplication.run(BetterApplication.class, args);
	}
}
