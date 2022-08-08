package edu.clarape.al.allspfid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServices greetingServices;

    public String getGreeting(){
        return greetingServices.sayGreetings();
    }
}
