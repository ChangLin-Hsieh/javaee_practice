package com.ahsieh02;

public class CreateInnerClassInstanceExample {

    public class Inner {

    }


    public static void main(String[] args) {
        CreateInnerClassInstanceExample outer = new CreateInnerClassInstanceExample();
        Inner inner = outer.new Inner();
    }
}
