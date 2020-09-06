package com.ahsieh02.lambda.Implement;


import com.ahsieh02.lambda.functionalInterface.GreetingMessage;

/*
lambda is easies way to implement FunctionalInterface
 */
public class GreetingMessageImplement {

    public static void main(String[] args) {
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("hello " + name);
            }
        };

        greetingMessage.greet("Jeff");

        //implement Greeting message by lambda
        GreetingMessage greetingMessageWithLambda = (String name) -> {
            System.out.println("hello " + name);
        };
        greetingMessageWithLambda.greet("Richard");

    }
}
