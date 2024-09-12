package org.LLD.PrototypeDesign;

import java.util.Objects;

public class Student implements Prototype {
    int age;
    private int rollNumber;
    String name;


    Student() {

    }

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }


    @Override
    public Prototype clone() {
        return new Student(age, rollNumber, name);
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof final Student student)) return false;
        return age == student.age && rollNumber == student.rollNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, rollNumber, name);
    }
}
