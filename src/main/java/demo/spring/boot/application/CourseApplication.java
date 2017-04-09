package demo.spring.boot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "demo.spring.boot")
public class CourseApplication {
	public static void main(String[] args){
		SpringApplication.run(CourseApplication.class, args);
	}	
}