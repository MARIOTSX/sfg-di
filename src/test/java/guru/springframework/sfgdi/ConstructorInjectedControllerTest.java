package guru.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
    
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp(){
    controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting(){
      System.out.println(controller.getGreeting());
    }
}