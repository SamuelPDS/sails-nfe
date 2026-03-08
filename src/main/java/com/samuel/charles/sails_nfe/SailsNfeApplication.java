package com.samuel.charles.sails_nfe;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "Sails NFE", version = "1", description = "Nfe handler API"))
public class SailsNfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SailsNfeApplication.class, args);
	}

}
