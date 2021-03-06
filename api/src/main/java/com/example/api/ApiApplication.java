package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@SpringBootApplication
public class ApiApplication {

	@Value("${spring.profiles.active:release}")
	private String activeProfile;

	private static final Logger log = LoggerFactory.getLogger(ApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void stopAplicationAfterSuccessfulStartup() {
		log.info("Profile:::: " + activeProfile);
		if (activeProfile.equals("ci")) {
			log.info("Aplicação em modo CI/CD");
			log.info("Aplicação iniciada com sucesso");
			log.info("Encerrando...");
			System.exit(0);
		}
	}

}
