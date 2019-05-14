package com.aries.learn.designpattern.iterator.impl.iter;

import com.aries.learn.designpattern.iterator.impl.collection.SimpleArrBookshelf;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SimpleArrBookshelfIterator implements BookIterator {
    @NonNull
    private SimpleArrBookshelf bookshelf;

    private int iterIndex = 0;

    @Override

    public boolean hasNext() {
        return iterIndex < bookshelf.getSize();
    }

    @Override
    public Object next() {
        return bookshelf.getByIndex(iterIndex++);
    }
}
