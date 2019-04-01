package com.example.rvtest.data;

public class Person {
    private String name;
    private String lastName;
    private String email;
    private int age;
    private String ssn;

    public Person(String name, String lastName, String email, int age, String ssn) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }
}
