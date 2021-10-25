package ru.mirea.task13.myList;

import java.util.Scanner;

public class ListThreeTest {
    public static void main(String[] args) {
        ListThree langs = new ListThree(10);
        langs.add("English");
        langs.add("Russian");
        langs.add("Korean");
        langs.add("French");
        System.out.printf("New. There are %d language in the list: \n", langs.size());
        for (int i=0; i<langs.size(); i++) {
            System.out.println(langs.get(i) + " language.");
        }
        System.out.println();
        System.out.print("Enter the index number from 0 to 3: ");
        Scanner in = new Scanner(System.in);
        int inde = in.nextInt();
        langs.add(inde, "Polish");
        langs.set(2, "German");
        System.out.printf("Add abd Set. There are %d language in the list: \n", langs.size());
        for (int i=0; i<langs.size(); i++) {
            System.out.println(langs.get(i) + " language.");
        }
        System.out.println();
        langs.remove(1);
        langs.remove(inde);
        System.out.printf("Remove. There are %d language in the list: \n", langs.size());
        for (int i=0; i<langs.size(); i++) {
            System.out.println(langs.get(i) + " language.");
        }
        if (langs.contains("Russian")) {
            System.out.println("The list contains the Russian language.");
        }
        else {
            System.out.println("No! The list does not contain the Russian language.");
        }
    }
}