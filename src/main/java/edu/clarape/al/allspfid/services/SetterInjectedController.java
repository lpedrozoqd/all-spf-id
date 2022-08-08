package edu.clarape.al.allspfid.services;

public class SetterInjectedController {
    private GreetingServices greetingService;

    public void setGreetingService(GreetingServices greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }

}
