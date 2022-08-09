package edu.clarape.al.allspfid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.clarape.al.allspfid.services.ConstructorGreetingServicesImpl;



@Configuration 
public class GreetingServicesConfig {

    @Bean
    ConstructorGreetingServicesImpl constructorGreetingServicesImpl() {
        return new ConstructorGreetingServicesImpl();
    }
    
}
 