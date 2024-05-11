package com.ulasgultekin.LibraryManagementProject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="Library app",version = "1.0",description = "Library app"))
public class LibraryManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementProjectApplication.class, args);
	}
	
}
