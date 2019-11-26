package com.zipcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SocialNetwork {

    private static List<Person> socialNetwork;

    public SocialNetwork() {
        socialNetwork = new ArrayList<>();
    }

    public void add(Person person) { socialNetwork.add(person);
    }

    public static List<Person> get() {
        return socialNetwork;
    }

    public Integer size() {
        return socialNetwork.size();
    }

}
