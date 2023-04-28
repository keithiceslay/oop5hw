package org.example;

public abstract class User {
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return  firstName +  " " + lastName;
    }
}
