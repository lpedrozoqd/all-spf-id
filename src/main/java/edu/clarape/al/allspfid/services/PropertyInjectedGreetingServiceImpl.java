package edu.clarape.al.allspfid.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingServices{

    @Override
    public String sayGreetings() {
        return "Hello world-property";
    }
    
}
