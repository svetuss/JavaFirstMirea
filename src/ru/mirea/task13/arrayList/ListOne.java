package ru.mirea.task13.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
ArrayList является реализацией динамического массива объектов. Позволяет хранить любые данные, включая null в качестве элемента.
Его реализация основана на обычном массиве.
Данную реализацию следует применять, если в процессе работы с коллекцией предплагается частое обращение к элементам по индексу.
Но рекомендуется избегать, если требуется частое удаление/добавление элементов в середину коллекции.
Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.
 */

public class ListOne {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Russian");
        System.out.printf("There are %d language in the list: \n", languages.size());
        for (String states : languages) {
            System.out.println(states + " language.");
        }
        System.out.println();
        languages.add("Korean");
        languages.add(1, "Ukrainian");
        System.out.printf("Now we have added new elements. There are %d language in the list: \n", languages.size());
        for (String states : languages) {
            System.out.println(states + " language.");
        }
        if (languages.contains("Russian")) {
            System.out.println("The list contains the Russian language.");
        }
        System.out.println();
        System.out.print("Enter the index number from 0 to 3: ");
        Scanner in = new Scanner(System.in);
        int ind = in.nextInt();
        System.out.println("In the " + ind + " position is " + languages.get(ind));
        System.out.println();
        languages.set(1, "French");
        languages.remove("Russian");
        languages.remove(0);
        System.out.printf("We have changed the list. Now there are %d language in the list: \n", languages.size());
        String[] array = new String[languages.size()];
        languages.toArray(array);
        for (int i = 0; i< array.length; i++) {
            System.out.println(array[i] + " language.");
        }
    }
}
