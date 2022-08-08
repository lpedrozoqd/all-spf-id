package edu.clarape.al.allspfid.services;

public class ConstructorInjectedController {
    private final GreetingServices greetingService;

    public ConstructorInjectedController(GreetingServices greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
