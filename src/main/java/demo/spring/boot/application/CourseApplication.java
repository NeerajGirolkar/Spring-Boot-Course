package demo.spring.boot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "demo.spring.boot")
@EnableJpaRepositories(basePackages = "demo.spring.boot.repository")
@EntityScan(basePackages = "demo.spring.boot.to")
public class CourseApplication {
	public static void main(String[] args){
		SpringApplication.run(CourseApplication.class, args);
	}	
}