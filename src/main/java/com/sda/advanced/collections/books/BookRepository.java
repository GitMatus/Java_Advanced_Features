package com.sda.advanced.collections.books;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    List<Book> list = new ArrayList<>();

    public void addBook (Book book){
        list.add(book);
    }

    public void removeBook (Book book){
        list.remove(book);
    }



}
