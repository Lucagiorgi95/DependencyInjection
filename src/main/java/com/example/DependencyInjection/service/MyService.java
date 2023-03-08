package com.example.DependencyInjection.service;

import com.example.DependencyInjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("The constructor has been called");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("the method getName() has been called");
        return myComponent.getMyComponentName();
    }

}
