package com.zipcode;

import java.util.List;

public class Searching {

    public static String printPersonsOlderThan(List<Person> roster, int age) {

        StringBuilder s = new StringBuilder();
        for (Person p : roster) {
            if (p.getAge() >= age) {
                s.append(p.getName()).append("\n");
            }
        }
        return s.toString();
    }

    public static String printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {

        StringBuilder s = new StringBuilder();
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                s.append(p).append("\n");
            }
        }
        return s.toString();
    }




}
