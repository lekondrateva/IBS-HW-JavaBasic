package com.lena.idea;

import java.util.Scanner;

public class Equation {
    public static void resolve() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение длиной 5 символов");
        String equation = in.nextLine();
        if (equation.length() > 5)
            System.out.println("Не более 5 знаков!");
        else {
            char a = equation.charAt(0);
            char op = equation.charAt(1);
            char b = equation.charAt(2);
            char c = equation.charAt(4);
            if (op == '+') {
                if (a == 'x') System.out.println("x = " + (Character.getNumericValue(c) - Character.getNumericValue(b)));
                else if (b == 'x') System.out.println("x = " + (Character.getNumericValue(c) - Character.getNumericValue(a)));
                else if (c == 'x') System.out.println("x = " + (Character.getNumericValue(a) + Character.getNumericValue(b)));
            } else if (op == '-') {
                if (a == 'x') System.out.println("x = " + (Character.getNumericValue(b) + Character.getNumericValue(c)));
                else if (b == 'x') System.out.println("x = " + (Character.getNumericValue(a) - Character.getNumericValue(c)));
                else if (c == 'x') System.out.println("x = " + (Character.getNumericValue(a) - Character.getNumericValue(b)));
            } else System.out.println("Не удается распознать ввод");
        }
    }
}
