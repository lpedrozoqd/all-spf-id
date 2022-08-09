package edu.clarape.al.allspfv2id.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServicesImplV2 implements GreetingServicesV2{

    @Override
    public String sayGreetings() {
        return "Hello world-ConstructorGreetingServicesImplV2";
    }
    
}
