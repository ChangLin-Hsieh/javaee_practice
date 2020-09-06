package com.ahsieh02.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

    public static void main(String[] args) {
        withoutGenericsList();
        withGenericsList();
    }


    public static void withoutGenericsList() {
        //without generics, the list can put any type of object
        List person = new ArrayList();
        person.add("Kelly");
        person.add(20);
        String name = (String) person.get(0);
        Integer age = (Integer) person.get(1);
        System.out.println(name + "'s age is " + age);
    }

    public static void withGenericsList() {
        List<String> person = new ArrayList();
        person.add("Kelly");
        //cannot put Integer
        person.add("20");
        //Dont need cast to String
        String name = person.get(0);
        String age = person.get(1);
        System.out.println(name + "'s age is " + age);
    }
}
