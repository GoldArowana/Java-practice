package com.aries.learn.designpattern.iterator.without;

import com.aries.learn.designpattern.iterator.without.bean.Book;
import com.aries.learn.designpattern.iterator.without.structure.SimpleArrBookShelf;
import com.aries.learn.designpattern.iterator.without.structure.TwoDimensionBookShelf;
import org.junit.Test;

public class AppTest {
    @Test
    public void TestSimpleArr() {
        SimpleArrBookShelf bookShelf = new SimpleArrBookShelf(10);
        bookShelf.append(new Book("Java疯狂讲义", 120));
        bookShelf.append(new Book("Java并发编程实战", 30));
        bookShelf.append(new Book("Linux深入剖析", 60));
        bookShelf.append(new Book("高性能Mysql", 110));
        for (int i = 0; i < bookShelf.getSize(); i++) {
            System.out.println(bookShelf.getByIndex(i));
        }
    }

    @Test
    public void TestTwoDimension() {
        TwoDimensionBookShelf bookShelf = new TwoDimensionBookShelf(3, 3);
        bookShelf.append(new Book("Java疯狂讲义", 120));
        bookShelf.append(new Book("Java并发编程实战", 30));
        bookShelf.append(new Book("Linux深入剖析", 60));
        bookShelf.append(new Book("高性能Mysql", 110));
        for (int i = 0; i <= bookShelf.getCurrentRow(); i++) {
            for (int j = 0; j < bookShelf.getColSize() && i * bookShelf.getColSize() + j < bookShelf.getSize(); j++) {
                System.out.println(bookShelf.getByIndex(i, j));
            }
        }
    }
}
