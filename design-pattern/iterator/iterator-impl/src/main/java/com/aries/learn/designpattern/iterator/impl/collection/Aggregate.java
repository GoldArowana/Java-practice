package com.aries.learn.designpattern.iterator.impl.collection;

import com.aries.learn.designpattern.iterator.impl.iter.BookIterator;

public interface Aggregate {
    BookIterator iterator();
}
