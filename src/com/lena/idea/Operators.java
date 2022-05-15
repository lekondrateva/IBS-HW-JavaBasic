package com.lena.idea;

import java.util.Scanner;

public class Operators {
    public static void printAvg() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        System.out.println("Введите число y");
        int y = in.nextInt();
        System.out.println("Введите число z");
        int z = in.nextInt();
        double avg = (double) (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + avg);
        int halfAvg = (int) avg / 2;
        if (halfAvg > 3)
            System.out.println("Программа выполнена корректно");
    }
}
