package com.design_pattern.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("本A"));
        bookShelf.appendBook(new Book("本B"));
        bookShelf.appendBook(new Book("本C"));

        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        System.out.println();

        for(Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }
}
