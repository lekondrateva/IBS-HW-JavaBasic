package com.lena.idea;

import java.util.Scanner;

public class LatSymbols {
    public static void printOnlyLatWords() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        String[] strMass = str.split(" ");
        int count = 0;
        for (String mass : strMass) {
            if (mass.matches("^[a-zA-Z]*$")) {
                System.out.println(mass);
                count += 1;
            }
        }
        System.out.println(count);
    }
}
