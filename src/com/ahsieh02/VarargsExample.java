package com.ahsieh02;

import java.util.ArrayList;
import java.util.List;

public class VarargsExample {


    public static void main(String[] args) {
        //passing any number of args
        varargsExample("apple", "milk");
        varargsExample("milk", "eggs", "bananas");

        //passing String array
        String[] shoppingCarts = {"milk", "eggs", "bananas", "apple"};
        varargsExample(shoppingCarts);

        //handle List
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        String[] a = convertTo(String.class, shoppingList.toArray());
        varargsExample(a);
    }

    public static <T> T[] convertTo(Class<T> dataType, Object[] objects) {
        T[] result = (T[]) java.lang.reflect.Array.newInstance(dataType, objects.length);
        for (int i = 0; i < objects.length; i++) {
            result[i] = (T) objects[i];
        }
        return result;
    }

    public static void varargsExample(String... items) {
        System.out.println("--staring--");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("--ending--\n");
    }
}

