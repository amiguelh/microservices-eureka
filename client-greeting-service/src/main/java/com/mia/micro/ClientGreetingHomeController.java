package com.mia.micro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home page controller.
 *
 * @author amiguel
 */
@Controller
public class ClientGreetingHomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}