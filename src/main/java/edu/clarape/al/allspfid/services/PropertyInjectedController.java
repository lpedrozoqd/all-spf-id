package edu.clarape.al.allspfid.services;

public class PropertyInjectedController {
    public GreetingServices greetingServices;

    public String getGreeting(){
        return greetingServices.sayGreetings();
    }
}
