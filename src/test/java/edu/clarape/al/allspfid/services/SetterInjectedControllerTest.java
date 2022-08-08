package edu.clarape.al.allspfid.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {

    SetterInjectedController controller;
    

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingServicesImpl());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
