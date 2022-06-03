package com.lena.idea;

import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class UsdRurConverter {
    public static void convertRurToUsd() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс RUR/USD");
        double usdExRate = in.nextDouble();
        System.out.println("Введите количество рублей для конвертации в USD");
        double rur = in.nextDouble();
        BigDecimal res = new BigDecimal(rur / usdExRate);
        System.out.println(res.setScale(2, RoundingMode.HALF_UP));
    }
}
