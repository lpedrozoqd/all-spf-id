package edu.clarape.al.allspfid.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingServices = new ConstructorGreetingServicesImpl();
    }



    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
