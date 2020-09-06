package com.ahsieh02.io.object;

public class Person {
    private final String name;
    private final int age;
    private final long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
