package com.ahsieh02.stream;

import com.ahsieh02.stream.object.Book;
import com.ahsieh02.stream.object.Library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("In Search of Lost Time", "Marcel Proust"))
                .addBook(new Book("Ulysses", "James Joyce"))
                .addBook(new Book("Don Quixote", "Miguel de Cervantes"))
                .addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));


        library.getBookList().stream()
                .filter((book -> {
                    return book.getAuthor().startsWith("M");
                }))
                .filter(Main::getTitleWithD)
                .forEach(System.out::println);


        library.getBookList().parallelStream()
                .filter((book -> {
                    return book.getAuthor().startsWith("M");
                }))
                .filter(Main::getTitleWithD)
                .forEach(System.out::println);
    }

    private static Boolean getTitleWithD(Book book) {
        return book.getTitle().startsWith("D");
    }
}
