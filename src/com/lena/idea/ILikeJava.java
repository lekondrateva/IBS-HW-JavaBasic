package com.lena.idea;

public class ILikeJava {
    public static void checkTheLine(String a) {
        boolean first = a.contains("Java");
        boolean second = a.startsWith("I like");
        boolean third = a.endsWith("!!!");
        if (first && second && third) System.out.println(a.toUpperCase());
        System.out.println(a.replaceAll("a", "o").substring(7, 11));
    }
}
