package com.lena.idea;

import java.util.Scanner;

public class AVG_Arrays {
    public static void avgOfArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int l = in.nextInt();
        double[] myArray = new double[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Введите значение элемента массива №" + (i + 1));
            double buf = in.nextDouble();
            myArray[i] = buf;
        }
        double sum = 0;
        for (int i = 0; i < l; i++) {
            sum +=myArray[i];
        }
        double avg = sum/l;
        for (int i = 0; i < l; i++) {
            System.out.print(myArray[i]*avg + "  ");
        }
    }
}
