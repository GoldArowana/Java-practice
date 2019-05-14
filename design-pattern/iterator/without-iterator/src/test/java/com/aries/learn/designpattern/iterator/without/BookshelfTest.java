package com.aries.learn.designpattern.iterator.without;

import com.aries.learn.designpattern.iterator.without.bean.Book;
import com.aries.learn.designpattern.iterator.without.structure.SimpleArrBookshelf;
import com.aries.learn.designpattern.iterator.without.structure.TwoDimensionBookshelf;
import org.junit.Test;

public class BookshelfTest {
    @Test
    public void TestSimpleArr() {
        SimpleArrBookshelf bookshelf = new SimpleArrBookshelf(10);
        bookshelf.append(new Book("Java疯狂讲义", 120));
        bookshelf.append(new Book("Java并发编程实战", 30));
        bookshelf.append(new Book("Linux深入剖析", 60));
        bookshelf.append(new Book("高性能Mysql", 110));
        for (int i = 0; i < bookshelf.getSize(); i++) {
            System.out.println(bookshelf.getByIndex(i));
        }
    }

    @Test
    public void TestTwoDimension() {
        TwoDimensionBookshelf bookshelf = new TwoDimensionBookshelf(3, 3);
        bookshelf.append(new Book("Java疯狂讲义", 120));
        bookshelf.append(new Book("Java并发编程实战", 30));
        bookshelf.append(new Book("Linux深入剖析", 60));
        bookshelf.append(new Book("高性能Mysql", 110));
        for (int i = 0; i <= bookshelf.getCurrentRow(); i++) {
            for (int j = 0; j < bookshelf.getColSize() && i * bookshelf.getColSize() + j < bookshelf.getSize(); j++) {
                System.out.println(bookshelf.getByIndex(i, j));
            }
        }
    }
}
