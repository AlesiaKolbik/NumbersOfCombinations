package com.testpackage;
import  java.util.Scanner;
import java.lang.System;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int NumberN = in.nextInt();
        if (NumberN < 0 || NumberN > 20) {
            System.out.printf("Число %d не подходит, введите другое число: ", NumberN);
            NumberN = in.nextInt();
        }
        System.out.printf("Введите число M: ");
        int NumberM = in.nextInt();
        if (NumberM < 0 || NumberM > NumberN) {
            System.out.printf("Число не может быть отрицательным или больше N, повторите ввод: ");
            NumberM = in.nextInt();
        }
        int numerator = 1;
        int denominator = 1;
        for (int i = NumberN - NumberM + 1; i <= NumberN; i++) {
            numerator = numerator * i;
        }
        for (int j = 1; j <= NumberM; j++) {
            denominator = denominator * j;
        }
        int combinations = numerator / denominator;
        System.out.print("Ответ: " + combinations);
    }
}

