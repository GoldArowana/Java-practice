package com.aries.learn.designpattern.prototype.without;


import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class Performance implements Product {
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
}
