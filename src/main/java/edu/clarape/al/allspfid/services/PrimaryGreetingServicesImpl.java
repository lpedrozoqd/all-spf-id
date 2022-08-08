package edu.clarape.al.allspfid.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary: permite que sea establecido como el bean primario
@Primary
@Service
public class PrimaryGreetingServicesImpl implements GreetingServices{

    @Override
    public String sayGreetings() {
       
        return "Hello world-PrimaryGreetingServicesImpl";
    }
    
}
