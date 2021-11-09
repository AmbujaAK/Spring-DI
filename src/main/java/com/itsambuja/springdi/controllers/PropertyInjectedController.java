package com.itsambuja.springdi.controllers;

import com.itsambuja.springdi.services.ConstructorGreetingService;
import com.itsambuja.springdi.services.PropertyInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public PropertyInjectedGreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
