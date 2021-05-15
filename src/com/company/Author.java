package com.company;

public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
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

    public String toString() {
        String name = getFirstName();
        String surname = getLastName();
        return name + " " + surname;

    }


}