package com.github.monchenkoid.java_eight.streams;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author Iryna Monchenko
 * @version on 14.04.2016
 */
public class Streams {

    public void blabla(){
        List<User> users = new ArrayList<User>();
        users.add(new User("john doe", new Date(), new Date()));
        users.add(new User("eric clapton", new Date(), new Date()));

// creates an anonymous class that implements Comparator
        Comparator<User> byName = new Comparator<User>() {
            @Override
            public int compare(User oneUser, User anotherUser) {
                return oneUser.getFullName().compareTo(anotherUser.getFullName());
            }
        };

// apply the sorting rule
        Collections.sort(users, byName);

        for (User user : users) {
            System.out.println(user.getFullName());
        }
    }

}
