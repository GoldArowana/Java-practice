package com.aries.learn.designpattern.builder.setter;

import org.junit.Test;

import java.util.Date;


public class BuilderTest {

    @Test
    public void test1() {
        Student student = Student.StudentBuilder.aStudent()
                .name("John")
                .age(1)
                .birthday(new Date())
                .hairColor("red")
                .address("UK")
                .build();

        System.out.println(student);
    }
}
