package com.lena.idea;

import java.util.Scanner;

public class ConstInArray {
    public static void findConstant(int x, int y, int z) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int l = in.nextInt();
        int[] myArray = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Введите значение элемента массива №" + (i + 1));
            int buf = in.nextInt();
            myArray[i] = buf;
        }
        for (int i = 0; i < l; i++) {
            if (myArray[i] == x) System.out.println("Данное значение " + x + " имеется в константах");
            else if (myArray[i] == y) System.out.println("Данное значение " + y + " имеется в константах");
            else if (myArray[i] == z) System.out.println("Данное значение " + z + " имеется в константах");
        }
    }
}

