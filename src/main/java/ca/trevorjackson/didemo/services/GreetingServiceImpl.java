package ca.trevorjackson.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Trevor Jackson
 * December 05, 2017
 **/
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!";

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }

}
