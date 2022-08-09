package edu.clarape.al.allspfv2id.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.clarape.al.allspfv2id.services.GreetingServicesV2;

@Controller
public class MyControllerV2 {
    @Autowired
    private final GreetingServicesV2 greetingService;

    public MyControllerV2(GreetingServicesV2 greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.sayGreetings();
    }
}
