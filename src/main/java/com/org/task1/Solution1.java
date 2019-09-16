package com.org.task1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Solution1 {
    private final static String INPUT = "Введите целое число: ";
    private final static String PRIME = "простое";
    private final static String COMPOSITE = "составное";
    private final static String EVEN = "четное";
    private final static String ODD = "нечетное";
    private final static String ERROR = "Ошибка. Введеные данные не являются целым числом.";


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(INPUT);
        try {
            System.out.print(formatOutput(in.nextInt()));
            in.close();
        } catch (InputMismatchException e) {
            System.out.println(ERROR);
        }
    }
    //форматированный вывод
     static String formatOutput(int num) {
        return String.format("%s %s",
                isEven(num) ? EVEN : ODD,
                num < 2 ? "" : isPrime(num) ? PRIME : COMPOSITE).trim();
    }
    //проверка, является ли число четным
     static boolean isEven(int num) {
        return num % 2 == 0;
    }
    //проверка, является ли число целым
     static boolean isPrime(int num) {
        return num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }
}
