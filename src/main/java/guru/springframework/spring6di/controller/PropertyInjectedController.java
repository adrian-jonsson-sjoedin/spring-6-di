package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Lest optimal way
 */
@Controller
public class PropertyInjectedController {
    //not recommended
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
