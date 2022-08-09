package edu.clarape.al.allspfid.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.clarape.al.allspfid.services.ConstructorGreetingServicesImpl;
import edu.clarape.al.allspfid.services.MyDS;


@PropertySource("classpath:datasource.properties")
@Configuration 
public class GreetingServicesConfig {

    @Bean
    ConstructorGreetingServicesImpl constructorGreetingServicesImpl() {
        return new ConstructorGreetingServicesImpl();
    }

    @Bean
    MyDS myDS(@Value("${ds.user}")String username,
            @Value("${ds.passw}")String password,
            @Value("${ds.urlJDBC}")String urlJDBC){
        MyDS myDS = new MyDS();
        myDS.setUser(username);
        myDS.setPassw(password);
        myDS.setUrlJDBC(urlJDBC);                
        return myDS; 
    }

    
}
 