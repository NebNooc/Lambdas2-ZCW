package com.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SearchingTest {

    private Person person;
    private Person person2;
    private SocialNetwork socialNetwork;

    @Before
    public void createPerson() {
        LocalDate date  = LocalDate.of(1950, 4, 12);
        LocalDate date2 = LocalDate.of(2010, 7, 21);
        person = new Person("Grandma", date, Person.Sex.FEMALE, "overDaRiverAndThruDaWoods@gmail.com");
        person2 = new Person("Red", date2, Person.Sex.FEMALE, "red.riding@gmail.com");

        socialNetwork = new SocialNetwork();
        socialNetwork.add(person);
        socialNetwork.add(person2);
    }

    @Test
    public void printPersonOlderThanTest() {
        String expected =   "Name: Grandma\n" +
                            "Birthday: 1950-04-12\n" +
                            "Gender: FEMALE\n" +
                            "Email: overDaRiverAndThruDaWoods@gmail.com\n\n";
        String actual = Searching.printPersonsOlderThan(SocialNetwork.get(), 30);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPersonsWithinAgeRangeTest() {
        String expected =   "Name: Red\n" +
                            "Birthday: 2010-07-21\n" +
                            "Gender: FEMALE\n" +
                            "Email: red.riding@gmail.com\n\n";
        String actual = Searching.printPersonsWithinAgeRange(SocialNetwork.get(), 5, 30);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPersonsTest() {
        AgeTester ageTester = new AgeTester();

        String expected =   "Name: Grandma\n" +
                            "Birthday: 1950-04-12\n" +
                            "Gender: FEMALE\n" +
                            "Email: overDaRiverAndThruDaWoods@gmail.com\n\n";
        String actual = Searching.printPersons(SocialNetwork.get(), ageTester);

        Assert.assertEquals(expected, actual);
    }
}
