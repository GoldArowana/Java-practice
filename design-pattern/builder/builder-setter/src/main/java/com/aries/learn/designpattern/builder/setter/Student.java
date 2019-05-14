package com.aries.learn.designpattern.builder.setter;

import lombok.ToString;

import java.util.Date;

@ToString
public class Student {
    private String name;
    private int age;
    private String hairColor;
    private Date birthday;
    private String address;

    public static final class StudentBuilder {
        private String name;
        private int age;
        private String hairColor;
        private Date birthday;
        private String address;

        private StudentBuilder() {
        }

        public static StudentBuilder aStudent() {
            return new StudentBuilder();
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder hairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public StudentBuilder birthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.hairColor = this.hairColor;
            student.birthday = this.birthday;
            student.address = this.address;
            student.name = this.name;
            student.age = this.age;
            return student;
        }
    }
}
