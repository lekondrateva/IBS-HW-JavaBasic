package com.lena.idea;

import java.util.Scanner;

public class Puzzle {
    public static void dedPuzzle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Введите ответ: ");
        byte helpCount = 0;
        String answer;
        boolean exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit)
                break;
            answer = in.nextLine();
            switch (answer) {
                case ("Заархивированный вирус"):
                    System.out.println("Правильно!");
                    exit = true;
                    break;
                case ("Подсказка"):
                    if (i == 1) {
                        System.out.println("Подсказка: это айтишный дед. Введите ответ: ");
                        helpCount++;
                        i++;
                    } else {
                        System.out.println("Подсказка уже недоступна. Введите ответ: ");
                        i--;
                    }
                    break;
                default:
                    if ((i == 1) || (i == 2)) System.out.println("Подумай еще!");
                    else
                        System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}
