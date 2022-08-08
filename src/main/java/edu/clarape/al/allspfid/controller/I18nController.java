package edu.clarape.al.allspfid.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import edu.clarape.al.allspfid.services.GreetingServices;

@Controller
public class I18nController {
    private final GreetingServices greetingServices;

    public I18nController(@Qualifier("i18nService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return this.greetingServices.sayGreetings();
    }
    
}
