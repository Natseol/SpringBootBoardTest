package com.java4.jdbctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class JdbcTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcTestApplication.class, args);
	}
	
	@GetMapping("/")
	public String testWeb() {
		return "index";
	}

}

