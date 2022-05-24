package com.bosonit.BS3;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Arrays;


@SpringBootApplication
public class Bs3Application {

	public static void main(String[] args) {

		SpringApplication.run(Bs3Application.class, args);
	}

	@PostConstruct
	public void inicial(){
		System.out.println("Hola desde clase inicial");
	}

	@Bean
	CommandLineRunner segunda(){
		return p ->
		{ System.out.println("Hola desde clase secundaria");
		};
	}

	@Bean
	CommandLineRunner tercera(){
		return p ->
		{ System.out.println("Soy la tercera clase");
		};
	}

	@Bean
	CommandLineRunner terceraconparametros(){
		return new Tercera();
	}


}
