package com.lena.idea;

public class MyArrays {
    public void swapFirstAndLast(int[] array) {
        int buf = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = buf;
        System.out.println();
    }

    public void sumFirstAndMid(int[] array) {
        int sum = array[0]+array[array.length / 2];
        System.out.println("Сумма среднего и последнего элемента массива равна " + sum);
    }
}
