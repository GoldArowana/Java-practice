package com.aries.learn.designpattern.iterator.impl.iter;

import com.aries.learn.designpattern.iterator.impl.bean.Book;
import com.aries.learn.designpattern.iterator.impl.collection.TwoDimensionBookshelf;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwoDimensionBookshelfIterator implements BookIterator {
    @NonNull
    private TwoDimensionBookshelf bookshelf;

    private int iterIndex = 0;


    @Override
    public boolean hasNext() {
        return iterIndex < bookshelf.getSize();
    }

    @Override
    public Object next() {
        int i = iterIndex / bookshelf.getColSize();
        int j = iterIndex % bookshelf.getColSize();
        Book book = bookshelf.getByIndex(i, j);
        iterIndex++;
        return book;
    }
}
