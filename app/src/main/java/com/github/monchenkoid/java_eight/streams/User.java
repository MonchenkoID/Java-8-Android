package com.github.monchenkoid.java_eight.streams;

import java.util.Date;

/**
 * @author Iryna Monchenko
 * @version on 14.04.2016
 */
public class User {
    private String fullName;
    private Date birthDate;
    private Date lastLogIn;

    public User(String fullName, Date birthDate, Date lastLogIn) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.lastLogIn = lastLogIn;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getLastLogIn() {
        return lastLogIn;
    }
}