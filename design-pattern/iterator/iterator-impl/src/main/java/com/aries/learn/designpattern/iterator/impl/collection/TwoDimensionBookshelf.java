package com.aries.learn.designpattern.iterator.impl.collection;

import com.aries.learn.designpattern.iterator.impl.bean.Book;
import com.aries.learn.designpattern.iterator.impl.iter.BookIterator;
import com.aries.learn.designpattern.iterator.impl.iter.TwoDimensionBookshelfIterator;
import lombok.Getter;

@Getter
public class TwoDimensionBookshelf implements Aggregate{
    private Book[][] books;
    private final int rowSize;
    private final int colSize;

    private int currentCol;
    private int currentRow;

    public TwoDimensionBookshelf(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        this.books = new Book[rowSize][colSize];
        currentCol = 0;
        currentRow = 0;
    }

    public Book getByIndex(int row, int col) {
        return books[row][col];
    }

    public void append(Book book) {
        if (currentCol < colSize) {
            this.books[currentRow][currentCol++] = book;
        } else if (currentRow < rowSize) {
            currentCol = 1;
            this.books[++currentRow][0] = book;
        } else {
            throw new RuntimeException("书架满啦");
        }
    }

    public int getSize() {
        return currentRow * colSize + currentCol;
    }

    public int getCap() {
        return rowSize * colSize;
    }

    @Override
    public BookIterator iterator() {
        return new TwoDimensionBookshelfIterator(this);
    }
}
