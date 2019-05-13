package com.aries.learn.designpattern.iterator.without.structure;

import com.aries.learn.designpattern.iterator.without.bean.Book;


public class SimpleArrBookShelf {
    private Book[] books;
    private int size;

    public SimpleArrBookShelf(int cap) {
        books = new Book[cap];
        size = 0;
    }

    public Book getByIndex(int index) {
        return books[index];
    }

    public void append(Book book) {
        if (size >= books.length) {
            throw new RuntimeException("书架满啦");
        }
        books[size++] = book;
    }

    public int getSize() {
        return size;
    }

    public int getCap() {
        return books.length;
    }
}
