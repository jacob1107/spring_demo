package com.spring.jacob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJacobApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringJacobApplication.class);

	public static void main(String[] args) {
		int i =1/0;
		int o=0;
		System.err.println(i);
		SpringApplication.run(SpringJacobApplication.class, args);
	}

	@RequestMapping("/say")
	public String say() {
		log.info("========================={}", Math.random());
		return String.valueOf(Math.random());

	}
}
