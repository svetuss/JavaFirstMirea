package ru.mirea.task27.alternative.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class Dictionaries {
    public static Map<String, String> createMap() {
        Map<String, String> Dictionary = new HashMap<>();
        Dictionary.put("Федорова", "Светлана");
        Dictionary.put("Семенов", "Семен");
        Dictionary.put("Петров", "Семен");
        Dictionary.put("Гоголев", "Семен");
        Dictionary.put("Обоева", "Ксения");
        Dictionary.put("Кудлай", "Екатерина");
        Dictionary.put("Островских", "Анна");
        Dictionary.put("Васнецов", "Антон");
        Dictionary.put("Косован", "Максим");
        Dictionary.put("Иванов", "Антон");
        return Dictionary;
    }

    public static void deleteSameNames(Map<String, String> map) {
        ArrayList<String> valuesList = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            valuesList.add(pair.getValue());
        }
        for (String nameToTest : valuesList) {
            int count = 0;
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (nameToTest.equals(pair.getValue()))
                    count++;
            }
            if (count > 1) {
                Map<String, String> copy = new HashMap<>(map);
                for (Map.Entry<String, String> pair : copy.entrySet()) {
                    if (pair.getValue().equals(nameToTest))
                        map.remove(pair.getKey());
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Map<String, String> Dictionary = createMap();
        System.out.println("Изначальный словарь: ");
        System.out.println(Dictionary);
        deleteSameNames(Dictionary);
        System.out.println("Словарь с удаленными одинаковыми именами: ");
        System.out.println(Dictionary);
    }
}