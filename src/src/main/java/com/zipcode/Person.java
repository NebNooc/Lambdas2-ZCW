package com.zipcode;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String email;

    public Person(String name, LocalDate birthday, Sex gender, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public Sex getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String printPerson(Person person) {
        return  "Name: " + getName() + "\n" +
                "Birthday: " + getBirthday() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Email: " + getEmail();
    }

}
