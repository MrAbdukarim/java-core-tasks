package com.pdp.online.tasks;

import java.util.Comparator;

public class User implements Comparator<User> {
    private String name;
    private String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getNameAndPhoneNumber() {
        return """
                --------------------------
                Name: %s | Phone Number: %s
                --------------------------
                """.formatted(this.name, this.phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compare(User o1, User o2) {
        return 0;
    }
}