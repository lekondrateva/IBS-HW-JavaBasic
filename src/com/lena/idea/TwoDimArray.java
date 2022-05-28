package com.lena.idea;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray {
    public static void printFirstLineOfArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] twoArray = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Введите значение элемента массива №" + (i + 1) + " , " + (j + 1));
                int buf = in.nextInt();
                twoArray[i][j] = buf;
            }
        }
            for (int j = 0; j < b; j++) {
                System.out.print(twoArray[0][j]*3+" ");
            }
        }
    }
