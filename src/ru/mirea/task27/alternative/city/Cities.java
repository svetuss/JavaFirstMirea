package ru.mirea.task27.alternative.city;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cities {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> cities = new HashMap<>();
        ArrayList<String> Russia = new ArrayList<>();
        ArrayList<String> Norway = new ArrayList<>();
        ArrayList<String> Poland = new ArrayList<>();
        City cityOne = new City("Норвегия", "Осло");
        City cityThree = new City("Россия");
        City cityFive = new City("Польша");
        Norway.add(cityOne.getTown());
        Russia.add(cityThree.setTown("Уфа"));
        Poland.add(cityFive.setTown("Варшава"));
        cities.put("Россия", Russia);
        cities.put("Норвегия", Norway);
        cities.put("Польша", Poland);
        System.out.println(cities);
    }
}
