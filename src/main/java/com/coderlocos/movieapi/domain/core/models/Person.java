package com.coderlocos.movieapi.domain.core.models;

import com.coderlocos.movieapi.domain.core.models.BaseClass;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends BaseClass {
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
