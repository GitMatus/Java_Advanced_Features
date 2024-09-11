package com.sda.advanced.collections.CollectionsTask2and4;

import java.util.List;

public class BookService {
    private List<Book> bookList;

    public void add(Book book) {
        bookList.add(book);
    }

    public void remove(Book book) {
        bookList.remove(book);
    }

    public List<Book> list() {
        return bookList;
    }

//    public List<Book> fantasyList(String genre) {
//
//    }


}
