package com.aries.learn.designpattern.iterator.impl.collection;


import com.aries.learn.designpattern.iterator.impl.bean.Book;
import com.aries.learn.designpattern.iterator.impl.iter.BookIterator;
import com.aries.learn.designpattern.iterator.impl.iter.SimpleArrBookshelfIterator;

public class SimpleArrBookshelf implements Aggregate {
    private Book[] books;
    private int size;

    public SimpleArrBookshelf(int cap) {
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

    @Override
    public BookIterator iterator() {
        return new SimpleArrBookshelfIterator(this);
    }
}
