package com.mia.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.logging.Logger;

/**
 * Run as a micro-service, registering with the Discovery Server (Eureka).
 * 
 * @author amiguel
 */
@EnableAutoConfiguration //defines this as a Spring Boot application
@EnableDiscoveryClient //this enables service registration and discovery. In this case, this process registers itself with the discovery-server service using its application name 
@SpringBootApplication
public class GreetingServer {

	protected Logger logger = Logger.getLogger(GreetingServer.class.getName());

	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args Program arguments - ignored.
	 *	
	 */
	public static void main(String[] args) {
		SpringApplication.run(GreetingServer.class, args);
	}
	
}

