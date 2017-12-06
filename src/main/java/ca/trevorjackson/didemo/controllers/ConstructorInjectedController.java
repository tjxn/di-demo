package ca.trevorjackson.didemo.controllers;

import ca.trevorjackson.didemo.services.GreetingService;

/**
 * Created by Trevor Jackson
 * December 05, 2017
 **/
class ConstructorInjectedController {

    private final GreetingService greetingService;

    ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
