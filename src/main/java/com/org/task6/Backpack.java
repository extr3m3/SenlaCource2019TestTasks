package com.org.task6;
import java.util.ArrayList;
import java.util.List;

class Backpack {
    private List<Item> bestItems = null;
    private double maxWeight;
    private double bestPrice;

    Backpack(double  maxWeight) {
        this.maxWeight = maxWeight;
    }

    //создание всех наборов перестановок значений
    void createAllSets(List<Item> items) {
        if (items.size() > 0)
            checkSet(items);

        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            createAllSets(newSet);
        }
    }

    //проверка, является ли данный набор лучшим решением
    private void checkSet(List<Item> items) {
        if (bestItems == null) {
            if (findWeight(items) <= maxWeight) {
                bestItems = items;
                bestPrice = findPrice(items);
            }
        } else {
            if (findWeight(items) <= maxWeight && findPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = findPrice(items);
            }
        }
    }

    //вычисляет общий вес набора предметов
    private double findWeight(List<Item> items) {
        double sumW = 0;

        for (Item i : items) {
            sumW += i.getWeigth();
        }

        return sumW;
    }

    //вычисляет общую стоимость набора предметов
    private double findPrice(List<Item> items) {
        double sumPrice = 0;

        for (Item i : items) {
            sumPrice += i.getPrice();
        }

        return sumPrice;
    }

    //возвращает решение задачи (набор предметов)
    List<Item> findBestSet() {
        return bestItems;
    }
}
