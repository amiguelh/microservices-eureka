package com.mia.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hides the access to the microservice inside this local service.
 * 
 * @author amiguel
 */
@Service
public class ClientGreetingService {

	protected Logger logger = Logger.getLogger(ClientGreetingService.class.getName());

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public ClientGreetingService(){
	}

	public ClientGreetingService(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl: "http://" + serviceUrl;
	}

	/**
	 * The RestTemplate works because it uses a custom request-factory that uses
	 * Ribbon to look-up the service to use. This method simply exists to show this.
	 */
	@PostConstruct
	public void demoOnly() {
		// Can't do this in the constructor because the RestTemplate injection happens afterwards.
		logger.log (Level.WARNING, "The RestTemplate request factory is {0}", new Object[]{restTemplate.getRequestFactory()});
	}

	public Greeting greeting (String name) {
		return restTemplate.getForObject(serviceUrl + "/greeting/{name}", Greeting.class, name);
	}
	
}
