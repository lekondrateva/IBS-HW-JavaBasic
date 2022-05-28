package com.lena.idea;

import static java.lang.Math.abs;
import static java.lang.Math.random;

public class RandomInArray {
    public static void fillAndCheck() {
        int[] myArray = new int[15];
        for (int i = 0; i < myArray.length-1; i++) {
            myArray[i] = (int) (random() * 40 - 20);
             System.out.println(myArray[i]);
        }
        int max = 0;
        for (int j : myArray) {
            if (j > max)
                max = j;
        }
        int min = 0;
        for (int j : myArray) {
            if (j < min)
                min = j;
        }
        System.out.println("Максимум " + max);
        System.out.println("Минимум " + min);
        System.out.println("Наибольшее по модулю " + Math.max(abs(max),abs(min)));
    }
}
