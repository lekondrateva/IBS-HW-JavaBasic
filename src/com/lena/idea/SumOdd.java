package com.lena.idea;

import java.util.Scanner;

public class SumOdd {
    public static void sumOddNums() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            sum += i;
        }
        System.out.println("Сумма нечетных чисел равна " + sum);
    }
}
