package com.example.categorie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CategorieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategorieApplication.class, args);
	}

}
