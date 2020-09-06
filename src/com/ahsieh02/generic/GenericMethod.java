package com.ahsieh02.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    static Character[] characters = {'a', 'b', 'c'};
    static Integer[] integers = {1, 2, 3};

    public static <T> List<T> arrayToList(T[] array) {
        List<T> result = new ArrayList<>();
        for(T object : array) {
            result.add(object);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Character> characterList = arrayToList(characters);
        List<Integer> integerList = arrayToList(integers);
        System.out.println(characterList);
        System.out.println(integerList);

    }
}
