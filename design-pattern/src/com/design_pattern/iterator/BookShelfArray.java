package com.design_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelfArray implements Iterable<Book>{

    private List<Book> books;
    private int last = 0;

    public BookShelfArray() {
        books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last ++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}
