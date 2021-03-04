package com.oancea.prog;

import lombok.Data;

@Data
public class Person {
    private final String name;
    private final Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
