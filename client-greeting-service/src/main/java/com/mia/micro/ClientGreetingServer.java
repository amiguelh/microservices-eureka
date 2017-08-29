package com.mia.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Tests Greeting Server. Works as a microservice client, fetching data from the
 * Greeting Service. Uses the Discovery Server (Eureka) to find the microservice.
 *
 * @auth amiguel
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientGreetingServer {

	/**
	 * Run the application using Spring Boot and an embedded server engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ClientGreetingServer.class, args);
	}

}
