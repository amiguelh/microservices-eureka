# Implementing microservices with Spring Boot and Eureka

### 1. Introduction
The projects consists of a multi-tier modular Maven project that implements three microservices with Spring Boot:
- **Registration service**: Starts a Eureka server
- **Greeting service**: Service thay says hello
- **Client for Greeting service**: Client for Greeting service

When the client wants to call the Greeting service, first asks Eureka server to discover the service endpoint.

### 2. Technological environment
- Java 1.8
- Maven 3
- Spring 4:  Spring Boot, Spring Cloud

### 3. Architecture

- **Web layer**: Spring MVC (REST API)
- **Service layer**: Spring
- **Boot**: Spring Boot

### 5. Installation

Run the following command to boot the application with Spring Boot:

	$ run.bat

Click here [http://localhost:3333](http://localhost:3333) to access the demo.

Other links:

* Eureka console: [http://localhost:1111](http://localhost:1111)
* Call to Greeting service, directly: [http://localhost:2222/greeting/Hugo](http://localhost:2222/greeting/Hugo)
* Client demo page: [http://localhost:3333](http://localhost:3333)
* Call to client: [http://localhost:3333/greeting/Rob](http://localhost:3333/greeting/Rob)