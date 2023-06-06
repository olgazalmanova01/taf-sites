package by.itacademy.zalmanova.olga.taf.sites;

import com.github.javafaker.Faker;

public class Main2 {
    public static void main(String[] args) {
        char ch = 'a';
        char chU = Character.toUpperCase(ch);
        System.out.println(chU);
    }

    public static class Demo {
        public static void main(String[] args) {
            Faker faker = new Faker();
            String email = faker.internet().emailAddress();
            System.out.println(email);
            String password = faker.internet().password();
            System.out.println(password);
        }
    }
}
