package com.lena.idea;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class CompareStringInt {
    public static void compare() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = in.nextLine();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println(max(parseInt(a), b));
        System.out.println((double) min(parseInt(a), b));
    }
}
