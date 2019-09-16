package com.org.task5;


import java.util.*;
import java.util.stream.Collectors;


public class Solution5 {
    private final static String INPUT = "Введите длину последовательности ( до 100): ";
    private final static String ERROR = "Ошибка. Введеные данные не являются целым числом.";
    private final static String LIMIT = "Ошибка. Длина последовательности не должна превышать 100.";


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
        return num>100? String.format("%s", LIMIT):String.format("%s", findAllPalindromic(num));
    }
    //поиск всех полиндромов
    private static List<Integer> findAllPalindromic(int limit) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <= 9 && i <= limit; i++)
            set.add(i);

        boolean cont = true;
        for (int i = 1; cont; i++) {
            StringBuffer rev = new StringBuffer("" + i).reverse();
            cont = false;
            for (String d : ",0,1,2,3,4,5,6,7,8,9".split(",")) {
                int n = Integer.parseInt("" + i + d + rev);
                if (n <= limit) {
                    cont = true;
                    set.add(n);
                }
            }
        }
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }

}
