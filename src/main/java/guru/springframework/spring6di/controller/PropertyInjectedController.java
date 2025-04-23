package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingService;

/**
 * Lest optimal way
 */
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
