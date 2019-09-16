package com.org.task6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Solution6Test {



    @Test
    public void testSolution6() {

        List<Item> items = new ArrayList<>();

        items.add(new Item("Журнал", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Нож", 4, 1500));
        items.add(new Item("Планшет", 2, 20000));
        items.add(new Item("Кружка", 1, 500));

        Backpack bp0 = new Backpack(2);
        bp0.createAllSets(items);
        List<Item> solve0 = bp0.findBestSet();

        Backpack bp1 = new Backpack(3);
        bp1.createAllSets(items);
        List<Item> solve1 = bp1.findBestSet();

        Backpack bp2 = new Backpack(4);
        bp2.createAllSets(items);
        List<Item> solve2 = bp2.findBestSet();


        assertEquals ( "Планшет", solve0.stream().map(Item::getName).collect(Collectors.joining(",")));
        assertEquals ( "Журнал,Планшет", solve1.stream().map(Item::getName).collect(Collectors.joining(",")));
        assertEquals ( "Бинокль,Планшет", solve2.stream().map(Item::getName).collect(Collectors.joining(",")));

    }
}

