package com.aries.learn.designpattern.builder.setter.without;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private String name;
    private int age;
    private String hairColor;
    private Date birthday;
    private String address;
}
