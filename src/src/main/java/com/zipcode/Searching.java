package com.zipcode;

import java.util.List;

public class Searching {

    public static String printPersonsOlderThan(List<Person> roster, int age) {

        StringBuilder sb = new StringBuilder();
        for (Person p : roster) {
            if (p.getAge() >= age) {
                sb.append(p.printPerson(p));
            }
        }
        return sb.toString();
    }

    public static String printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {

        StringBuilder sb = new StringBuilder();
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                sb.append(p.printPerson(p));
            }
        }
        return sb.toString();
    }

    public static String printPersons(
            List<Person> roster, CheckPerson tester) {
        StringBuilder sb = new StringBuilder();
        for (Person p : roster) {
            if (tester.test(p)) {
                sb.append(p.printPerson(p));
            }
        }
        return sb.toString();
    }






}
