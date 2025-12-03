package com.pdp.online.tasks;

import com.github.javafaker.Faker;

public class MockData {
    public static User[] user() {
        var user = new User[10];
        var faker = new Faker();
        for (int i = 0; i < 10; i++) {
            user[i] = new User(faker.name().fullName(), faker.phoneNumber().cellPhone());
        }
        return user;
    }
}
