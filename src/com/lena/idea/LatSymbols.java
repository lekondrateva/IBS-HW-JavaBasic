package com.lena.idea;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LatSymbols {
    public static void printOnlyLatWords() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        String[] strMass= str.split(" ");
        for (String mass : strMass) {
            if (mass.matches("^[a-zA-Z]*$")) {
                System.out.println(mass);
            }
        }
    }
}
