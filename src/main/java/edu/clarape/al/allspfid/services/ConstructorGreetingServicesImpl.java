package edu.clarape.al.allspfid.services;

//Se remueve la anotación @Service dado que esta clase se anexa como bean en la
//clase GreetingServiceConfig
public class ConstructorGreetingServicesImpl implements GreetingServices {

    @Override
    public String sayGreetings() {
        return "Hello world-constructor!";
    } 
    
}
