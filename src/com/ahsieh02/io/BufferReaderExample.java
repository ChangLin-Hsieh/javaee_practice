package com.ahsieh02.io;

import java.io.*;

public class BufferReaderExample {

    public static void main(String[] args) {
        File file = new File("src/com/ahsieh02/io/ReadingFile.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while (null != (line = reader.readLine())) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
