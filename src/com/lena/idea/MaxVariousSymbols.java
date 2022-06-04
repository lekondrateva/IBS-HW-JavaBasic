package com.lena.idea;

import java.util.Scanner;

public class MaxVariousSymbols {
    public static void printWords() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = in.nextInt();
        //считываем перевод строки
        in.nextLine();
        //массив строк
        String[] wordsMass = new String[n];
        //массив длин строк
        int[] lengthMass = new int[n];
        for (int i = 0; i < wordsMass.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            wordsMass[i] = in.nextLine();
            // элементу массива длин строк присваиваем значение уникальных символов в строке
            lengthMass[i] = (int) wordsMass[i].chars().distinct().count();
        }
        //находим максимум в массиве длин строк
        int maxNum = lengthMass[0];
        for (int mass : lengthMass) {
            if (mass > maxNum)
                maxNum = mass;
        }
        // выводим на печать первый элемент массива строк, который содержит максимум уникальных символов
        int j = 0;
        while (!(lengthMass[j] == maxNum)) {
            j++;
        }
        System.out.println(wordsMass[j]);
    }
}
