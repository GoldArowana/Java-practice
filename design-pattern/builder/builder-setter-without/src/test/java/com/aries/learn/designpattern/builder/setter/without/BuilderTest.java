package com.aries.learn.designpattern.builder.setter.without;

import org.junit.Test;

import java.util.Date;


public class BuilderTest {

    @Test
    public void test1() {
        Student student = new Student();
        student.setName("John");
        student.setAddress("CN");
        student.setAge(1);
        student.setBirthday(new Date());
        student.setHairColor("blue");
        System.out.println(student);
    }
}
