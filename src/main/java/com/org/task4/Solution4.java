package com.org.task4;


import org.apache.commons.lang3.StringUtils;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Solution4 {
    private final static String INPUT = "Введите текст, затем нажмите Enter и введите искомое слово: ";
    private final static String ERROR = "Ошибка. Введеные данные не являются целым числом.";


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(INPUT);
        try {
            System.out.print(formatOutput(in.nextLine(), in.nextLine()));
            in.close();
        } catch (InputMismatchException e) {
            System.out.println(ERROR);
        }
    }
    //форматированный вывод
    static String formatOutput(String text, String w) {
        return String.format("%s", Arrays.stream(text.split(" ")).filter(i->i.equals(w)).count());
    }

}
