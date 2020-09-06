package com.ahsieh02.stream.object;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookList = new ArrayList<>();

    public Library addBook(Book book) {
        bookList.add(book);
        return this;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
