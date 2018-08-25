package ru.webblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WebblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebblogApplication.class, args);
	}
}
