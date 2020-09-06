package com.ahsieh02.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathClassModifyFileExample {
    public static void main(String[] args) {
        Path exitFile = Paths.get("/Users/changlinhsieh/Developer/javaee_practice/src/com/ahsieh02/io/ReadingFile.txt");
        System.out.println(exitFile.getParent());
        System.out.println(exitFile.getRoot());
        System.out.println(exitFile.getFileName());
        System.out.println(exitFile.getFileSystem());

        Path newFilePath = Paths.get("src/new.txt");
        try {
            Files.copy(exitFile, newFilePath, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(exitFile, newFilePath);
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        }

        try {
            Boolean result = Files.deleteIfExists(newFilePath);
            System.out.println("delete result " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}