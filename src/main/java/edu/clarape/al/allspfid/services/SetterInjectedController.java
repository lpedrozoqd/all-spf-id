package edu.clarape.al.allspfid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    
    private GreetingServices greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("constructorGreetingServicesImpl") GreetingServices greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }

}
