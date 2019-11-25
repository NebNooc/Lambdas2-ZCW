package com.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class PersonTest {

    private Person person;
    private Person person2;

    @Before
    public void createPerson() {
        LocalDate date  = LocalDate.of(1950, 4, 12);
        LocalDate date2 = LocalDate.of(2010, 7, 21);
        person = new Person("Grandma", date, Person.Sex.FEMALE, "overDaRiverAndThruDaWoods@gmail.com");
        person2 = new Person("Red", date2, Person.Sex.FEMALE, "red.riding@gmail.com");
    }

    @Test
    public void setterTest() {
        LocalDate date3 = LocalDate.of(1200, 2, 29);
        person.setName("Wolf");
        person.setBirthday(date3);
        person.setGender(Person.Sex.MALE);
        person.setEmail("theRealGrandma@gmail.com");

        String actual = person.printPerson(person);
        String expected =   "Name: Wolf\n" +
                            "Birthday: 1200-02-29\n" +
                            "Gender: MALE\n" +
                            "Email: theRealGrandma@gmail.com";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getterTest() {
        LocalDate date2 = LocalDate.of(2010, 7, 21);

        Assert.assertEquals("Red", person2.getName());
        Assert.assertEquals(date2, person2.getBirthday());
        Assert.assertEquals(Person.Sex.FEMALE, person2.getGender());
        Assert.assertEquals("red.riding@gmail.com", person2.getEmail());
    }

}
