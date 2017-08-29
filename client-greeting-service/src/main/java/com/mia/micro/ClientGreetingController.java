package com.mia.micro;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Client controller, fetches User info from the microservice via {@link ClientGreetingService}.
 * 
 * @author amiguel
 */
@Controller
public class ClientGreetingController {

	protected Logger logger = Logger.getLogger(ClientGreetingController.class.getName());

	@Autowired
	protected ClientGreetingService helloWorldService;


	@RequestMapping("/greeting")
	public String goHome() {
		return "index";
	}
	
	@RequestMapping("/greeting/{name}")
	public String greeting(Model model, @PathVariable("name") String name) {

		logger.log (Level.INFO, "helloWorld-service greeting() invoked: {0}", new Object[]{name});
		Greeting greeting = helloWorldService.greeting(name);
		logger.log (Level.INFO, "helloWorld-service greeting() found: {0}", new Object[]{greeting.getContent()});
		model.addAttribute("greeting", greeting.getContent());
	
		return "greeting";
		
	}
	
}
