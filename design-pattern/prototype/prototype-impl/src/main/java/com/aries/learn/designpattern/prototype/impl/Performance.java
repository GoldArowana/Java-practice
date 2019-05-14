package com.aries.learn.designpattern.prototype.impl;


import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class Performance implements Perform {
    @NonNull
    String title;
    @NonNull
    String type;
    @NonNull
    String author;

    @Override
    public void showWith(String partner) {
        System.out.println("标题:" + title);
        System.out.println("类型:" + type);
        System.out.println("作者:" + author);
        System.out.println("搭档:" + partner + "\n");
    }

    @Override
    public Perform createClone() {
        try {
            return (Perform) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Product clone失败" + e);
        }
    }
}
