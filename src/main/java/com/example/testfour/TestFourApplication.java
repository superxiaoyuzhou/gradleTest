package com.example.testfour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.testfour.mapper")
public class TestFourApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestFourApplication.class, args);
	}

}

