package by.itacademy.zalmanova.olga.taf.sites;

import com.github.javafaker.Faker;

public class Faker2 {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i <10 ; i++) {
            String name = faker.name().name();
            System.out.println(name);
        }
    }
}
