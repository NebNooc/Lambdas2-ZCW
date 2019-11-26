package com.zipcode;


public class AgeTester implements CheckPerson {

    public boolean test(Person p) {
        if (p.getAge() >= 21)
            return true;
        return false;
    }
}
