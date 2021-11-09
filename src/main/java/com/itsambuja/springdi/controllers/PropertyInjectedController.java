package com.itsambuja.springdi.controllers;

import com.itsambuja.springdi.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
