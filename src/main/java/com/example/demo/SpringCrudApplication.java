package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCrudApplication {

	//echo "# GitHubPractice" >> README.md
	//git init
	//git add README.md
	//git commit -m "first commit"
	//git branch -M main
	//git remote add origin https://github.com/Sreelekha01/GitHubPractice.git
	//git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);
	}

}
