package com.ahsieh02.collection;

import com.ahsieh02.collection.object.Customer;

import java.util.LinkedList;

/*
Linked list is better performance for manipulation
however, it will take more space than array list due to double link.
 */
public class LinkedListExample {

    public static void main(String[] args) {
        basicLinkedListExample();
        LinedListAsQueue();
    }

    private static void basicLinkedListExample() {
        System.out.println("---start basicLinkedListExample---");

        LinkedList<String> myList = new LinkedList<>();
        myList.add("a");
        myList.add("b");

        myList.add(1, "c");

        System.out.println(myList);
        myList.remove("b");
        System.out.println(myList);
        System.out.println("---end basicLinkedListExample---\n");
    }

    private static void LinedListAsQueue() {
        System.out.println("---start LinedListAsQueue---");

        LinkedList<Customer> queue = new LinkedList();
        register(queue, "Jeff");
        register(queue, "Richard");
        register(queue, "Fred");
        System.out.println(queue);
        serverCustomer(queue);
        System.out.println(queue);
        System.out.println("---end LinedListAsQueue---\n");

    }

    static void register(LinkedList<Customer> customerList, String name) {
        customerList.add(new Customer(name));
    }

    static void serverCustomer(LinkedList<Customer> queue) {
        //get and remove first customer
        Customer customer = queue.poll();
        customer.serve();
    }
}
