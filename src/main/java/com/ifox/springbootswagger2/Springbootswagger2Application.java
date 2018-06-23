package com.ifox.springbootswagger2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ifox.springbootswagger2example.mybatis.mapper")
public class Springbootswagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootswagger2Application.class, args);
	}
}
