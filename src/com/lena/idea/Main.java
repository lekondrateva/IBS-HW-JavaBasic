package com.lena.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Задание №3 - работа с массивом
        int[] array1 = {1, 2, 3, 4, 5};
        MyArrays myArrays = new MyArrays();
        myArrays.swapFirstAndLast(array1);
        myArrays.sumFirstAndMid(array1);
        //Задание №4 - операторы
        Operators.printAvg();
    }
}
