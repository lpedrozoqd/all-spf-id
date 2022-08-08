package edu.clarape.al.allspfid.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServicesImpl());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
