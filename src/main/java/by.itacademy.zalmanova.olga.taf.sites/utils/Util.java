package by.itacademy.zalmanova.olga.taf.sites.utils;

import com.github.javafaker.Faker;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

public class Util {
    Faker faker;
    public String generateEmail() {
        faker = new Faker();
        String email = faker.internet().emailAddress();
        return email;
    }
    public String generatePassword() {
        faker = new Faker();
        String password = faker.internet().password();
        return password;
    }
}
