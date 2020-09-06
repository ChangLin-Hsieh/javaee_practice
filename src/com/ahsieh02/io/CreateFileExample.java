package com.ahsieh02.io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) {
        File file = new File("src/hello.txt");
        try {
            Boolean result = file.createNewFile();
            System.out.println("result " + result);
            System.out.println("file path "  +file.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
