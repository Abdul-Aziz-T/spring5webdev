package a4bdul.springframework.didemo.controllers;

import a4bdul.springframework.didemo.services.GreetingService;

/**
 * Created by 4bdul on 09/06/2018 at 1:51 PM.
 */
public class GetterInjectedController {
    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}