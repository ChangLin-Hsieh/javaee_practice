package com.ahsieh02.collection;

import java.util.LinkedHashMap;
import java.util.Map;


/*
accessOrder default is false;
 */
public class LinkedHashMapExample {

    public static void main(String[] args) {
        withoutAccessOrderExample();
        withAccessOrderExample();

    }

    public static void withoutAccessOrderExample() {
        System.out.println("---withoutAccessOrderExample start---");
        LinkedHashMap<String, Integer> phoneBookWithoutAccessOrder = new LinkedHashMap(4, 0.75F, false);
        System.out.println("size of phoneBook " + phoneBookWithoutAccessOrder.size());

        phoneBookWithoutAccessOrder.put("Kevin", 12345);
        phoneBookWithoutAccessOrder.put("Jill", 23456);
        phoneBookWithoutAccessOrder.put("Branda", 34567);
        phoneBookWithoutAccessOrder.put("Gary", 45678);
        printMap(phoneBookWithoutAccessOrder);
        System.out.println("Jill phone number is " + phoneBookWithoutAccessOrder.get("Jill"));
        printMap(phoneBookWithoutAccessOrder);
        System.out.println("---withoutAccessOrderExample end---\n");
    }

    public static void withAccessOrderExample() {
        System.out.println("---withoutAccessOrderExample start---");
        LinkedHashMap<String, Integer> phoneBookWithoutAccessOrder = new LinkedHashMap(4, 0.75F, true);
        System.out.println("size of phoneBook " + phoneBookWithoutAccessOrder.size());

        phoneBookWithoutAccessOrder.put("Kevin", 12345);
        phoneBookWithoutAccessOrder.put("Jill", 23456);
        phoneBookWithoutAccessOrder.put("Branda", 34567);
        phoneBookWithoutAccessOrder.put("Gary", 45678);
        printMap(phoneBookWithoutAccessOrder);
        System.out.println("Jill phone number is " + phoneBookWithoutAccessOrder.get("Jill"));
        System.out.println("Jill phone number is " + phoneBookWithoutAccessOrder.get("Kevin"));
        printMap(phoneBookWithoutAccessOrder);
        System.out.println("---withoutAccessOrderExample end---\n");
    }

    public static void printMap(Map<String, Integer> map) {
        System.out.println("---printMap start---");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("---printMap end---");

    }
}
