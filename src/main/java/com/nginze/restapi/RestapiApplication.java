package com.nginze.restapi;

import com.nginze.restapi.user.User;
import com.nginze.restapi.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}
	@GetMapping
	public List<String> hello(){
		return List.of("Hello", "World");
	}
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		return args -> {
			User jack = new User("Jack", "Kweku");
			userRepository.save(jack);
		};

	}
}
