package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ApiApplication {

	 @Value("${spring.profiles.active}")
  	 private String activeProfile;
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
