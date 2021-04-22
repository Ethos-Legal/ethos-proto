package com.ethos.legal;

import com.ethos.legal.Models.JobPost;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class LegalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalApplication.class, args);
	}


//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//			JobPost jobPost = new JobPost("legal-Auditor",(), SimpleDateFormat datePosted, String description, String serviceType)
//		}
//	}

}
