package com.org.task3;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Solution3 {
    private final static String INPUT = "Введите предложение: ";
    private final static String WORDCOUNT = "количество слов в предложении:";
    private final static String LCM = "Наименьшее общее кратное:";
    private final static String ERROR = "Ошибка. Введеные данные не являются целым числом.";


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(INPUT);
        try {
            System.out.print(formatOutput(in.nextLine()));
            in.close();
        } catch (InputMismatchException e) {
            System.out.println(ERROR);
        }
    }
    //форматированный вывод
    static String formatOutput(String s) {
        return String.format("%s (%s %d)", sortString(s),WORDCOUNT, getWordCount(s));
    }
    //вычисление количества слов в предложении
    static long getWordCount(String s){
        return s.split(" ").length;
    }
    //сортировка слов в предложении
    static String sortString(String s){
        return Arrays.stream(s.split(" ")).map(StringUtils::capitalize).sorted().collect(Collectors.joining(" "));
    }



}
