package com.alab.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {ServiceConfig.class })
public class SpringAppRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppRestApplication.class, args);
	}
}
