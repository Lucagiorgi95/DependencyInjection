package com.example.DependencyInjection.components;


import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        this.myComponentName = "Luca Giorgi";
    }

    public String getMyComponentName(){
        System.out.println("the method getMyComponentName() has been called");
        return myComponentName;
    }

}
