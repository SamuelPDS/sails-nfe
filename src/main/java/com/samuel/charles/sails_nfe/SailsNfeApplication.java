package com.samuel.charles.sails_nfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SailsNfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SailsNfeApplication.class, args);
	}

}
