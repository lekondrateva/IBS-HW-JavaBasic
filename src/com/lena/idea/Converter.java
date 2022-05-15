package com.lena.idea;

import java.util.Scanner;

public class Converter {
    public static void convert() {
        final double FOOT = 1;
        final double YARD = 3;
        final double METER = 3.28;
        final double MILE = 5280;
        final double GR = 1;
        final double OZ = 28.35;
        final double POUND = 453.5911;
        final double KG = 1000;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите, что переводить: 1- масса, 2 - расстояние");
        byte x = in.nextByte();
        if (x == 1) {
            System.out.println("Выберите единицу измерения массы: 1- грамм, 2 - килограмм, 3 - унция, 4 - фунт");
            byte y = in.nextByte();
            System.out.println("Введите число");
            int z = in.nextInt();
            switch (y) {
                case 1: {
                    System.out.println("Граммы: " + z + '\n' + "Килограммы: " + z * GR / KG + '\n' + "Унции: " + z * GR / OZ + '\n' + "Фунты: " + z * GR / POUND + '\n');
                    break;
                }
                case 2: {
                    System.out.println("Килограммы: " + z + '\n' + "Граммы: " + z * KG / GR + '\n' + "Унции: " + z * KG / OZ + '\n' + "Фунты: " + z * KG / POUND + '\n');
                    break;
                }
                case 3: {
                    System.out.println("Унции: " + z + '\n' + "Граммы: " + z * OZ / GR + '\n' + "Килограммы: " + z * OZ / KG + '\n' + "Фунты: " + z * OZ / POUND + '\n');
                    break;
                }
                case 4: {
                    System.out.println("Фунты: " + z + '\n' + "Граммы: " + z * POUND / GR + '\n' + "Килограммы: " + z * POUND / KG + '\n' + "Унции: " + z * POUND / OZ + '\n');
                    break;
                }
                default: {
                    System.out.println("Некорректный ввод единицы измерения массы");
                    break;
                }
            }
        } else if (x == 2) {
            System.out.println("Выберите единицу измерения расстояния: 1- метр, 2 - миля, 3 - ярд, 4 - фут");
            byte y = in.nextByte();
            System.out.println("Введите число");
            int z = in.nextInt();
            switch (y) {
                case 1: {
                    System.out.println("Метры: " + z + '\n' + "Мили: " + z * METER / MILE + '\n' + "Ярды: " + z * METER / YARD + '\n' + "Футы: " + z * METER / FOOT + '\n');
                    break;
                }
                case 2: {
                    System.out.println("Мили: " + z + '\n' + "Метры: " + z * MILE / METER + '\n' + "Ярды: " + z * MILE / YARD + '\n' + "Футы: " + z * MILE / FOOT + '\n');
                    break;
                }
                case 3: {
                    System.out.println("Ярды: " + z + '\n' + "Метры: " + z * YARD / METER + '\n' + "Мили: " + z * YARD / MILE + '\n' + "Футы: " + z * YARD / FOOT + '\n');
                    break;
                }
                case 4: {
                    System.out.println("Футы: " + z + '\n' + "Метры: " + z * FOOT / METER + '\n' + "Мили: " + z * FOOT / MILE + '\n' + "Ярды: " + z * FOOT / YARD + '\n');
                    break;
                }
                default: {
                    System.out.println("Некорректный ввод единицы измерения расстояния");
                    break;
                }
            }
        } else System.out.println("Некорректный ввод");
    }
}
