package edu.clarape.al.allspfid.controller;

import org.springframework.stereotype.Controller;

import edu.clarape.al.allspfid.services.GreetingServices;

@Controller
public class MyController {

    private final GreetingServices greetingService;

    
    public MyController(GreetingServices greetingService) {
        this.greetingService = greetingService;
    }



    public String sayHello(){
        System.out.println("### " + this.greetingService.sayGreetings());
        return ">>> Hello folks!";
    }
}
