package com.example.rvtest.data;

import java.util.ArrayList;

public class DAOPerson {
    private static DAOPerson INSTANCE = new DAOPerson();
    private ArrayList<Person> people;

    private DAOPerson () {
        this.people = new ArrayList<Person>();
    }

    public static DAOPerson getINSTANCE() {
        return INSTANCE;
    }

    public void addPerson(Person p) {
        this.people.add(p);
    }

    public ArrayList<Person> getPeople() {
        return this.people;
    }
}
