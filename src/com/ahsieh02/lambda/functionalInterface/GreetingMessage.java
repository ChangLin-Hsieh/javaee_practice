package com.ahsieh02.lambda.functionalInterface;

import java.lang.FunctionalInterface;


/*
FunctionalInterface is the interface with only one method
 */
@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
}


