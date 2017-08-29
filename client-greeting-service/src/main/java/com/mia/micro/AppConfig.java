package com.mia.micro;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author amiguel
 */
@Configuration
public class AppConfig {

    /**
     * URL uses the logical name of user-service - upper or lower case,
     * doesn't matter.
     */
    public static final String SERVICE_URL = "http://GREETING-SERVICE";

    /**
     * A customized RestTemplate that has the ribbon load balancer build in.
     * Note that prior to the "Brixton"
     *
     * @return
     */
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * The ClientGreetingService encapsulates the interaction with the micro-service.
     *
     * @return A new service instance.
     */
    @Bean
    public ClientGreetingService helloWorldService() {
        return new ClientGreetingService(SERVICE_URL);
    }

}
