package com.ahsieh02.io;

import java.io.File;
import java.io.FilenameFilter;

public class CreateAndFilterDirectoriesExample {

    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains("g");
        };

        String[] contents = new File(".").list(filter);
        for (String content : contents) {
            System.out.println(content);
        }
        new File("example").mkdir();
    }
}