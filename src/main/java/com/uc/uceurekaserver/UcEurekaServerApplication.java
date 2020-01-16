package com.uc.uceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UcEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcEurekaServerApplication.class, args);
	}

}
