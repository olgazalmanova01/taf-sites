package by.itacademy.zalmanova.olga.taf.sites;

public class Main {
    public static void main(String[] args) {
        String str = "qwetwyretrrytrj";
        char ch = str.charAt(1);
        System.out.println(ch);
        int j = (int) Math.floor(Math.random() * str.length());
        ch = str.charAt(j);
        System.out.println(ch);
    }
}
