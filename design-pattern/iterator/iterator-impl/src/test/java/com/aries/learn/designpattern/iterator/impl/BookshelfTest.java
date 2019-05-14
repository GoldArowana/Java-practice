package com.aries.learn.designpattern.iterator.impl;

import com.aries.learn.designpattern.iterator.impl.bean.Book;
import com.aries.learn.designpattern.iterator.impl.collection.SimpleArrBookshelf;
import com.aries.learn.designpattern.iterator.impl.collection.TwoDimensionBookshelf;
import com.aries.learn.designpattern.iterator.impl.iter.BookIterator;
import org.junit.Test;


public class BookshelfTest {
    @Test
    public void TestSimpleArr() {
        SimpleArrBookshelf bookshelf = new SimpleArrBookshelf(10);
        bookshelf.append(new Book("Java疯狂讲义", 120));
        bookshelf.append(new Book("Java并发编程实战", 30));
        bookshelf.append(new Book("Linux深入剖析", 60));
        bookshelf.append(new Book("高性能Mysql", 110));

        for (BookIterator bookIterator = bookshelf.iterator(); bookIterator.hasNext(); ) {
            System.out.println(bookIterator.next());
        }
    }

    @Test
    public void TestTwoDimension() {
        TwoDimensionBookshelf bookshelf = new TwoDimensionBookshelf(3, 3);
        bookshelf.append(new Book("Java疯狂讲义", 120));
        bookshelf.append(new Book("Java并发编程实战", 30));
        bookshelf.append(new Book("Linux深入剖析", 60));
        bookshelf.append(new Book("高性能Mysql", 110));

        for (BookIterator bookIterator = bookshelf.iterator(); bookIterator.hasNext(); ) {
            System.out.println(bookIterator.next());
        }
    }
}
