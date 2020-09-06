package com.ahsieh02.io;

import com.ahsieh02.io.object.Person;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Enter the phone number: ");
        long phone = scanner.nextLong();
        System.out.println(new Person(name, age, phone));
        System.out.println("Enter name, age, and phone with space :");
        name = scanner.next();
        age = scanner.nextInt();
        phone = scanner.nextLong();
        System.out.println(new Person(name, age, phone));

    }
}
