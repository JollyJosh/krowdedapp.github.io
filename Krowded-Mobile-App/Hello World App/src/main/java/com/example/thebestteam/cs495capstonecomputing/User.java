package com.example.thebestteam.cs495capstonecomputing;

/**
 * Created by Liam on 03/04/18.
 */

public class User {
    private boolean loggedIn;
    public boolean loggedin() { return loggedIn; }

    private String name;
    public String name() { return name; }

    private String email;
    public String email() { return email; }

    private int age;
    public int age() { return age; }

    private int sex;
    public int sex() { return sex; }

    private boolean isBusiness;
    public boolean isBusiness() { return isBusiness; }

    public User() {
        loggedIn = false;
        email = "nobody@loggedout.com";
        name = "Guest";
    }

    public void logIn(String uName, String uEmail, int uAge, int uSex, int uType) {
        loggedIn = true;
        name = uName;
        email = uEmail;
        age = uAge;
        sex = uSex;
        if (uType == 1) { isBusiness = true; } else isBusiness = false;
    }

    public void logOut() {
        loggedIn = false;
        email = "nobody@loggedout.com";
        name = "Guest";
        age = 0;
        sex = -1;
        isBusiness = false;
    }
}
