package com.org.task6;

import java.util.*;

public class Solution6 {

    public static void main(String[] args) {
        List <Item> items = new ArrayList<>();

        items.add(new Item("Журнал", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Нож", 4, 1500));
        items.add(new Item("Планшет", 2, 20000));
        items.add(new Item("Кружка", 1, 500));

        Backpack bp = new Backpack(5);
        bp.createAllSets(items);
        List<Item> solve = bp.findBestSet();
        solve.stream().map(Item::getName).forEach(System.out::println);

    }

}
