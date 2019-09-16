package com.org.task2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Solution2 {
    private final static String INPUT = "Введите два целых числа разделенных пробелом: ";
    private final static String GCD = "Наибольший общий делитель:";
    private final static String LCM = "Наименьшее общее кратное:";
    private final static String ERROR = "Ошибка. Введеные данные не являются целым числом.";


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(INPUT);
        try {
            System.out.print(formatOutput(in.nextLong(), in.nextLong()));
            in.close();
        } catch (InputMismatchException e) {
            System.out.println(ERROR);
        }
    }
    //форматированный вывод
    static String formatOutput(long a,long b) {
        return String.format("%s %s, %s %s", GCD,
                gcd(a,b), LCM, lcm(a,b));
    }
    //вычисление наибольшего общего делителя
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }
    //вычисление наименьшего общего кратного
    static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }
}
