package ca.trevorjackson.didemo.controllers;

import ca.trevorjackson.didemo.services.GreetingService;

/**
 * Created by Trevor Jackson
 * December 05, 2017
 **/
class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
