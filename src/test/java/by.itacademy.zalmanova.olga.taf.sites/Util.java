package by.itacademy.zalmanova.olga.taf.sites;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

public class Util {

    public static String generateEmail() {

        return generatePassword() + "@gmail.com";
    }

    public static String generatePassword() {

        byte[] array = new byte[new Random().nextInt(1, 20)];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }

}
