package com.student.rest;

// import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRestExampleApplication {

	public static void main(String[] args) {
		// Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/mysampl2", "postgres", "password").load();
		// flyway.migrate();
		SpringApplication.run(StudentRestExampleApplication.class, args);
	}

}
