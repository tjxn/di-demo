package ca.trevorjackson.didemo.controllers;

import ca.trevorjackson.didemo.services.GreetingServiceImpl;

/**
 * Created by Trevor Jackson
 * December 05, 2017
 **/
class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
