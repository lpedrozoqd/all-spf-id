package edu.clarape.al.allspfid.services;


import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    
    private final GreetingServices greetingService;

    //Ya no es necesario agregar @Autowired aquí para esta versión de SPF
    //@Autowired
    public ConstructorInjectedController(GreetingServices greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
